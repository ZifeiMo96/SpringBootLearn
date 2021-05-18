package com.example.demo.file.service.impl;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.file.CosConfig;
import com.example.demo.file.service.service.FileDownloadService;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.http.HttpMethodName;
import com.qcloud.cos.model.GeneratePresignedUrlRequest;
import com.qcloud.cos.region.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.Date;

@Service("fileDownloadService")
public class FileDownloadImpl implements FileDownloadService {

    private static CosConfig cosConfig = new CosConfig();

    @Autowired
    FileInfoOp fileInfoOp;
    @Autowired
    FileSharedInfoOp fileSharedInfoOp;
    /**
     *
     * @param key 文件地址
     * @param minutes 文件有效期/分钟
     * @return 文件下载链接
     */
    @Override
    public String GetDownloadUrl(String key, int minutes) {
        // 生成 cos 客户端。
        COSClient cosClient = CosConfig.GetCosClient();
        // 存储桶的命名格式为 BucketName-APPID，此处填写的存储桶名称必须为此格式
        GeneratePresignedUrlRequest req =
                new GeneratePresignedUrlRequest(cosConfig.bucketName, key, HttpMethodName.GET);
        // 设置签名过期时间(可选), 若未进行设置, 则默认使用 ClientConfig 中的签名过期时间(1小时)
        Date expirationDate = new Date(System.currentTimeMillis() + minutes * 60L * 1000L);
        req.setExpiration(expirationDate);
        URL url = cosClient.generatePresignedUrl(req);
        cosClient.shutdown();
        return url.toString();
    }

    /**
     *
     * @param fid
     * @param minutes
     * @return
     */
    @Override
    public String DownloadFile(long fid, int minutes) {
        //根据文件信息获得对应的Key
        String key = fileInfoOp.GetKey(fid);
        if(key == null){
            return null;
        }
        if(fileInfoOp.GetFileType(fid).equals("text/directory")){
            return null;
        }
        //文件下载次数+1
        fileInfoOp.AddDownloadCount(fid);
        return GetDownloadUrl(key,minutes);
    }

    @Override
    public String DownloadShareFile(long sid, int minutes) {
        //根据分享信息获得对应的文件id
        long fid = fileSharedInfoOp.GetFileIdOfShare(sid);
        //如果分享不存在或文件不允许分享，则返回空Url
        if(fid == 0)
            return null;
        //分享下载次数+1
        fileSharedInfoOp.AddDownloadCount(sid);
        return DownloadFile(fid,minutes);
    }
}
