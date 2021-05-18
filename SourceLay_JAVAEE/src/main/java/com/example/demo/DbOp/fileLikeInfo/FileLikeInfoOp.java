package com.example.demo.DbOp.fileLikeInfo;

import com.example.demo.data.dao.SourcelayFileLikeInfoMapper;
import com.example.demo.data.model.SourcelayFileLikeInfo;
import com.example.demo.data.model.SourcelayFileLikeInfoExample;
import com.example.demo.util.ReturnStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author dzy
 * @title: FileLikeInfoOp
 * @projectName demo
 * @description:
 * @date 2020/11/3015:16
 */
@Service("fileLikeInfoOp")
public class FileLikeInfoOp {
    @Autowired
    SourcelayFileLikeInfoMapper sourcelayFileLikeInfoMapper;

    public boolean IsLikeExist(long userId, long fileId) {
        SourcelayFileLikeInfoExample example = new SourcelayFileLikeInfoExample();
        SourcelayFileLikeInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andFileIdEqualTo(fileId);
        example.or(criteria);
        return sourcelayFileLikeInfoMapper.countByExample(example) != 0;
    }

    public long AddLike(long userId, long fileId) {
        if (IsLikeExist(userId,fileId))
            return ReturnStatus.FailedLike.Exist;
        SourcelayFileLikeInfo sourcelayFileLikeInfo = new SourcelayFileLikeInfo();
        SourcelayFileLikeInfoExample example = new SourcelayFileLikeInfoExample();
        long num = MaxId() + 1;
        sourcelayFileLikeInfo.setId(num);
        sourcelayFileLikeInfo.setCreatedAt(new Date());
        sourcelayFileLikeInfo.setUserId(userId);
        sourcelayFileLikeInfo.setFileId(fileId);
        if (sourcelayFileLikeInfoMapper.insert(sourcelayFileLikeInfo) != 1)
            return ReturnStatus.FailedLike.DataBase;
        return ReturnStatus.Normal.AllRight;
    }

    public long DeleteLike(long userId, long fileId) {
        if (!IsLikeExist(userId, fileId))
            return ReturnStatus.FailedLike.NotExist;
        SourcelayFileLikeInfoExample example = new SourcelayFileLikeInfoExample();
        SourcelayFileLikeInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andFileIdEqualTo(fileId);
        example.or(criteria);
        if (sourcelayFileLikeInfoMapper.deleteByExample(example) != 1)
            return ReturnStatus.FailedLike.DataBase;
        return ReturnStatus.Normal.AllRight;
    }

    public long MaxId() {
        SourcelayFileLikeInfoExample example = new SourcelayFileLikeInfoExample();
        SourcelayFileLikeInfoExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id DESC");
        List<SourcelayFileLikeInfo> list = sourcelayFileLikeInfoMapper.selectByExample(example);
        if (list.isEmpty())
            return -1;
        return list.get(0).getId();
    }
}
