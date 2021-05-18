package com.example.demo.data.model;

public class PostMod {
    private Long postId;

    private String stopWord;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getStopWord() {
        return stopWord;
    }

    public void setStopWord(String stopWord) {
        this.stopWord = stopWord == null ? null : stopWord.trim();
    }
}