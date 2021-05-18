package com.example.demo.data.model;

import java.util.Date;

public class UserActionLogs {
    private Long id;

    private Long userId;

    private String action;

    private String message;

    private Integer logAbleId;

    private String logAbleType;

    private Date createdAt;

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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getLogAbleId() {
        return logAbleId;
    }

    public void setLogAbleId(Integer logAbleId) {
        this.logAbleId = logAbleId;
    }

    public String getLogAbleType() {
        return logAbleType;
    }

    public void setLogAbleType(String logAbleType) {
        this.logAbleType = logAbleType == null ? null : logAbleType.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}