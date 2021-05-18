package com.example.demo.data.model;

import java.util.Date;

public class ThreadUser extends ThreadUserKey {
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}