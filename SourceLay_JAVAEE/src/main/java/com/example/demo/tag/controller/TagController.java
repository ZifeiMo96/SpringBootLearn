package com.example.demo.tag.controller;

import com.example.demo.permission.Permission;
import com.example.demo.tag.service.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    TagService tagService;
    @Autowired
    Permission permission;


    @PostMapping("/addNewTag")
    public Boolean addNewTag(@RequestParam("tagName") String tagName,
                             @RequestParam("userId")Long userId) {
        return tagService.addNewTag(tagName, userId);
    }

    @PostMapping("/getTagId")
    public Long getTagId(@RequestParam("tagName")String tagName,
                         @RequestParam("userId")Long userId) {
        return tagService.selectTag(tagName);
    }

    @PostMapping("/erectRelationBetweenTagAndFile")
    public Boolean erectRelationBetweenTagAndFile(@RequestParam("tagName")String tagName,
                                                  @RequestParam("fileId")Long fileId,
                                                  @RequestParam("userId")Long userId) {
        if(!permission.IsOwner(userId,fileId)){
            return false;
        }
        return tagService.erectRelationBetweenTagAndFile(tagName, fileId);
    }
}
