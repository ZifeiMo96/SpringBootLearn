package com.example.demo.share.service.service;

import com.example.demo.data.model.SourcelayFileSharedInfo;

/**
 * @author dzy
 * @title: ShareService
 * @projectName demo
 * @description:
 * @date 2020/11/3019:45
 */
public interface ShareService {
    // 使用完整信息创建分享文件
    public long CreateShareFileByAll(SourcelayFileSharedInfo sourcelayFileSharedInfo);
    // 只使用用户id和文件id以默认方式创建分享文件
    public boolean CreateShareFileByDefault(long userId,long fileId);
    // 更新
    public long UpdateShareFile(SourcelayFileSharedInfo sourcelayFileSharedInfo);
    // 取消某文件的所有分享
    public long CancelAllSharedFile(long userId, long fileId);
    // 取消某分享
    public long CancelSharedFile(long id, long userId);
    // 撤销取消分享
    public long CancelCancelSharedFile(long id, long userId);
}
