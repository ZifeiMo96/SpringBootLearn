package com.example.demo.data.model;

import java.util.Date;

public class Topics {
    private Long id;

    private Long userId;

    private Integer threadCount;

    private Integer viewCount;

    private Date updatedAt;

    private Date createdAt;

    private Byte recommended;

    private Date recommendedAt;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(Integer threadCount) {
        this.threadCount = threadCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Byte getRecommended() {
        return recommended;
    }

    public void setRecommended(Byte recommended) {
        this.recommended = recommended;
    }

    public Date getRecommendedAt() {
        return recommendedAt;
    }

    public void setRecommendedAt(Date recommendedAt) {
        this.recommendedAt = recommendedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}