package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Long id;

    private String orderSn;

    private String paymentSn;

    private BigDecimal amount;

    private BigDecimal masterAmount;

    private BigDecimal authorAmount;

    private BigDecimal thirdPartyAmount;

    private Double beScale;

    private Long userId;

    private Long payeeId;

    private Long thirdPartyId;

    private Byte type;

    private Long groupId;

    private Long threadId;

    private Byte status;

    private Short paymentType;

    private Byte isAnonymous;

    private Date expiredAt;

    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getPaymentSn() {
        return paymentSn;
    }

    public void setPaymentSn(String paymentSn) {
        this.paymentSn = paymentSn == null ? null : paymentSn.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getMasterAmount() {
        return masterAmount;
    }

    public void setMasterAmount(BigDecimal masterAmount) {
        this.masterAmount = masterAmount;
    }

    public BigDecimal getAuthorAmount() {
        return authorAmount;
    }

    public void setAuthorAmount(BigDecimal authorAmount) {
        this.authorAmount = authorAmount;
    }

    public BigDecimal getThirdPartyAmount() {
        return thirdPartyAmount;
    }

    public void setThirdPartyAmount(BigDecimal thirdPartyAmount) {
        this.thirdPartyAmount = thirdPartyAmount;
    }

    public Double getBeScale() {
        return beScale;
    }

    public void setBeScale(Double beScale) {
        this.beScale = beScale;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(Long payeeId) {
        this.payeeId = payeeId;
    }

    public Long getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(Long thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    public Byte getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Byte isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Date getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
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