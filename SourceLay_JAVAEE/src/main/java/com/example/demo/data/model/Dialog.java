package com.example.demo.data.model;

import java.util.Date;

public class Dialog {
    private Long id;

    private Long dialogMessageId;

    private Long senderUserId;

    private Long recipientUserId;

    private Date recipientReadAt;

    private Date senderReadAt;

    private Date createdAt;

    private Date updatedAt;

    private Date senderDeletedAt;

    private Date recipientDeletedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDialogMessageId() {
        return dialogMessageId;
    }

    public void setDialogMessageId(Long dialogMessageId) {
        this.dialogMessageId = dialogMessageId;
    }

    public Long getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Long senderUserId) {
        this.senderUserId = senderUserId;
    }

    public Long getRecipientUserId() {
        return recipientUserId;
    }

    public void setRecipientUserId(Long recipientUserId) {
        this.recipientUserId = recipientUserId;
    }

    public Date getRecipientReadAt() {
        return recipientReadAt;
    }

    public void setRecipientReadAt(Date recipientReadAt) {
        this.recipientReadAt = recipientReadAt;
    }

    public Date getSenderReadAt() {
        return senderReadAt;
    }

    public void setSenderReadAt(Date senderReadAt) {
        this.senderReadAt = senderReadAt;
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

    public Date getSenderDeletedAt() {
        return senderDeletedAt;
    }

    public void setSenderDeletedAt(Date senderDeletedAt) {
        this.senderDeletedAt = senderDeletedAt;
    }

    public Date getRecipientDeletedAt() {
        return recipientDeletedAt;
    }

    public void setRecipientDeletedAt(Date recipientDeletedAt) {
        this.recipientDeletedAt = recipientDeletedAt;
    }
}