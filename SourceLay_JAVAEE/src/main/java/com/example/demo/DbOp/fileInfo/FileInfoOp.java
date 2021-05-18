package com.example.demo.DbOp.fileInfo;

import com.example.demo.data.dao.SourcelayFileInfoMapper;
import com.example.demo.data.dao.SourcelayFileSharedInfoMapper;
import com.example.demo.data.model.SourcelayFileInfo;
import com.example.demo.data.model.SourcelayFileInfoExample;
import com.example.demo.data.model.SourcelayTagInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author dzy
 * @title: FileInfoOp
 * @projectName demo
 * @description:
 * @date 2020/11/2915:18
 */

@Service("fileInfoOp")
public class FileInfoOp {
    @Autowired
    SourcelayFileInfoMapper sourcelayFileInfoMapper;
    public void AddFileInfo(SourcelayFileInfo sourcelayFileInfo) {
        sourcelayFileInfoMapper.insert(sourcelayFileInfo);
    }

    public void addEarlyFileInfo(Map<String, Object> map) {
        SourcelayFileInfo sourcelayFileInfo = new SourcelayFileInfo();
        sourcelayFileInfo.setUserId((Long) map.get("userId"));
        sourcelayFileInfo.setName((String) map.get("name"));
        sourcelayFileInfo.setType((String) map.get("type"));
        sourcelayFileInfo.setSize((Long) map.get("size"));
        if(map.get("randomId")!=null){
            sourcelayFileInfo.setRandomId((String) map.get("randomId"));
        }
        sourcelayFileInfo.setFolder((String) map.get("folder"));
        sourcelayFileInfo.setStatus((Short) map.get("status"));
        sourcelayFileInfo.setStorageName((String) map.get("storageName"));
        sourcelayFileInfo.setCreatedAt(new Date());
        sourcelayFileInfo.setUpdatedAt(new Date());
        sourcelayFileInfo.setIsShared((byte)0);
        sourcelayFileInfo.setIsEssence((byte)0);
        sourcelayFileInfo.setDownloadCount(0);
        sourcelayFileInfo.setLikeCount(0);
        sourcelayFileInfoMapper.insert(sourcelayFileInfo);
    }

    /**
     * 通过id获取文件key
     * @param id
     * @return
     */
    public String GetKey(long id) {
        if (IsFileExistById(id)) {
            SourcelayFileInfo sourcelayFileInfo
                    = sourcelayFileInfoMapper.selectByPrimaryKey(id);
            return sourcelayFileInfo.getStorageName();
        }
        return null;
    }

    /**
     * 获取文件类型
     * @param id  文件Id
     * @return 文件类型
     */
    public String GetFileType(long id){
        SourcelayFileInfo sourcelayFileInfo
                = sourcelayFileInfoMapper.selectByPrimaryKey(id);
        return sourcelayFileInfo.getType();
    }


    /**
     * 判断id文件是否存在
     * @param id
     * @return
     */
    public Boolean IsFileExistById(long id) {
        return sourcelayFileInfoMapper.selectByPrimaryKey(id) != null;
    }

    /**
     * 将点赞量+1或-1
     * @param id
     */
    public void LikeCount(long id, boolean isLike) {
        SourcelayFileInfo sourcelayFileInfo
                = sourcelayFileInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileInfo == null)
            return;
        if (isLike)
            sourcelayFileInfo.setLikeCount(
                sourcelayFileInfo.getLikeCount()+1);
        else
            sourcelayFileInfo.setLikeCount(
                    sourcelayFileInfo.getLikeCount()-1);
        sourcelayFileInfoMapper.updateByPrimaryKey(sourcelayFileInfo);
    }

    /**
     * 将文件下载量+1
     * @param id
     */
    public void AddDownloadCount(long id) {
        SourcelayFileInfo sourcelayFileInfo
                = sourcelayFileInfoMapper.selectByPrimaryKey(id);
        if (sourcelayFileInfo == null)
            return;
        sourcelayFileInfo.setDownloadCount(
                sourcelayFileInfo.getDownloadCount()+1);
        sourcelayFileInfoMapper.updateByPrimaryKey(sourcelayFileInfo);
    }

    /***
     * 获取文件子文件
     * @param path  地址
     * @return
     */
    public List<SourcelayFileInfo> GetSonFile(String path){
        SourcelayFileInfoExample example = new SourcelayFileInfoExample();
        SourcelayFileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFolderEqualTo(path);
        example.or(criteria);
        List<SourcelayFileInfo> list1 = sourcelayFileInfoMapper.selectByExample(example);
        example = new SourcelayFileInfoExample();
        criteria = example.createCriteria();
        path = path+"/";
        criteria.andFolderEqualTo(path);
        example.or(criteria);
        List<SourcelayFileInfo> list2 = sourcelayFileInfoMapper.selectByExample(example);
        list1.addAll(list2);
        return list1;
    }

    /**
     * 删除文件
     * @param fid
     * return
     */
    public int DeleteFileInfo(long fid) {
        SourcelayFileInfo sourcelayFileInfo
                = sourcelayFileInfoMapper.selectByPrimaryKey(fid);
        if (sourcelayFileInfo == null) {
            return 2;
        }
        sourcelayFileInfo.setDeletedAt(new Date());
        if(sourcelayFileInfoMapper.updateByPrimaryKeySelective(sourcelayFileInfo) == 1){
            String type =sourcelayFileInfo.getType();
            if(type.equals("text/directory")){
                String path = sourcelayFileInfo.getFolder() + sourcelayFileInfo.getName();
                List<SourcelayFileInfo> list = GetSonFile(path);
                int errorNumber = 0;
                for (SourcelayFileInfo file:list) {
                    if(DeleteFileInfo(file.getId())!=0){
                        errorNumber++;
                    }
                }
                if(errorNumber>0){
                    return 6;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
        }else{
            return 1;
        }
    }
    /**
     * 判断用户是否是文件的拥有者
     * @param userId
     * @param fileId
     * @return
     */
    public boolean IsFileOwner(long userId, long fileId) {
        SourcelayFileInfoExample example = new SourcelayFileInfoExample();
        SourcelayFileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andIdEqualTo(fileId);
        example.or(criteria);
        return sourcelayFileInfoMapper.selectByExample(example).size() != 0;
    }

    /**
     * 判断是否是分享文件
     * @param fileId
     * @return
     */
    public boolean IsShared(long fileId) {
        SourcelayFileInfo sourcelayFileInfo
                = sourcelayFileInfoMapper.selectByPrimaryKey(fileId);
        if (sourcelayFileInfo == null) return false;
        return sourcelayFileInfo.getIsShared() == 1;
    }


    /**
     * @author zry
     * @param id 文件主键
     * @return 获得文件StorageName
     */
    public String getStorageName(Long id){
        SourcelayFileInfo res = sourcelayFileInfoMapper.selectByPrimaryKey(id);
        return res.getStorageName();
    }

    /**
     * @author zry
     * @param id 文件主键
     * @param MD5 文件MD5校验码
     * @return 是否成功设置文件MD5校验码
     * 将MD5添加进对应的表中
     */
    public Boolean setMD5(Long id, String MD5){
        SourcelayFileInfo entity = sourcelayFileInfoMapper.selectByPrimaryKey(id);
        if(entity != null) {
            entity.setMd5(MD5);
            entity.setStatus((short) 1);
            sourcelayFileInfoMapper.updateByPrimaryKey(entity);
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * 检查文件是否存在
     * @param folder
     * @param name
     * @return
     */
    public Boolean cheakFolderExist(String folder,String name){
        SourcelayFileInfoExample example = new SourcelayFileInfoExample();
        SourcelayFileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name).
                andFolderEqualTo(folder).
                andDeletedAtIsNull();
        if(sourcelayFileInfoMapper.selectByExample(example).size()!=1){
            return false;
        }
        return true;
    }

    public Boolean cheakFileExist(String folder,String name){
        SourcelayFileInfoExample example = new SourcelayFileInfoExample();
        SourcelayFileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name).
                andFolderEqualTo(folder).
                andDeletedAtIsNull().
                andStatusEqualTo((short)1);
        if(sourcelayFileInfoMapper.selectByExample(example).size()!=1){
            return false;
        }
        return true;
    }

    public boolean SetIsShared(long fileId, byte isShared) {
        SourcelayFileInfo sourcelayFileInfo =
                sourcelayFileInfoMapper.selectByPrimaryKey(fileId);
        sourcelayFileInfo.setIsShared(isShared);
        return sourcelayFileInfoMapper.updateByPrimaryKey(sourcelayFileInfo) == 1;
    }
}
