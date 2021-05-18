package com.example.demo.data.model;

import java.util.Date;

public class GroupUser extends GroupUserKey {
    private Date expirationTime;

    public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }
}