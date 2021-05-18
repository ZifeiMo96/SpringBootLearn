package com.example.demo.like.service.service;

/**
 * @author dzy
 * @title: LikeService
 * @projectName demo
 * @description:
 * @date 2020/11/3015:15
 */
public interface LikeService {
    public long Like(long id ,long userId, long fileId, boolean like);
}
