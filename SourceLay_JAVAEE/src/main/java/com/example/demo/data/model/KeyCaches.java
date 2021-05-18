package com.example.demo.data.model;

public class KeyCaches {
    private String keyCacheName;

    private Integer segments;

    private Integer segmentNumber;

    private Long fullSize;

    private Long blockSize;

    private Long usedBlocks;

    private Long unusedBlocks;

    private Long dirtyBlocks;

    private Long readRequests;

    private Long reads;

    private Long writeRequests;

    private Long writes;

    public String getKeyCacheName() {
        return keyCacheName;
    }

    public void setKeyCacheName(String keyCacheName) {
        this.keyCacheName = keyCacheName == null ? null : keyCacheName.trim();
    }

    public Integer getSegments() {
        return segments;
    }

    public void setSegments(Integer segments) {
        this.segments = segments;
    }

    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public Long getFullSize() {
        return fullSize;
    }

    public void setFullSize(Long fullSize) {
        this.fullSize = fullSize;
    }

    public Long getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Long blockSize) {
        this.blockSize = blockSize;
    }

    public Long getUsedBlocks() {
        return usedBlocks;
    }

    public void setUsedBlocks(Long usedBlocks) {
        this.usedBlocks = usedBlocks;
    }

    public Long getUnusedBlocks() {
        return unusedBlocks;
    }

    public void setUnusedBlocks(Long unusedBlocks) {
        this.unusedBlocks = unusedBlocks;
    }

    public Long getDirtyBlocks() {
        return dirtyBlocks;
    }

    public void setDirtyBlocks(Long dirtyBlocks) {
        this.dirtyBlocks = dirtyBlocks;
    }

    public Long getReadRequests() {
        return readRequests;
    }

    public void setReadRequests(Long readRequests) {
        this.readRequests = readRequests;
    }

    public Long getReads() {
        return reads;
    }

    public void setReads(Long reads) {
        this.reads = reads;
    }

    public Long getWriteRequests() {
        return writeRequests;
    }

    public void setWriteRequests(Long writeRequests) {
        this.writeRequests = writeRequests;
    }

    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }
}