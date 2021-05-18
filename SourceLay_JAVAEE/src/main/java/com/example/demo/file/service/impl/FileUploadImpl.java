package com.example.demo.file.service.impl;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.data.model.SourcelayFileInfo;
import com.example.demo.file.CosConfig;
import com.example.demo.file.service.service.FileUploadService;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.http.HttpMethodName;
import com.qcloud.cos.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service("fileUploadService")
public class FileUploadImpl implements FileUploadService {
    private static final CosConfig cosConfig = new CosConfig();

    /**
     * 获取预签名上传链接
     * @param key
     * @return
     */
    @Override
    public String getUploadUrl(String key, int minutes) {
        // 生成 cos 客户端。
        COSClient cosClient = CosConfig.GetCosClient();
        // 设置签名过期时间(可选), 若未进行设置, 则默认使用 ClientConfig 中的签名过期时间(1小时)
        // 这里设置签名在半个小时后过期
        Date expirationTime = new Date(System.currentTimeMillis() + minutes * 60L * 1000L);
        URL url = cosClient.generatePresignedUrl(cosConfig.bucketName, key, expirationTime, HttpMethodName.PUT);
        cosClient.shutdown();
        return url.toString();
    }

    /**
     * 前端上传成功后请求的方法，更新数据库
     * @param key
     * @return
     */
    @Autowired
    FileInfoOp fileInfoOp;
    @Override
    public String afterUpload(SourcelayFileInfo sourcelayFileInfo) {
        // TODO 判断和清理腾讯云对象存储中多出来的文件
        // TODO 设置类属性
        fileInfoOp.AddFileInfo(sourcelayFileInfo);
        return null;
    }

    /**
     * 解析用户上传请求，将主要信息存储在数据库中
     * @param map
     * @return 返回key
     */
    @Override
    public Map<String, Object> requestUpload(Map<String, Object> map) {
        Map<String, Object> returnmap = new HashMap<>();
        String uuid = UUID.randomUUID().toString();
        String folder = (String) map.get("folder");
        String[] folderArray = folder.split("/");
        //判断folder中有没有未创建的文件夹
        int layer = cheakAllFolderExisted(map,folder,folderArray);
        //如果有未创建的文件夹，将其补充创建
        if (layer>0){
            addNeededFolder(map,folder,folderArray,layer);
        }

        //判断是否是文件夹
        if("text/directory".equals(map.get("type"))){
            //如果是文件夹 我们直接将东西存进去 就不用设置StoragePath和RandomID以及返回给前端腾讯云的URL了
            map.put("randomId", uuid);
            map.put("status",(short)1);
            fileInfoOp.addEarlyFileInfo(map);
            returnmap.put("uuid", uuid);
            returnmap.put("storagePath","");
            return returnmap;
        }

        String key = getKey(map, uuid);

        map.put("randomId", uuid);
        map.put("storageName",key);
        map.put("status",(short)0);

        fileInfoOp.addEarlyFileInfo(map);
        returnmap.put("uuid",uuid);
        returnmap.put("storagePath",key);

        return returnmap;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Boolean insureUploadSuccess(Long id){
        String storageName = fileInfoOp.getStorageName(id);
        COSClient cosClient = CosConfig.GetCosClient();
        try {
            ObjectMetadata objectMetadata = cosClient.getObjectMetadata(cosConfig.bucketName, storageName);
            String MD5 = objectMetadata.getETag();
            System.out.println(MD5);
            return fileInfoOp.setMD5(id, MD5);
        }catch(com.qcloud.cos.exception.CosServiceException e){
            return false;
        }
    }

    /***
     * 检查是否路径中所有出现的文件夹都存在
     * @param map
     * @param folder
     * @param folderArray
     * @return 如果全部都存在，返回0；否则返回缺失的层次
     */
    public int cheakAllFolderExisted(Map<String, Object> map,String folder,String[] folderArray){
        for(int i= folderArray.length-1;i>=1;i--){
            String temp = "";
            String name = folderArray[i];
            for(int j =0;j<i;j++){
                temp += folderArray[j]+"/";
            }
            //如果文件夹存在，则跳出循环
            if(fileInfoOp.cheakFolderExist(temp,name)){
                return i;
            }
        }
        return 0;
    }

    /**
     * 增加缺失的文件夹
     * @param map
     * @param folder
     * @param folderArray
     * @param layer
     */
    public void addNeededFolder(Map<String, Object> map,String folder,String[] folderArray,int layer){
        //如果说tampi就等于第一次的i值，证明文件夹存在。没啥大问题，如果不等于，那么执行下列操作补全缺失的文件夹层次
        if(layer != folderArray.length-1){
            for(int i=layer;i<folderArray.length-1;i++){
                String missFolder = "";
                String missFolderName = folderArray[i+1];
                for(int j=0;j<=i;j++){
                    missFolder+=folderArray[j]+"/";
                }

                //那么，我们就一层一层的吧文件夹给加上去
                Map<String,Object> tempmap = new HashMap<>();
                tempmap.put("name", missFolderName);
                tempmap.put("userId",map.get("userId"));
                tempmap.put("type","text/directory");
                tempmap.put("size",(long)0);
                tempmap.put("folder",missFolder);
                tempmap.put("randomId",UUID.randomUUID().toString());
                tempmap.put("status",(short)1);
                fileInfoOp.addEarlyFileInfo(tempmap);
            }
        }
    }

    public String  getKey(Map<String, Object> map,String uuid){
        String filename = (String) map.get("name");
        String[] str = filename.split("\\.");
        int strlength = str.length;

        String key1 = "" + uuid.charAt(0) + uuid.charAt(1);
        String key2 = "" + uuid.charAt(2) + uuid.charAt(3);
        if (strlength >= 2){
            return String.format("/%s/%s/%s.%s", key1, key2, uuid, str[strlength-1]);
        }
        else{
            return String.format("/%s/%s/%s", key1, key2, uuid);
        }
    }
}
