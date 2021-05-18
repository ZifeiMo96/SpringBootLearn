package com.example.demo.file.controller;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.file.service.service.FileDeleteService;
import com.example.demo.file.service.service.FileDownloadService;
import com.example.demo.file.service.service.FileUploadService;
import com.example.demo.permission.Permission;
import com.example.demo.util.ReturnStatus;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    FileDeleteService fileDeleteService;
    @Autowired
    FileUploadService fileUploadService;
    @Autowired
    FileDownloadService fileDownloadService;
    @Autowired
    Permission permission;
    @Autowired
    FileInfoOp fileInfoOp;


    @PostMapping("/getFileDownloadUrl")
    public String getFileDownloadUrl(@RequestParam("userId") long uid,
                                     @RequestParam("fileId") long id,
                                     @RequestParam("minutes") int minutes) {
        String message;
        if(permission.IsOwner(uid,id)){
            message =  fileDownloadService.DownloadFile(id, minutes);
        }
        else{
            message =  "-703";
        }
        if(message == null){
            message = "-4";
        }
        return message;
    }

    @PostMapping("/getShareDownloadUrl")
    public String getShareDownloadUrl(@RequestParam("userId") long uid,
                                      @RequestParam("shareId") long id,
                                      @RequestParam("minutes") int minutes) {
        String message = null;
        if(permission.IsPublic(id)){
            message =  fileDownloadService.DownloadShareFile(id, minutes);
        }else{
            if (permission.IsSharedOwner(id, uid)) {
                message =  fileDownloadService.DownloadShareFile(id, minutes);
            }else{
                if(permission.IsPurchased(uid, id)){
                    message = fileDownloadService.DownloadShareFile(id, minutes);
                }else{
                    message = "-702";
                }
            }
        }
        if(message == null) {
            message = "-4";
        }
        return message;
    }

    @PostMapping("/getShareDownloadUrlByPassword")
    public String getShareDownloadUrlByPassword(@RequestParam("shareId") long id,
                                                @RequestParam("password") String pwd,
                                                @RequestParam("minutes") int minutes){
        String message;
        if(permission.IsPwdRight(id,pwd)){
            message = fileDownloadService.DownloadShareFile(id, minutes);
        }else {
            message = "-704";
        }
        if(message == null){
            message = "-4";
        }
        return message;
    }


    /**
     * 返回部分存储文件信息以及签发腾讯云COS签名
     * @param userId 文件所有者id
     * @param name 文件名
     * @param type 文件类型
     * @param size 文件大小
     * @param folder 文件路径
     * @return 文件guid以及腾讯云COS临时密钥
     */
    @PostMapping("/requestUploadURL")
    public String requestUploadURL(@RequestParam(value = "userId") Long userId,
                                                @RequestParam(value = "name") String name,
                                                @RequestParam(value = "type") String type,
                                                @RequestParam(value = "size") Long size,
                                                @RequestParam(value = "folder") String folder) {
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> returnMap = new HashMap<>(2);

        //判断是否已经存在相同的文件
        if(fileInfoOp.cheakFileExist(folder, name)){
            return String.valueOf(ReturnStatus.FailedFile.AlreadyExists);
        }
        //判断前缀是否合法
        String prefix = "/"+"users"+"/"+userId.toString()+"/";
        if(!folder.startsWith(prefix)){
            return String.valueOf(ReturnStatus.FailedFile.PrefixNotFit);
        }

        map.put("userId", userId);
        map.put("name", name);
        map.put("type", type);
        map.put("size", size);
        map.put("folder", folder);

        Map<String, Object> tempMap =  fileUploadService.requestUpload(map);
        String key = (String) tempMap.get("storagePath");
        returnMap.put("guid", tempMap.get("uuid"));
        //如果是个文件夹，就不签发url
        if(!"text/directory".equals(map.get("type"))) {
            String url = fileUploadService.getUploadUrl(key, 30);
            returnMap.put("url", url);
        }
        return gson.toJson(returnMap);
    }

    /**
     * @param id 文件主键
     * @return 返回成功或者失败
     * <p>
     * 前端上传文件至COS完毕后调用此函数，服务端从腾讯云获取相关文件MD5存至数据库中
     * @author zry
     */
    @PostMapping("/insureUploadSuccessfully")
    public Boolean insureUploadSuccessfully(@RequestParam("userId") long uid, @RequestParam(value = "fileId") Long id) {
        if(!permission.IsOwner(uid,id)){
            return false;
        }
        return fileUploadService.insureUploadSuccess(id);
    }

    @PostMapping("/deleteFile")
    public int deleteFile(@RequestParam("userId") long uid,
                           @RequestParam("fileId") long fid){
        if(permission.IsOwner(uid,fid)) {
            return fileDeleteService.DeleteFile(uid, fid);
        }else {
            return -703; // 用户没有权限;
        }
    }
}
