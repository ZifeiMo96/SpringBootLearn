package com.example.demo.share.service.impl;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileSharedInfo.FileSharedInfoOp;
import com.example.demo.data.model.SourcelayFileSharedInfo;
import com.example.demo.permission.Permission;
import com.example.demo.share.service.service.ShareService;
import com.example.demo.util.ReturnStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dzy
 * @title: ShareImpl
 * @projectName demo
 * @description:
 * @date 2020/11/3019:44
 */
@Service("shareService")
public class ShareImpl implements ShareService {
    @Autowired
    Permission permission;
    @Autowired
    FileSharedInfoOp fileSharedInfoOp;
    @Autowired
    FileInfoOp fileInfoOp;

    @Override
    public long CreateShareFileByAll(SourcelayFileSharedInfo sourcelayFileSharedInfo) {
        // 没有权限 不能分享
        if (!permission.IsOwner(sourcelayFileSharedInfo.getUserId(),
                sourcelayFileSharedInfo.getFileId()))
            return ReturnStatus.FailedPermission.NotOwner;
        // 尝试创建
        long status = fileSharedInfoOp.ShareFileByAll(sourcelayFileSharedInfo);
        if (status < 0)
            return status;
        // 创建成功后尝试更新file的share状态
        if(!fileInfoOp.SetIsShared(sourcelayFileSharedInfo.getFileId(), (byte) 1))
            return ReturnStatus.FailedOperation.UpdateInfo;
        return status;
    }

    @Override
    public boolean CreateShareFileByDefault(long userId, long fileId) {
        // 没有权限 不能分享
        if (!permission.IsOwner(userId,fileId))
            return false;
        // 返回是否创建成功
        return fileSharedInfoOp.ShareFileByDefault(userId, fileId);
    }

    @Override
    public long UpdateShareFile(SourcelayFileSharedInfo sourcelayFileSharedInfo) {
        // 没有权限 不能修改
        if (!permission.IsSharedOwner(sourcelayFileSharedInfo.getId(),
                sourcelayFileSharedInfo.getUserId()))
            return ReturnStatus.FailedPermission.NotOwner;
        return fileSharedInfoOp.Update(sourcelayFileSharedInfo);
    }

    @Override
    public long CancelAllSharedFile(long userId, long fileId) {
        // 没有权限 不能修改
        if (!permission.IsOwner(userId, fileId))
            return ReturnStatus.FailedPermission.NotOwner;
        return fileSharedInfoOp.CancelAllSharedFile(userId, fileId);
    }

    @Override
    public long CancelSharedFile(long id, long userId) {
        // 没有权限 不能修改
        if (!permission.IsSharedOwner(id,userId))
            return ReturnStatus.FailedPermission.NotOwner;
        // 返回是否修改成功
        // TODO 修改
//        return fileSharedInfoOp.CancelSharedFile(userId, fileId);
        return fileSharedInfoOp.CancelSharedFile(id, userId);
    }

    @Override
    public long CancelCancelSharedFile(long id, long userId) {
        // 没有权限 不能修改
        if (!permission.IsSharedOwner(id,userId))
            return ReturnStatus.FailedPermission.NotOwner;
        // 返回是否修改成功
        return fileSharedInfoOp.CancelCancelSharedFile(id);
    }
}
