package com.example.demo.like.controller;

import com.example.demo.like.service.impl.LikeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author dzy
 * @title: LikeController
 * @projectName demo
 * @description:
 * @date 2020/11/3015:14
 */
@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    LikeImpl likeService;
    /**
     *
     * @param id
     * @param userId
     * @param fileId
     * @param like
     * @return -700:权限验证失败
     * -501:数据库操作失败
     * -502:点赞已存在
     * -503:取消不存在的点赞
     * 0代表正常
     */
    @PostMapping("/like")
    public long Like(@RequestParam("shareId") long id,
                 @RequestParam("userId") long userId,
                 @RequestParam("fileId") long fileId,
                 @RequestParam("like") boolean like) {
        return likeService.Like(id, userId, fileId, like);
    }
}
