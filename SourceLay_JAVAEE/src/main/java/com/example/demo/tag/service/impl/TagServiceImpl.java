package com.example.demo.tag.service.impl;

import com.example.demo.DbOp.fileInfo.FileInfoOp;
import com.example.demo.DbOp.tagInfo.TagInfoOp;
import com.example.demo.tag.service.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zry
 */
@Service("tagServiceImpl")
public class TagServiceImpl implements TagService {

    @Autowired
    TagInfoOp tagInfoOp;

    @Autowired
    FileInfoOp fileInfoOp;

    @Override
    public Boolean addNewTag(String tagName, Long userId) {
        return tagInfoOp.addNewTag(tagName, userId);
    }

    @Override
    public Boolean deleteTag(String tagName) {

        return null;
    }

    @Override
    public Long selectTag(String tagName) {
        return tagInfoOp.returnTagId(tagName);
    }

    @Override
    public Boolean erectRelationBetweenTagAndFile(String tagName, Long fileId) {
        if(!fileInfoOp.IsFileExistById(fileId)){
            //文件不存在
            return false;
        }else if(tagInfoOp.returnTagCount(tagName)!=1) {
            //标签不存在或存在多个等异常情况
            return false;
        } else {
            tagInfoOp.addRelationBetweenTagAndFile(tagInfoOp.returnTagId(tagName),fileId);
            return true;
        }
    }

}
