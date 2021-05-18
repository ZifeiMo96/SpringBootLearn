package com.example.demo.tag.service.service;

public interface TagService {
    Boolean addNewTag(String tagName,Long userId);
    Boolean deleteTag(String tagName);
    Long selectTag(String tagName);
    Boolean erectRelationBetweenTagAndFile(String tagName,Long fileId);

}
