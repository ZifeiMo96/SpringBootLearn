package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class Threads {
    private Long id;

    private Long userId;

    private Long lastPostedUserId;

    private Integer categoryId;

    private Byte type;

    private String title;

    private BigDecimal price;

    private BigDecimal attachmentPrice;

    private Double freeWords;

    private Integer postCount;

    private Integer viewCount;

    private Integer rewardedCount;

    private Integer paidCount;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String address;

    private String location;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Long deletedUserId;

    private Byte isApproved;

    private Byte isSticky;

    private Byte isEssence;

    private Byte isSite;

    private Byte isAnonymous;

    private Byte isDisplay;

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

    public Long getLastPostedUserId() {
        return lastPostedUserId;
    }

    public void setLastPostedUserId(Long lastPostedUserId) {
        this.lastPostedUserId = lastPostedUserId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAttachmentPrice() {
        return attachmentPrice;
    }

    public void setAttachmentPrice(BigDecimal attachmentPrice) {
        this.attachmentPrice = attachmentPrice;
    }

    public Double getFreeWords() {
        return freeWords;
    }

    public void setFreeWords(Double freeWords) {
        this.freeWords = freeWords;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getRewardedCount() {
        return rewardedCount;
    }

    public void setRewardedCount(Integer rewardedCount) {
        this.rewardedCount = rewardedCount;
    }

    public Integer getPaidCount() {
        return paidCount;
    }

    public void setPaidCount(Integer paidCount) {
        this.paidCount = paidCount;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getDeletedUserId() {
        return deletedUserId;
    }

    public void setDeletedUserId(Long deletedUserId) {
        this.deletedUserId = deletedUserId;
    }

    public Byte getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Byte isApproved) {
        this.isApproved = isApproved;
    }

    public Byte getIsSticky() {
        return isSticky;
    }

    public void setIsSticky(Byte isSticky) {
        this.isSticky = isSticky;
    }

    public Byte getIsEssence() {
        return isEssence;
    }

    public void setIsEssence(Byte isEssence) {
        this.isEssence = isEssence;
    }

    public Byte getIsSite() {
        return isSite;
    }

    public void setIsSite(Byte isSite) {
        this.isSite = isSite;
    }

    public Byte getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Byte isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Byte getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Byte isDisplay) {
        this.isDisplay = isDisplay;
    }
}