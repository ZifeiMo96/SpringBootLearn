package com.example.demo.file.service.impl;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.file.service.service.FileDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fileDeleteService")
public class FileDeleteImpl implements FileDeleteService {

    @Autowired
    FileInfoOp fileInfoOp;
    @Autowired
    FileSharedInfoOp fileSharedInfoOp;


    @Override
    public int DeleteFile(long uid, long fid) {
        switch(fileInfoOp.DeleteFileInfo(fid)){
            case 0:
                if(fileSharedInfoOp.DeleteFileShareInfo(fid))
                    return 0;   //TAG0: 操作成功
                else
                    return -402;   // TAG3: 分享文件删除失败
            case 1:
                return -401;   //TAG1: 文件删除失败
            case 2:
                return -4;   //TAG2: 文件不存在
            case 6:
                return -403;
            default:
                return -9;  //5: 未知错误
        }
    }
}
