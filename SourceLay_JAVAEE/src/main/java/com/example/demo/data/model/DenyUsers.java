package com.example.demo.data.model;

import java.util.Date;

public class DenyUsers {
    private Long userId;

    private Long denyUserId;

    private Date createdAt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDenyUserId() {
        return denyUserId;
    }

    public void setDenyUserId(Long denyUserId) {
        this.denyUserId = denyUserId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}