package com.example.demo.data.model;

import java.util.Date;

public class InnodbTablespacesScrubbing {
    private Long space;

    private String name;

    private Integer compressed;

    private Date lastScrubCompleted;

    private Date currentScrubStarted;

    private Integer currentScrubActiveThreads;

    private Long currentScrubPageNumber;

    private Long currentScrubMaxPageNumber;

    public Long getSpace() {
        return space;
    }

    public void setSpace(Long space) {
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCompressed() {
        return compressed;
    }

    public void setCompressed(Integer compressed) {
        this.compressed = compressed;
    }

    public Date getLastScrubCompleted() {
        return lastScrubCompleted;
    }

    public void setLastScrubCompleted(Date lastScrubCompleted) {
        this.lastScrubCompleted = lastScrubCompleted;
    }

    public Date getCurrentScrubStarted() {
        return currentScrubStarted;
    }

    public void setCurrentScrubStarted(Date currentScrubStarted) {
        this.currentScrubStarted = currentScrubStarted;
    }

    public Integer getCurrentScrubActiveThreads() {
        return currentScrubActiveThreads;
    }

    public void setCurrentScrubActiveThreads(Integer currentScrubActiveThreads) {
        this.currentScrubActiveThreads = currentScrubActiveThreads;
    }

    public Long getCurrentScrubPageNumber() {
        return currentScrubPageNumber;
    }

    public void setCurrentScrubPageNumber(Long currentScrubPageNumber) {
        this.currentScrubPageNumber = currentScrubPageNumber;
    }

    public Long getCurrentScrubMaxPageNumber() {
        return currentScrubMaxPageNumber;
    }

    public void setCurrentScrubMaxPageNumber(Long currentScrubMaxPageNumber) {
        this.currentScrubMaxPageNumber = currentScrubMaxPageNumber;
    }
}