package com.example.demo.data.model;

import java.util.Date;

public class SourcelayTagInfo {
    private Long id;

    private String name;

    private Long userId;

    private Integer fileCount;

    private Integer downloadCount;

    private Integer viewCount;

    private Byte isRecommended;

    private Date recommendedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getFileCount() {
        return fileCount;
    }

    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Byte getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Byte isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Date getRecommendedAt() {
        return recommendedAt;
    }

    public void setRecommendedAt(Date recommendedAt) {
        this.recommendedAt = recommendedAt;
    }
}