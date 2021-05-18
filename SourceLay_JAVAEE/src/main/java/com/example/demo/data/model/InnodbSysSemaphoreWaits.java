package com.example.demo.data.model;

public class InnodbSysSemaphoreWaits {
    private Long threadId;

    private String objectName;

    private String file;

    private Integer line;

    private Long waitTime;

    private Long waitObject;

    private String waitType;

    private Long holderThreadId;

    private String holderFile;

    private Integer holderLine;

    private String createdFile;

    private Integer createdLine;

    private Long writerThread;

    private String reservationMode;

    private Integer readers;

    private Long waitersFlag;

    private Long lockWord;

    private String lastWriterFile;

    private Integer lastWriterLine;

    private Integer osWaitCount;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
    }

    public Long getWaitObject() {
        return waitObject;
    }

    public void setWaitObject(Long waitObject) {
        this.waitObject = waitObject;
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType == null ? null : waitType.trim();
    }

    public Long getHolderThreadId() {
        return holderThreadId;
    }

    public void setHolderThreadId(Long holderThreadId) {
        this.holderThreadId = holderThreadId;
    }

    public String getHolderFile() {
        return holderFile;
    }

    public void setHolderFile(String holderFile) {
        this.holderFile = holderFile == null ? null : holderFile.trim();
    }

    public Integer getHolderLine() {
        return holderLine;
    }

    public void setHolderLine(Integer holderLine) {
        this.holderLine = holderLine;
    }

    public String getCreatedFile() {
        return createdFile;
    }

    public void setCreatedFile(String createdFile) {
        this.createdFile = createdFile == null ? null : createdFile.trim();
    }

    public Integer getCreatedLine() {
        return createdLine;
    }

    public void setCreatedLine(Integer createdLine) {
        this.createdLine = createdLine;
    }

    public Long getWriterThread() {
        return writerThread;
    }

    public void setWriterThread(Long writerThread) {
        this.writerThread = writerThread;
    }

    public String getReservationMode() {
        return reservationMode;
    }

    public void setReservationMode(String reservationMode) {
        this.reservationMode = reservationMode == null ? null : reservationMode.trim();
    }

    public Integer getReaders() {
        return readers;
    }

    public void setReaders(Integer readers) {
        this.readers = readers;
    }

    public Long getWaitersFlag() {
        return waitersFlag;
    }

    public void setWaitersFlag(Long waitersFlag) {
        this.waitersFlag = waitersFlag;
    }

    public Long getLockWord() {
        return lockWord;
    }

    public void setLockWord(Long lockWord) {
        this.lockWord = lockWord;
    }

    public String getLastWriterFile() {
        return lastWriterFile;
    }

    public void setLastWriterFile(String lastWriterFile) {
        this.lastWriterFile = lastWriterFile == null ? null : lastWriterFile.trim();
    }

    public Integer getLastWriterLine() {
        return lastWriterLine;
    }

    public void setLastWriterLine(Integer lastWriterLine) {
        this.lastWriterLine = lastWriterLine;
    }

    public Integer getOsWaitCount() {
        return osWaitCount;
    }

    public void setOsWaitCount(Integer osWaitCount) {
        this.osWaitCount = osWaitCount;
    }
}