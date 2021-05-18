package com.example.demo.DbOp.fileSharedInfo;

import com.example.demo.data.dao.SourcelayFileInfoSqlProvider;
import com.example.demo.data.dao.SourcelayFileSharedInfoMapper;
import com.example.demo.data.model.SourcelayFileLikeInfoExample;
import com.example.demo.data.model.SourcelayFileInfo;
import com.example.demo.data.model.SourcelayFileSharedInfo;
import com.example.demo.data.model.SourcelayFileSharedInfoExample;
import com.example.demo.data.model.*;
import com.example.demo.util.ReturnStatus;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @author dzy
 * @title: FileSharedInfoOp
 * @projectName demo
 * @description:
 * @date 2020/11/2822:45
 */

@Service("fileSharedInfoOp")
public class FileSharedInfoOp {

    @Autowired
    SourcelayFileSharedInfoMapper sourcelayFileSharedInfoMapper;

    /**
     * 判断分享是否已经存在
     * @param id
     * @return
     */
    public boolean IsSharedExist(long id) {
        return sourcelayFileSharedInfoMapper.selectByPrimaryKey(id) != null;
    }

    /**
     * 获取当前最大id，如果为空返回-1
     * @return
     */
    public long MaxId() {
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id DESC");
        List<SourcelayFileSharedInfo> list = sourcelayFileSharedInfoMapper.selectByExample(example);
        if (list.isEmpty())
            return -1;
        return list.get(0).getId();
    }

    /**
     * 以默认状态分享文件
     * @param fileId 文件id
     * @param userId 用户id
     * @return
     */
    public boolean ShareFileByDefault(long userId,long fileId) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo = new SourcelayFileSharedInfo();
        long id = MaxId() + 1;
        sourcelayFileSharedInfo.setId(id);
        sourcelayFileSharedInfo.setFileId(fileId);
        sourcelayFileSharedInfo.setUserId(userId);
//        sourcelayFileSharedInfo.setSharedDesc(null);
        sourcelayFileSharedInfo.setSharedType((short) 0);
//        sourcelayFileSharedInfo.setPassword(null);
        sourcelayFileSharedInfo.setIsAnonymous((byte) 0);
        sourcelayFileSharedInfo.setCost(0);
        sourcelayFileSharedInfo.setViewCount(0);
        sourcelayFileSharedInfo.setDownloadCount(0);
        sourcelayFileSharedInfo.setIsRecommended((byte) 0);
        sourcelayFileSharedInfo.setCreatedAt(new Date());
//        sourcelayFileSharedInfo.setDeletedAt(new Date());
//        sourcelayFileSharedInfo.setDeletedId(0l);
        return sourcelayFileSharedInfoMapper.insert(sourcelayFileSharedInfo) == 1;
    }

    /**
     * 以完整信息分享文件
     * @param sourcelayFileSharedInfo
     * @return 是否添加成功
     */
    public long ShareFileByAll(SourcelayFileSharedInfo sourcelayFileSharedInfo) {
        sourcelayFileSharedInfo.setId(MaxId() + 1);
        sourcelayFileSharedInfo.setCreatedAt(new Date());
        sourcelayFileSharedInfo.setDownloadCount(0);
        sourcelayFileSharedInfo.setViewCount(0);
        if (sourcelayFileSharedInfoMapper.insert(sourcelayFileSharedInfo) != 1)
            return -1;
        return sourcelayFileSharedInfo.getId();
    }

    /**
     * 通过userId和fileId搜索
     * @param userId
     * @param fileId
     * @return
     */
    public List<SourcelayFileSharedInfo> GetByUserFileId(long userId, long fileId) {
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria =
                example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andFileIdEqualTo(fileId);
        example.or(criteria);
        List<SourcelayFileSharedInfo> list =
                sourcelayFileSharedInfoMapper.selectByExample(example);
        if (list.size() == 0)
            return null;
        return list;
    }
    /**
     * 用户设置文件的分享描述
     * @param id
     * @param description 描述
     * @return 返回是否设置成功
     */
    public boolean SetSharedDescription(long id,String description) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return false;
        sourcelayFileSharedInfo.setSharedDesc(description);
        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
    }

    /**
     * 设置文件分享类型
     * @param type 1密码 2给钱
     * @return 返回是否设置成功
     */
    public boolean SetSharedType(long id, short type) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return false;
        //修改文件类型
        sourcelayFileSharedInfo.setSharedType(type);
        return sourcelayFileSharedInfoMapper.
                updateByPrimaryKeySelective(sourcelayFileSharedInfo) == 1;
    }


    public boolean IsFileShareExist(long fid){
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fid);
        example.or(criteria);
        return sourcelayFileSharedInfoMapper.countByExample(example) != 0;
    }

    public boolean DeleteFileShareInfo(long fid){
        if(!IsFileShareExist(fid))
            return true;
        SourcelayFileSharedInfo fileShare = new SourcelayFileSharedInfo();
        fileShare.setDeletedAt(new Date());
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fid);
        example.or(criteria);
        int i=sourcelayFileSharedInfoMapper.updateByExampleSelective(fileShare,example) ;
        return i>0;
    }


//    /**
//     * 设置文件分享密码
//     * @param userId
//     * @param fileId
//     * @param password 密码
//     * @return 是否设置成功
//     */
//    public boolean SetSharedPassword(long userId, long fileId, String password) {
//        SourcelayFileSharedInfo sourcelayFileSharedInfo = GetByUserFileId(userId, fileId);
//        if (sourcelayFileSharedInfo == null)
//            return false;
//        //修改密码
//        sourcelayFileSharedInfo.setPassword(password);
//        return sourcelayFileSharedInfoMapper.
//                updateByPrimaryKeySelective(sourcelayFileSharedInfo) == 1;
//    }

//    /**
//     * 设置文件是否匿名分享
//     * @param userId
//     * @param fileId
//     * @param isAnonymous 0非匿名 1匿名
//     * @return 返回是否设置成功
//     */
//    public boolean SetIsAnonymous(long userId, long fileId, Byte isAnonymous) {
//        SourcelayFileSharedInfo sourcelayFileSharedInfo = GetByUserFileId(userId, fileId);
//        if (sourcelayFileSharedInfo == null)
//            return false;
//        sourcelayFileSharedInfo.setIsAnonymous(isAnonymous);
//        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
//    }
//
//    /**
//     * 设置文件所需要的积分
//     * @param userId
//     * @param fileId
//     * @param cost 积分
//     * @return 是否设置成功
//     */
//    public boolean SetCost(long userId, long fileId, int cost) {
//        SourcelayFileSharedInfo sourcelayFileSharedInfo = GetByUserFileId(userId, fileId);
//        if (sourcelayFileSharedInfo == null)
//            return false;
//        sourcelayFileSharedInfo.setCost(cost);
//        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
//    }

    /**
     * 文件浏览量+1
     * @param id 文件id
     * @return 返回是否自增成功
     */
    public boolean AddViewCount(long id) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return false;
        sourcelayFileSharedInfo.setViewCount(
                sourcelayFileSharedInfo.getViewCount() + 1);
        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
    }

    /**
     * 将分享文件的下载量加1
     * @param id
     */
    public boolean AddDownloadCount(long id) {
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        // 没有该分享文件则不需要处理下载量
        if (sourcelayFileSharedInfo == null)
            return false;
        // 下载量+1
        sourcelayFileSharedInfo.setDownloadCount(
                sourcelayFileSharedInfo.getDownloadCount()+1);
        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
    }

//    /**
//     * 设置id文件的推荐状态 0为不推荐 1为推荐
//     * @param userId
//     * @param fileId
//     * @param isRecommended
//     * @return 返回是否设置成功
//     */
//    public boolean SetIsRecommended(long userId, long fileId, Byte isRecommended) {
//        SourcelayFileSharedInfo sourcelayFileSharedInfo = GetByUserFileId(userId, fileId);
//        if (sourcelayFileSharedInfo == null)
//            return false;
//        sourcelayFileSharedInfo.setIsRecommended(isRecommended);
//        if (isRecommended == 1)//推荐时记录推荐时间
//            sourcelayFileSharedInfo.setRecommendedAt(new Date());
//        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
//    }

    /**
     * 撤销某分享
     * @param id
     * @param userId
     * @return
     */
    public long CancelSharedFile(long id, long userId) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return ReturnStatus.FailedFile.CancelFile;
        sourcelayFileSharedInfo.setDeletedAt(new Date());
        sourcelayFileSharedInfo.setDeletedId(userId);
        if (sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) != 1)
            return ReturnStatus.FailedFile.CancelFile;
        return ReturnStatus.Normal.AllRight;
    }
    /**
     * 取消该用户该文件所有的分享
     * @param userId 用户id
     * @param fileId 文件id
     * @return 是否成功取消
     */
    public long CancelAllSharedFile(long userId, long fileId) {
        List <SourcelayFileSharedInfo> list = GetByUserFileId(userId, fileId);
        if (list == null)
            return ReturnStatus.FailedFile.CancelFile;
        for (SourcelayFileSharedInfo sourcelayFileSharedInfo: list) {
            sourcelayFileSharedInfo.setDeletedId(userId);
            sourcelayFileSharedInfo.setDeletedAt(new Date());
            if (sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) != 1)
                return ReturnStatus.FailedFile.CancelFile;
        }
        return ReturnStatus.Normal.AllRight;
    }

    /**
     * 撤销取消分享
     * @param id
     * @return
     */
    public long CancelCancelSharedFile(long id) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return ReturnStatus.FailedFile.CancelCancelFile;
        sourcelayFileSharedInfo.setDeletedAt(null);
        sourcelayFileSharedInfo.setDeletedId(null);
        if (sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) != 1)
            return ReturnStatus.FailedFile.CancelCancelFile;
        return ReturnStatus.Normal.AllRight;
    }

    /**
     * 获取分享文件Id
     * @param id 分享Id
     * @return 返回对应分享文件的id
     */
    public long GetFileIdOfShare(long id) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return 0;
        Date date = sourcelayFileSharedInfo.getDeletedAt();
        if (sourcelayFileSharedInfo.getDeletedAt() != null)
            return 0;
        return sourcelayFileSharedInfo.getFileId();
    }

    /**
     * 撤销取消分享
     * @param id
     * @param userId
     * @return
     */
    public boolean CancelCancelSharedFile(long id, long userId) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null)
            return false;
        sourcelayFileSharedInfo.setDeletedId(null);
        sourcelayFileSharedInfo.setDeletedAt(null);
        return sourcelayFileSharedInfoMapper.updateByPrimaryKey(sourcelayFileSharedInfo) == 1;
    }



    /**
     * 返回文件分享类型
     * @param fileId
     * @return 不存在返回-1
     */
    public short GetSharedType(long fileId) {
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fileId);
        example.or(criteria);
        List<SourcelayFileSharedInfo> list =
                sourcelayFileSharedInfoMapper.selectByExample(example);
        if (list.size() == 0) return (short) -1;
        return list.get(0).getSharedType();
    }

    /**
     * 返回分享文件是否被软删除
     * @param fileId
     * @return
     */
    public boolean IsDeleted(long fileId) {
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fileId);
        example.or(criteria);
        List<SourcelayFileSharedInfo> list =
                sourcelayFileSharedInfoMapper.selectByExample(example);
        if (list.size() == 0) return true;
        return list.get(0).getDeletedAt() != null;
    }

    /**
     * 返回是否是公开文件
     * @param id
     * @return
     */

    public boolean IsPublic(long id) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null) return false;
        // 是否被软删除 是否为非密码分享类型
        return sourcelayFileSharedInfo.getDeletedAt() == null &&
                sourcelayFileSharedInfo.getSharedType() == 0;
    }

    /**
     * 获得分享文件的密码
     * @param shareId 分享文件的id
     * @return 分享文件的密码
     */
    public String GetSharePassword(long shareId) {
        SourcelayFileSharedInfoExample example = new SourcelayFileSharedInfoExample();
        SourcelayFileSharedInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(shareId);
        example.or(criteria);
        List<SourcelayFileSharedInfo> list =
                sourcelayFileSharedInfoMapper.selectByExample(example);
        if (list.size() == 0) return null;
        SourcelayFileSharedInfo sourcelayFileSharedInfo = list.get(0);
        return sourcelayFileSharedInfo.getPassword();
    }

     /**
     * 判断是否为分享拥有者
     * @param id
     * @param userId
     * @return
     */
    public boolean IsSharedOwner(long id, long userId) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null) return false;
        return sourcelayFileSharedInfo.getUserId() == userId;
    }

    /**
     * 更新
     * @param newSourcelayFileSharedInfo
     * @return
     */
    public long Update(SourcelayFileSharedInfo newSourcelayFileSharedInfo) {
        //继承旧的时间数据
        SourcelayFileSharedInfo oldSourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(newSourcelayFileSharedInfo.getId());
        newSourcelayFileSharedInfo.setDeletedAt(oldSourcelayFileSharedInfo.getDeletedAt());
        newSourcelayFileSharedInfo.setRecommendedAt(oldSourcelayFileSharedInfo.getRecommendedAt());
        newSourcelayFileSharedInfo.setCreatedAt(oldSourcelayFileSharedInfo.getCreatedAt());
        //如果被推荐了需要修改推荐时间
        if (newSourcelayFileSharedInfo.getIsRecommended() == 1 &&
                oldSourcelayFileSharedInfo.getIsRecommended() != 1)
            newSourcelayFileSharedInfo.setRecommendedAt(new Date());
        if (sourcelayFileSharedInfoMapper.updateByPrimaryKey(newSourcelayFileSharedInfo) != 1)
            return ReturnStatus.FailedOperation.UpdateInfo;
        return ReturnStatus.Normal.AllRight;
    }

    public boolean NotDeleted(long id) {
        SourcelayFileSharedInfo sourcelayFileSharedInfo =
                sourcelayFileSharedInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileSharedInfo == null) return false;
        return sourcelayFileSharedInfo.getDeletedAt() == null;
    }
}
