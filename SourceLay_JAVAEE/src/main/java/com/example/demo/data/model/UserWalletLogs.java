package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserWalletLogs {
    private Long id;

    private Long userId;

    private Long sourceUserId;

    private BigDecimal changeAvailableAmount;

    private BigDecimal changeFreezeAmount;

    private Short changeType;

    private String changeDesc;

    private Long orderId;

    private Long userWalletCashId;

    private Long questionId;

    private Date createdAt;

    private Date updatedAt;

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

    public Long getSourceUserId() {
        return sourceUserId;
    }

    public void setSourceUserId(Long sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    public BigDecimal getChangeAvailableAmount() {
        return changeAvailableAmount;
    }

    public void setChangeAvailableAmount(BigDecimal changeAvailableAmount) {
        this.changeAvailableAmount = changeAvailableAmount;
    }

    public BigDecimal getChangeFreezeAmount() {
        return changeFreezeAmount;
    }

    public void setChangeFreezeAmount(BigDecimal changeFreezeAmount) {
        this.changeFreezeAmount = changeFreezeAmount;
    }

    public Short getChangeType() {
        return changeType;
    }

    public void setChangeType(Short changeType) {
        this.changeType = changeType;
    }

    public String getChangeDesc() {
        return changeDesc;
    }

    public void setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc == null ? null : changeDesc.trim();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserWalletCashId() {
        return userWalletCashId;
    }

    public void setUserWalletCashId(Long userWalletCashId) {
        this.userWalletCashId = userWalletCashId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
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
}