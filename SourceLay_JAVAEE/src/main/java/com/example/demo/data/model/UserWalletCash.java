package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserWalletCash {
    private Long id;

    private Long userId;

    private Long cashSn;

    private BigDecimal cashCharge;

    private BigDecimal cashActualAmount;

    private BigDecimal cashApplyAmount;

    private Byte cashStatus;

    private String cashMobile;

    private Byte cashType;

    private String remark;

    private Date tradeTime;

    private String tradeNo;

    private String errorCode;

    private String errorMessage;

    private Byte refundsStatus;

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

    public Long getCashSn() {
        return cashSn;
    }

    public void setCashSn(Long cashSn) {
        this.cashSn = cashSn;
    }

    public BigDecimal getCashCharge() {
        return cashCharge;
    }

    public void setCashCharge(BigDecimal cashCharge) {
        this.cashCharge = cashCharge;
    }

    public BigDecimal getCashActualAmount() {
        return cashActualAmount;
    }

    public void setCashActualAmount(BigDecimal cashActualAmount) {
        this.cashActualAmount = cashActualAmount;
    }

    public BigDecimal getCashApplyAmount() {
        return cashApplyAmount;
    }

    public void setCashApplyAmount(BigDecimal cashApplyAmount) {
        this.cashApplyAmount = cashApplyAmount;
    }

    public Byte getCashStatus() {
        return cashStatus;
    }

    public void setCashStatus(Byte cashStatus) {
        this.cashStatus = cashStatus;
    }

    public String getCashMobile() {
        return cashMobile;
    }

    public void setCashMobile(String cashMobile) {
        this.cashMobile = cashMobile == null ? null : cashMobile.trim();
    }

    public Byte getCashType() {
        return cashType;
    }

    public void setCashType(Byte cashType) {
        this.cashType = cashType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public Byte getRefundsStatus() {
        return refundsStatus;
    }

    public void setRefundsStatus(Byte refundsStatus) {
        this.refundsStatus = refundsStatus;
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