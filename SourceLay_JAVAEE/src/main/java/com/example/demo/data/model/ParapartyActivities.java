package com.example.demo.data.model;

import java.util.Date;

public class ParapartyActivities {
    private Long id;

    private Long threadId;

    private Byte isFirst;

    private Long categoryId;

    private Date createdAt;

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

    public Byte getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Byte isFirst) {
        this.isFirst = isFirst;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}