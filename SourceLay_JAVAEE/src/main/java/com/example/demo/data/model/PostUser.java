package com.example.demo.data.model;

import java.util.Date;

public class PostUser extends PostUserKey {
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}