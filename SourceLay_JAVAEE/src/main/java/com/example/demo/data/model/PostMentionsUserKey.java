package com.example.demo.data.model;

public class PostMentionsUserKey {
    private Long postId;

    private Long mentionsUserId;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getMentionsUserId() {
        return mentionsUserId;
    }

    public void setMentionsUserId(Long mentionsUserId) {
        this.mentionsUserId = mentionsUserId;
    }
}