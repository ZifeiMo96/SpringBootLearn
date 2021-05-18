package com.example.demo.data.model;

import java.util.Date;

public class SourcelayFileSharedorder {
    private Long orderId;

    private Long filesharedId;

    private Date createdAt;

    private Date updatedAt;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getFilesharedId() {
        return filesharedId;
    }

    public void setFilesharedId(Long filesharedId) {
        this.filesharedId = filesharedId;
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