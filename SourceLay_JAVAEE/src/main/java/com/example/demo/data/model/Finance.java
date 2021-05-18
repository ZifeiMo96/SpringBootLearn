package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class Finance {
    private Long id;

    private BigDecimal income;

    private BigDecimal withdrawal;

    private Integer orderCount;

    private BigDecimal orderAmount;

    private BigDecimal totalProfit;

    private BigDecimal registerProfit;

    private BigDecimal masterPortion;

    private BigDecimal withdrawalProfit;

    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(BigDecimal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    public BigDecimal getRegisterProfit() {
        return registerProfit;
    }

    public void setRegisterProfit(BigDecimal registerProfit) {
        this.registerProfit = registerProfit;
    }

    public BigDecimal getMasterPortion() {
        return masterPortion;
    }

    public void setMasterPortion(BigDecimal masterPortion) {
        this.masterPortion = masterPortion;
    }

    public BigDecimal getWithdrawalProfit() {
        return withdrawalProfit;
    }

    public void setWithdrawalProfit(BigDecimal withdrawalProfit) {
        this.withdrawalProfit = withdrawalProfit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}