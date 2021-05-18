package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.Date;

public class Questions {
    private Long id;

    private Long threadId;

    private Long userId;

    private Long beUserId;

    private String ip;

    private Integer port;

    private BigDecimal price;

    private BigDecimal onlookerUnitPrice;

    private BigDecimal onlookerPrice;

    private Long onlookerNumber;

    private Byte isOnlooker;

    private Byte isAnswer;

    private Byte isApproved;

    private Date updatedAt;

    private Date createdAt;

    private Date expiredAt;

    private Date answeredAt;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBeUserId() {
        return beUserId;
    }

    public void setBeUserId(Long beUserId) {
        this.beUserId = beUserId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOnlookerUnitPrice() {
        return onlookerUnitPrice;
    }

    public void setOnlookerUnitPrice(BigDecimal onlookerUnitPrice) {
        this.onlookerUnitPrice = onlookerUnitPrice;
    }

    public BigDecimal getOnlookerPrice() {
        return onlookerPrice;
    }

    public void setOnlookerPrice(BigDecimal onlookerPrice) {
        this.onlookerPrice = onlookerPrice;
    }

    public Long getOnlookerNumber() {
        return onlookerNumber;
    }

    public void setOnlookerNumber(Long onlookerNumber) {
        this.onlookerNumber = onlookerNumber;
    }

    public Byte getIsOnlooker() {
        return isOnlooker;
    }

    public void setIsOnlooker(Byte isOnlooker) {
        this.isOnlooker = isOnlooker;
    }

    public Byte getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Byte isAnswer) {
        this.isAnswer = isAnswer;
    }

    public Byte getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Byte isApproved) {
        this.isApproved = isApproved;
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

    public Date getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Date getAnsweredAt() {
        return answeredAt;
    }

    public void setAnsweredAt(Date answeredAt) {
        this.answeredAt = answeredAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}