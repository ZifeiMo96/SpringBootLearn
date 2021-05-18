package com.example.demo.data.model;

import java.math.BigDecimal;

public class Processlist {
    private Long id;

    private String user;

    private String host;

    private String db;

    private String command;

    private Integer time;

    private String state;

    private BigDecimal timeMs;

    private Byte stage;

    private Byte maxStage;

    private BigDecimal progress;

    private Long memoryUsed;

    private Long maxMemoryUsed;

    private Integer examinedRows;

    private Long queryId;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public BigDecimal getTimeMs() {
        return timeMs;
    }

    public void setTimeMs(BigDecimal timeMs) {
        this.timeMs = timeMs;
    }

    public Byte getStage() {
        return stage;
    }

    public void setStage(Byte stage) {
        this.stage = stage;
    }

    public Byte getMaxStage() {
        return maxStage;
    }

    public void setMaxStage(Byte maxStage) {
        this.maxStage = maxStage;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public Long getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(Long memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    public Long getMaxMemoryUsed() {
        return maxMemoryUsed;
    }

    public void setMaxMemoryUsed(Long maxMemoryUsed) {
        this.maxMemoryUsed = maxMemoryUsed;
    }

    public Integer getExaminedRows() {
        return examinedRows;
    }

    public void setExaminedRows(Integer examinedRows) {
        this.examinedRows = examinedRows;
    }

    public Long getQueryId() {
        return queryId;
    }

    public void setQueryId(Long queryId) {
        this.queryId = queryId;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}