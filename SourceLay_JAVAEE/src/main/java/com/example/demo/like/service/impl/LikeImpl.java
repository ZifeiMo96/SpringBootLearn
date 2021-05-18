package com.example.demo.like.service.impl;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.fileLikeInfo.FileLikeInfoOp;
import com.example.demo.like.service.service.LikeService;
import com.example.demo.permission.Permission;
import com.example.demo.util.ReturnStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dzy
 * @title: LikeImpl
 * @projectName demo
 * @description:
 * @date 2020/11/3015:15
 */
@Service("likeService")
public class LikeImpl implements LikeService {
    @Autowired
    Permission permission;
    @Autowired
    FileLikeInfoOp fileLikeInfoOp;
    @Autowired
    FileInfoOp fileInfoOp;

    @Override
    public long Like(long id, long userId, long fileId, boolean like) {
        //判断是否有效
        if (!permission.IsLike(id, userId, fileId))
            return ReturnStatus.FailedPermission.Failed;
        // 根据like决定是取消还是点赞
        if (like) {
            if (fileLikeInfoOp.IsLikeExist(userId,fileId)){
                return ReturnStatus.FailedLike.Exist;
            } else {
                fileInfoOp.LikeCount(fileId,true);
                return fileLikeInfoOp.AddLike(userId,fileId);
            }
        } else {
            if (fileLikeInfoOp.IsLikeExist(userId, fileId)) {
                fileInfoOp.LikeCount(fileId,false);
                return fileLikeInfoOp.DeleteLike(userId,fileId);
            } else {
                return ReturnStatus.FailedLike.NotExist;
            }
        }
    }
}
