package com.example.demo.data.model;

public class ParapartyReference {
    private Long id;

    private Long postId;

    private Long targetTid;

    private Long targetPid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getTargetTid() {
        return targetTid;
    }

    public void setTargetTid(Long targetTid) {
        this.targetTid = targetTid;
    }

    public Long getTargetPid() {
        return targetPid;
    }

    public void setTargetPid(Long targetPid) {
        this.targetPid = targetPid;
    }
}