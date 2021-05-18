package com.example.demo.data.model;

import java.util.Date;

public class SourcelayFileSharedInfo {
    private Long id;

    private Long fileId;

    private Long userId;

    private String sharedDesc;

    private Short sharedType;

    private String password;

    private Byte isAnonymous;

    private Integer cost;

    private Integer viewCount;

    private Integer downloadCount;

    private Byte isRecommended;

    private Date recommendedAt;

    private Date createdAt;

    private Date deletedAt;

    private Long deletedId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSharedDesc() {
        return sharedDesc;
    }

    public void setSharedDesc(String sharedDesc) {
        this.sharedDesc = sharedDesc == null ? null : sharedDesc.trim();
    }

    public Short getSharedType() {
        return sharedType;
    }

    public void setSharedType(Short sharedType) {
        this.sharedType = sharedType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Byte isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getDeletedId() {
        return deletedId;
    }

    public void setDeletedId(Long deletedId) {
        this.deletedId = deletedId;
    }
}