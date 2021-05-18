package com.example.demo.data.model;

import java.util.Date;

public class StopWords {
    private Long id;

    private Long userId;

    private String ugc;

    private String username;

    private String signature;

    private String dialog;

    private String find;

    private String replacement;

    private Date createdAt;

    private Date updatedAt;

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

    public String getUgc() {
        return ugc;
    }

    public void setUgc(String ugc) {
        this.ugc = ugc == null ? null : ugc.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog == null ? null : dialog.trim();
    }

    public String getFind() {
        return find;
    }

    public void setFind(String find) {
        this.find = find == null ? null : find.trim();
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement == null ? null : replacement.trim();
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