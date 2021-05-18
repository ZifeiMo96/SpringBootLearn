package com.example.demo.util;

/**
 * @author dzy
 * @title: ReturnStatus
 * @projectName demo
 * @description: 记录返回的status值
 * @date 2020/12/221:20
 */
public class ReturnStatus {
    /**正常*/
    public static final class Normal{
        /**运行正常*/
        public static final long AllRight = 0;//运行正常
    }
    /**操作失败*/
    public static final class FailedOperation{
        /**操作失败默认值*/
        public static final long Failed = -100;
        /**更新信息失败*/
        public static final long UpdateInfo = -101;
        /**获取信息失败*/
        public static final long GetInfo = -102;
    }
    /**文件操作失败*/
    public static final class FailedFile{
        /**添加文件失败*/
        public static final long AddFile = -200;
        /**取消分享文件失败*/
        public static final long CancelFile = -201;
        /**撤销取消分享文件失败*/
        public static final long CancelCancelFile = -202;
        /**上传文件失败：存在同名文件*/
        public static final long AlreadyExists = -203;
        /**上传文件失败：前缀不符合/users/{userId}格式*/
        public static final long PrefixNotFit = -204;

        /**下载文件失败*/
        public static final long DownloadFile = -300;
        /**文件下载超时*/
        public static final long DownloadFileOutTime = -301;
        /**删除文件失败*/
        public static final class FailedDeleteFile {
            /**删除文件失败默认值*/
            public static final long Failed = -400;
            /**删除普通文件失败默认值*/
            public static final long DeleteNormalFile = -401;
            /**删除分享文件失败默认值*/
            public static final long DeleteSharedFile = -402;
        }
    }
    /**点赞相关操作失败*/
    public static final class FailedLike{
        /**点赞失败默认值*/
        public static final long AddFile = -500;
        /**数据库操作失败*/
        public static final long DataBase = -501;
        /**点赞已存在*/
        public static final long Exist = -502;
        /**点赞不存在*/
        public static final long NotExist = -503;
    }
    /**权限错误*/
    public static final class FailedPermission{
        /**权限错误默认值*/
        public static final long Failed = -700;
        /**权限错误：私密文件*/
        public static final long Private = -701;
        /**权限错误：没有此文件权限*/
        public static final long NotHavePermission = -702;
        /**权限错误：不是此文件拥有者*/
        public static final long NotOwner = -703;
        /**权限错误：密码错误*/
        public static final long Password = -704;
        /**权限错误：余额不足*/
        public static final long InsufficientFund = -705;
    }
    /**违规操作*/
    public static final class InvalidOperation{
        /**违规操作默认值*/
        public static final long Failed = -800;
        /**存在不合规词汇*/
        public static final long Words = -801;
    }
}
