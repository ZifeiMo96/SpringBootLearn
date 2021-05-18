package com.example.demo.data.model;

import java.util.Date;

public class UserDistributions {
    private Long id;

    private Long pid;

    private Long userId;

    private Double beScale;

    private Byte level;

    private Byte isSubordinate;

    private Byte isCommission;

    private Date updatedAt;

    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getBeScale() {
        return beScale;
    }

    public void setBeScale(Double beScale) {
        this.beScale = beScale;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getIsSubordinate() {
        return isSubordinate;
    }

    public void setIsSubordinate(Byte isSubordinate) {
        this.isSubordinate = isSubordinate;
    }

    public Byte getIsCommission() {
        return isCommission;
    }

    public void setIsCommission(Byte isCommission) {
        this.isCommission = isCommission;
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
}