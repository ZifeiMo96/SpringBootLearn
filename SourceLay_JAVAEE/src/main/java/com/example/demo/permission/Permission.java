package com.example.demo.permission;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.DbOp.fileSharedOrder.FileSharedOrderOp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dzy
 * @title: Permission
 * @projectName demo
 * @description: 权限工具类
 * @date 2020/12/113:03
 */
@Service("permission")
public class Permission {
    @Autowired
    FileSharedOrderOp fileSharedOrderOp;

    @Autowired
    FileInfoOp fileInfoOp;

    @Autowired
    FileSharedInfoOp fileSharedInfoOp;
    /**
     * 判断用户是否购买过某文件
     * @param userId
     * @param shareId
     * @return
     */
    public boolean IsPurchased(long userId, long shareId) {
        return fileSharedOrderOp.IsPurchase(userId, shareId);
    }

    /**
     * 判断用户是否是某文件的拥有者
     * @param userId
     * @param fileId
     * @return
     */
    public boolean IsOwner(long userId, long fileId) {
        return fileInfoOp.IsFileOwner(userId,fileId);
    }

    /**
     * 判断某文件是否为公开文件
     * @param id
     * @return
     */
    public boolean IsPublic(long id) { return fileSharedInfoOp.IsPublic(id);
    }

    /**
     * 判断是否是某个分享的所有者
     * @param id
     * @param userId
     * @return
     */
    public boolean IsSharedOwner(long id, long userId) { return fileSharedInfoOp.IsSharedOwner(id,userId); }

    public boolean IsLike(long id, long userId, long fileId) {
        return !IsOwner(userId, fileId) &&// 文件拥有者不能点赞
//        (fileSharedInfoOp.GetSharedType(id) == 1 && IsPurchased(userId, fileId)); // 付费资源购买后才能点赞

        fileSharedInfoOp.NotDeleted(id);
    }

    /**
     * 判断密码是否正确
     * @param shareId  分享文件的ID
     * @param password  分享文件的密码
     */
    public boolean IsPwdRight(long shareId,String password){
        return (password.equals(fileSharedInfoOp.GetSharePassword(shareId)));
    }
}
