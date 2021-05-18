package com.example.demo.data.model;

import java.util.Date;

public class Notifications {
    private Long id;

    private String type;

    private String notifiableType;

    private Long notifiableId;

    private Date readAt;

    private Date createdAt;

    private Date updatedAt;

    private String data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNotifiableType() {
        return notifiableType;
    }

    public void setNotifiableType(String notifiableType) {
        this.notifiableType = notifiableType == null ? null : notifiableType.trim();
    }

    public Long getNotifiableId() {
        return notifiableId;
    }

    public void setNotifiableId(Long notifiableId) {
        this.notifiableId = notifiableId;
    }

    public Date getReadAt() {
        return readAt;
    }

    public void setReadAt(Date readAt) {
        this.readAt = readAt;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}