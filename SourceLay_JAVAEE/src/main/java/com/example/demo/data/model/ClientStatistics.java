package com.example.demo.data.model;

public class ClientStatistics {
    private String client;

    private Long totalConnections;

    private Long concurrentConnections;

    private Long connectedTime;

    private Double busyTime;

    private Double cpuTime;

    private Long bytesReceived;

    private Long bytesSent;

    private Long binlogBytesWritten;

    private Long rowsRead;

    private Long rowsSent;

    private Long rowsDeleted;

    private Long rowsInserted;

    private Long rowsUpdated;

    private Long selectCommands;

    private Long updateCommands;

    private Long otherCommands;

    private Long commitTransactions;

    private Long rollbackTransactions;

    private Long deniedConnections;

    private Long lostConnections;

    private Long accessDenied;

    private Long emptyQueries;

    private Long totalSslConnections;

    private Long maxStatementTimeExceeded;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    public Long getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    public Long getConcurrentConnections() {
        return concurrentConnections;
    }

    public void setConcurrentConnections(Long concurrentConnections) {
        this.concurrentConnections = concurrentConnections;
    }

    public Long getConnectedTime() {
        return connectedTime;
    }

    public void setConnectedTime(Long connectedTime) {
        this.connectedTime = connectedTime;
    }

    public Double getBusyTime() {
        return busyTime;
    }

    public void setBusyTime(Double busyTime) {
        this.busyTime = busyTime;
    }

    public Double getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
    }

    public Long getBytesReceived() {
        return bytesReceived;
    }

    public void setBytesReceived(Long bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    public Long getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(Long bytesSent) {
        this.bytesSent = bytesSent;
    }

    public Long getBinlogBytesWritten() {
        return binlogBytesWritten;
    }

    public void setBinlogBytesWritten(Long binlogBytesWritten) {
        this.binlogBytesWritten = binlogBytesWritten;
    }

    public Long getRowsRead() {
        return rowsRead;
    }

    public void setRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
    }

    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public Long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public Long getSelectCommands() {
        return selectCommands;
    }

    public void setSelectCommands(Long selectCommands) {
        this.selectCommands = selectCommands;
    }

    public Long getUpdateCommands() {
        return updateCommands;
    }

    public void setUpdateCommands(Long updateCommands) {
        this.updateCommands = updateCommands;
    }

    public Long getOtherCommands() {
        return otherCommands;
    }

    public void setOtherCommands(Long otherCommands) {
        this.otherCommands = otherCommands;
    }

    public Long getCommitTransactions() {
        return commitTransactions;
    }

    public void setCommitTransactions(Long commitTransactions) {
        this.commitTransactions = commitTransactions;
    }

    public Long getRollbackTransactions() {
        return rollbackTransactions;
    }

    public void setRollbackTransactions(Long rollbackTransactions) {
        this.rollbackTransactions = rollbackTransactions;
    }

    public Long getDeniedConnections() {
        return deniedConnections;
    }

    public void setDeniedConnections(Long deniedConnections) {
        this.deniedConnections = deniedConnections;
    }

    public Long getLostConnections() {
        return lostConnections;
    }

    public void setLostConnections(Long lostConnections) {
        this.lostConnections = lostConnections;
    }

    public Long getAccessDenied() {
        return accessDenied;
    }

    public void setAccessDenied(Long accessDenied) {
        this.accessDenied = accessDenied;
    }

    public Long getEmptyQueries() {
        return emptyQueries;
    }

    public void setEmptyQueries(Long emptyQueries) {
        this.emptyQueries = emptyQueries;
    }

    public Long getTotalSslConnections() {
        return totalSslConnections;
    }

    public void setTotalSslConnections(Long totalSslConnections) {
        this.totalSslConnections = totalSslConnections;
    }

    public Long getMaxStatementTimeExceeded() {
        return maxStatementTimeExceeded;
    }

    public void setMaxStatementTimeExceeded(Long maxStatementTimeExceeded) {
        this.maxStatementTimeExceeded = maxStatementTimeExceeded;
    }
}