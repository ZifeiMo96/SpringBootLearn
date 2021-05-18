package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserWallets {
    private Long userId;

    private BigDecimal availableAmount;

    private BigDecimal freezeAmount;

    private Byte walletStatus;

    private Date createdAt;

    private Date updatedAt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public Byte getWalletStatus() {
        return walletStatus;
    }

    public void setWalletStatus(Byte walletStatus) {
        this.walletStatus = walletStatus;
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