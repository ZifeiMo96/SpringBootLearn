package com.example.demo.DbOp.tagInfo;

import com.example.demo.data.dao.SourcelayFileTagRelationInfoMapper;
import com.example.demo.data.dao.SourcelayTagInfoMapper;
import com.example.demo.data.model.SourcelayFileTagRelationInfo;
import com.example.demo.data.model.SourcelayTagInfo;
import com.example.demo.data.model.SourcelayTagInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author zry
 * TagInfo表数据库相关操作
 */
@Service("tagInfoOp")
public class TagInfoOp {

    @Autowired
    public SourcelayTagInfoMapper sourcelayTagInfoMapper;

    @Autowired
    public SourcelayFileTagRelationInfoMapper sourcelayFileTagRelationInfoMapper;

    /**
     * 返回该tag在数据库中的个数
     * @param tagName tag名字
     * @return 在数据库中的个数
     */
    public Integer returnTagCount(String tagName){
        SourcelayTagInfoExample example = new SourcelayTagInfoExample();
        SourcelayTagInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(tagName);
        List list = sourcelayTagInfoMapper.selectByExample(example);
        return list.size();
    }

    public Boolean addNewTag(String tagName, Long userId) {
        SourcelayTagInfo entity = new SourcelayTagInfo();

        //如果没有同名Tag出现过
        if(returnTagCount(tagName)==0){
            entity.setName(tagName);
            entity.setUserId(userId);
            sourcelayTagInfoMapper.insert(entity);
            return true;
        }
        //如果已经有重名tag
        else{
            return false;
        }
    }


    public Long returnTagId(String tagName){
        int count = returnTagCount(tagName);

        if(count>1){
            return (long)-1;
        }
        else if(count==0){
            return (long)0;
        }
        else{
            SourcelayTagInfoExample example = new SourcelayTagInfoExample();
            SourcelayTagInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(tagName);
            return sourcelayTagInfoMapper.selectByExample(example).get(0).getId();
        }
    }

    public void addRelationBetweenTagAndFile(Long tagId,Long fileId){
        SourcelayFileTagRelationInfo entity = new SourcelayFileTagRelationInfo();
        entity.setTagId(tagId);
        entity.setFileId(fileId);
        entity.setCreatedAt(new Date());
        sourcelayFileTagRelationInfoMapper.insert(entity);
    }
}
