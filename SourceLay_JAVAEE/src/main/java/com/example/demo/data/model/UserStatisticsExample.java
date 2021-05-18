package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class UserStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserStatisticsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("USER =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("USER <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("USER >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("USER <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("USER like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("USER not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("USER in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("USER not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIsNull() {
            addCriterion("TOTAL_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIsNotNull() {
            addCriterion("TOTAL_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsEqualTo(Integer value) {
            addCriterion("TOTAL_CONNECTIONS =", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotEqualTo(Integer value) {
            addCriterion("TOTAL_CONNECTIONS <>", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsGreaterThan(Integer value) {
            addCriterion("TOTAL_CONNECTIONS >", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_CONNECTIONS >=", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsLessThan(Integer value) {
            addCriterion("TOTAL_CONNECTIONS <", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_CONNECTIONS <=", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIn(List<Integer> values) {
            addCriterion("TOTAL_CONNECTIONS in", values, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotIn(List<Integer> values) {
            addCriterion("TOTAL_CONNECTIONS not in", values, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_CONNECTIONS between", value1, value2, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_CONNECTIONS not between", value1, value2, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsIsNull() {
            addCriterion("CONCURRENT_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsIsNotNull() {
            addCriterion("CONCURRENT_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsEqualTo(Integer value) {
            addCriterion("CONCURRENT_CONNECTIONS =", value, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsNotEqualTo(Integer value) {
            addCriterion("CONCURRENT_CONNECTIONS <>", value, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsGreaterThan(Integer value) {
            addCriterion("CONCURRENT_CONNECTIONS >", value, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONCURRENT_CONNECTIONS >=", value, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsLessThan(Integer value) {
            addCriterion("CONCURRENT_CONNECTIONS <", value, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsLessThanOrEqualTo(Integer value) {
            addCriterion("CONCURRENT_CONNECTIONS <=", value, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsIn(List<Integer> values) {
            addCriterion("CONCURRENT_CONNECTIONS in", values, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsNotIn(List<Integer> values) {
            addCriterion("CONCURRENT_CONNECTIONS not in", values, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsBetween(Integer value1, Integer value2) {
            addCriterion("CONCURRENT_CONNECTIONS between", value1, value2, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConcurrentConnectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("CONCURRENT_CONNECTIONS not between", value1, value2, "concurrentConnections");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeIsNull() {
            addCriterion("CONNECTED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeIsNotNull() {
            addCriterion("CONNECTED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeEqualTo(Integer value) {
            addCriterion("CONNECTED_TIME =", value, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeNotEqualTo(Integer value) {
            addCriterion("CONNECTED_TIME <>", value, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeGreaterThan(Integer value) {
            addCriterion("CONNECTED_TIME >", value, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONNECTED_TIME >=", value, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeLessThan(Integer value) {
            addCriterion("CONNECTED_TIME <", value, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("CONNECTED_TIME <=", value, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeIn(List<Integer> values) {
            addCriterion("CONNECTED_TIME in", values, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeNotIn(List<Integer> values) {
            addCriterion("CONNECTED_TIME not in", values, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeBetween(Integer value1, Integer value2) {
            addCriterion("CONNECTED_TIME between", value1, value2, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andConnectedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CONNECTED_TIME not between", value1, value2, "connectedTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeIsNull() {
            addCriterion("BUSY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusyTimeIsNotNull() {
            addCriterion("BUSY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusyTimeEqualTo(Double value) {
            addCriterion("BUSY_TIME =", value, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeNotEqualTo(Double value) {
            addCriterion("BUSY_TIME <>", value, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeGreaterThan(Double value) {
            addCriterion("BUSY_TIME >", value, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("BUSY_TIME >=", value, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeLessThan(Double value) {
            addCriterion("BUSY_TIME <", value, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeLessThanOrEqualTo(Double value) {
            addCriterion("BUSY_TIME <=", value, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeIn(List<Double> values) {
            addCriterion("BUSY_TIME in", values, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeNotIn(List<Double> values) {
            addCriterion("BUSY_TIME not in", values, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeBetween(Double value1, Double value2) {
            addCriterion("BUSY_TIME between", value1, value2, "busyTime");
            return (Criteria) this;
        }

        public Criteria andBusyTimeNotBetween(Double value1, Double value2) {
            addCriterion("BUSY_TIME not between", value1, value2, "busyTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeIsNull() {
            addCriterion("CPU_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCpuTimeIsNotNull() {
            addCriterion("CPU_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCpuTimeEqualTo(Double value) {
            addCriterion("CPU_TIME =", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeNotEqualTo(Double value) {
            addCriterion("CPU_TIME <>", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeGreaterThan(Double value) {
            addCriterion("CPU_TIME >", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("CPU_TIME >=", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeLessThan(Double value) {
            addCriterion("CPU_TIME <", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeLessThanOrEqualTo(Double value) {
            addCriterion("CPU_TIME <=", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeIn(List<Double> values) {
            addCriterion("CPU_TIME in", values, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeNotIn(List<Double> values) {
            addCriterion("CPU_TIME not in", values, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeBetween(Double value1, Double value2) {
            addCriterion("CPU_TIME between", value1, value2, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeNotBetween(Double value1, Double value2) {
            addCriterion("CPU_TIME not between", value1, value2, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedIsNull() {
            addCriterion("BYTES_RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedIsNotNull() {
            addCriterion("BYTES_RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedEqualTo(Long value) {
            addCriterion("BYTES_RECEIVED =", value, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedNotEqualTo(Long value) {
            addCriterion("BYTES_RECEIVED <>", value, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedGreaterThan(Long value) {
            addCriterion("BYTES_RECEIVED >", value, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedGreaterThanOrEqualTo(Long value) {
            addCriterion("BYTES_RECEIVED >=", value, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedLessThan(Long value) {
            addCriterion("BYTES_RECEIVED <", value, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedLessThanOrEqualTo(Long value) {
            addCriterion("BYTES_RECEIVED <=", value, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedIn(List<Long> values) {
            addCriterion("BYTES_RECEIVED in", values, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedNotIn(List<Long> values) {
            addCriterion("BYTES_RECEIVED not in", values, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedBetween(Long value1, Long value2) {
            addCriterion("BYTES_RECEIVED between", value1, value2, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesReceivedNotBetween(Long value1, Long value2) {
            addCriterion("BYTES_RECEIVED not between", value1, value2, "bytesReceived");
            return (Criteria) this;
        }

        public Criteria andBytesSentIsNull() {
            addCriterion("BYTES_SENT is null");
            return (Criteria) this;
        }

        public Criteria andBytesSentIsNotNull() {
            addCriterion("BYTES_SENT is not null");
            return (Criteria) this;
        }

        public Criteria andBytesSentEqualTo(Long value) {
            addCriterion("BYTES_SENT =", value, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentNotEqualTo(Long value) {
            addCriterion("BYTES_SENT <>", value, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentGreaterThan(Long value) {
            addCriterion("BYTES_SENT >", value, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentGreaterThanOrEqualTo(Long value) {
            addCriterion("BYTES_SENT >=", value, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentLessThan(Long value) {
            addCriterion("BYTES_SENT <", value, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentLessThanOrEqualTo(Long value) {
            addCriterion("BYTES_SENT <=", value, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentIn(List<Long> values) {
            addCriterion("BYTES_SENT in", values, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentNotIn(List<Long> values) {
            addCriterion("BYTES_SENT not in", values, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentBetween(Long value1, Long value2) {
            addCriterion("BYTES_SENT between", value1, value2, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBytesSentNotBetween(Long value1, Long value2) {
            addCriterion("BYTES_SENT not between", value1, value2, "bytesSent");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenIsNull() {
            addCriterion("BINLOG_BYTES_WRITTEN is null");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenIsNotNull() {
            addCriterion("BINLOG_BYTES_WRITTEN is not null");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenEqualTo(Long value) {
            addCriterion("BINLOG_BYTES_WRITTEN =", value, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenNotEqualTo(Long value) {
            addCriterion("BINLOG_BYTES_WRITTEN <>", value, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenGreaterThan(Long value) {
            addCriterion("BINLOG_BYTES_WRITTEN >", value, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("BINLOG_BYTES_WRITTEN >=", value, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenLessThan(Long value) {
            addCriterion("BINLOG_BYTES_WRITTEN <", value, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenLessThanOrEqualTo(Long value) {
            addCriterion("BINLOG_BYTES_WRITTEN <=", value, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenIn(List<Long> values) {
            addCriterion("BINLOG_BYTES_WRITTEN in", values, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenNotIn(List<Long> values) {
            addCriterion("BINLOG_BYTES_WRITTEN not in", values, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenBetween(Long value1, Long value2) {
            addCriterion("BINLOG_BYTES_WRITTEN between", value1, value2, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andBinlogBytesWrittenNotBetween(Long value1, Long value2) {
            addCriterion("BINLOG_BYTES_WRITTEN not between", value1, value2, "binlogBytesWritten");
            return (Criteria) this;
        }

        public Criteria andRowsReadIsNull() {
            addCriterion("ROWS_READ is null");
            return (Criteria) this;
        }

        public Criteria andRowsReadIsNotNull() {
            addCriterion("ROWS_READ is not null");
            return (Criteria) this;
        }

        public Criteria andRowsReadEqualTo(Long value) {
            addCriterion("ROWS_READ =", value, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadNotEqualTo(Long value) {
            addCriterion("ROWS_READ <>", value, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadGreaterThan(Long value) {
            addCriterion("ROWS_READ >", value, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_READ >=", value, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadLessThan(Long value) {
            addCriterion("ROWS_READ <", value, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_READ <=", value, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadIn(List<Long> values) {
            addCriterion("ROWS_READ in", values, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadNotIn(List<Long> values) {
            addCriterion("ROWS_READ not in", values, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadBetween(Long value1, Long value2) {
            addCriterion("ROWS_READ between", value1, value2, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsReadNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_READ not between", value1, value2, "rowsRead");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNull() {
            addCriterion("ROWS_SENT is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNotNull() {
            addCriterion("ROWS_SENT is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentEqualTo(Long value) {
            addCriterion("ROWS_SENT =", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotEqualTo(Long value) {
            addCriterion("ROWS_SENT <>", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThan(Long value) {
            addCriterion("ROWS_SENT >", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_SENT >=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThan(Long value) {
            addCriterion("ROWS_SENT <", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_SENT <=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentIn(List<Long> values) {
            addCriterion("ROWS_SENT in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotIn(List<Long> values) {
            addCriterion("ROWS_SENT not in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentBetween(Long value1, Long value2) {
            addCriterion("ROWS_SENT between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_SENT not between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIsNull() {
            addCriterion("ROWS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIsNotNull() {
            addCriterion("ROWS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedEqualTo(Long value) {
            addCriterion("ROWS_DELETED =", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotEqualTo(Long value) {
            addCriterion("ROWS_DELETED <>", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedGreaterThan(Long value) {
            addCriterion("ROWS_DELETED >", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_DELETED >=", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedLessThan(Long value) {
            addCriterion("ROWS_DELETED <", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_DELETED <=", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIn(List<Long> values) {
            addCriterion("ROWS_DELETED in", values, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotIn(List<Long> values) {
            addCriterion("ROWS_DELETED not in", values, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedBetween(Long value1, Long value2) {
            addCriterion("ROWS_DELETED between", value1, value2, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_DELETED not between", value1, value2, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIsNull() {
            addCriterion("ROWS_INSERTED is null");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIsNotNull() {
            addCriterion("ROWS_INSERTED is not null");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedEqualTo(Long value) {
            addCriterion("ROWS_INSERTED =", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotEqualTo(Long value) {
            addCriterion("ROWS_INSERTED <>", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedGreaterThan(Long value) {
            addCriterion("ROWS_INSERTED >", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_INSERTED >=", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedLessThan(Long value) {
            addCriterion("ROWS_INSERTED <", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_INSERTED <=", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIn(List<Long> values) {
            addCriterion("ROWS_INSERTED in", values, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotIn(List<Long> values) {
            addCriterion("ROWS_INSERTED not in", values, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedBetween(Long value1, Long value2) {
            addCriterion("ROWS_INSERTED between", value1, value2, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_INSERTED not between", value1, value2, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIsNull() {
            addCriterion("ROWS_UPDATED is null");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIsNotNull() {
            addCriterion("ROWS_UPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedEqualTo(Long value) {
            addCriterion("ROWS_UPDATED =", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotEqualTo(Long value) {
            addCriterion("ROWS_UPDATED <>", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedGreaterThan(Long value) {
            addCriterion("ROWS_UPDATED >", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_UPDATED >=", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedLessThan(Long value) {
            addCriterion("ROWS_UPDATED <", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_UPDATED <=", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIn(List<Long> values) {
            addCriterion("ROWS_UPDATED in", values, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotIn(List<Long> values) {
            addCriterion("ROWS_UPDATED not in", values, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedBetween(Long value1, Long value2) {
            addCriterion("ROWS_UPDATED between", value1, value2, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_UPDATED not between", value1, value2, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsIsNull() {
            addCriterion("SELECT_COMMANDS is null");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsIsNotNull() {
            addCriterion("SELECT_COMMANDS is not null");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsEqualTo(Long value) {
            addCriterion("SELECT_COMMANDS =", value, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsNotEqualTo(Long value) {
            addCriterion("SELECT_COMMANDS <>", value, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsGreaterThan(Long value) {
            addCriterion("SELECT_COMMANDS >", value, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECT_COMMANDS >=", value, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsLessThan(Long value) {
            addCriterion("SELECT_COMMANDS <", value, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsLessThanOrEqualTo(Long value) {
            addCriterion("SELECT_COMMANDS <=", value, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsIn(List<Long> values) {
            addCriterion("SELECT_COMMANDS in", values, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsNotIn(List<Long> values) {
            addCriterion("SELECT_COMMANDS not in", values, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsBetween(Long value1, Long value2) {
            addCriterion("SELECT_COMMANDS between", value1, value2, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andSelectCommandsNotBetween(Long value1, Long value2) {
            addCriterion("SELECT_COMMANDS not between", value1, value2, "selectCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsIsNull() {
            addCriterion("UPDATE_COMMANDS is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsIsNotNull() {
            addCriterion("UPDATE_COMMANDS is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsEqualTo(Long value) {
            addCriterion("UPDATE_COMMANDS =", value, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsNotEqualTo(Long value) {
            addCriterion("UPDATE_COMMANDS <>", value, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsGreaterThan(Long value) {
            addCriterion("UPDATE_COMMANDS >", value, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_COMMANDS >=", value, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsLessThan(Long value) {
            addCriterion("UPDATE_COMMANDS <", value, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_COMMANDS <=", value, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsIn(List<Long> values) {
            addCriterion("UPDATE_COMMANDS in", values, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsNotIn(List<Long> values) {
            addCriterion("UPDATE_COMMANDS not in", values, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsBetween(Long value1, Long value2) {
            addCriterion("UPDATE_COMMANDS between", value1, value2, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andUpdateCommandsNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_COMMANDS not between", value1, value2, "updateCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsIsNull() {
            addCriterion("OTHER_COMMANDS is null");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsIsNotNull() {
            addCriterion("OTHER_COMMANDS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsEqualTo(Long value) {
            addCriterion("OTHER_COMMANDS =", value, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsNotEqualTo(Long value) {
            addCriterion("OTHER_COMMANDS <>", value, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsGreaterThan(Long value) {
            addCriterion("OTHER_COMMANDS >", value, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsGreaterThanOrEqualTo(Long value) {
            addCriterion("OTHER_COMMANDS >=", value, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsLessThan(Long value) {
            addCriterion("OTHER_COMMANDS <", value, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsLessThanOrEqualTo(Long value) {
            addCriterion("OTHER_COMMANDS <=", value, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsIn(List<Long> values) {
            addCriterion("OTHER_COMMANDS in", values, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsNotIn(List<Long> values) {
            addCriterion("OTHER_COMMANDS not in", values, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsBetween(Long value1, Long value2) {
            addCriterion("OTHER_COMMANDS between", value1, value2, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andOtherCommandsNotBetween(Long value1, Long value2) {
            addCriterion("OTHER_COMMANDS not between", value1, value2, "otherCommands");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsIsNull() {
            addCriterion("COMMIT_TRANSACTIONS is null");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsIsNotNull() {
            addCriterion("COMMIT_TRANSACTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsEqualTo(Long value) {
            addCriterion("COMMIT_TRANSACTIONS =", value, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsNotEqualTo(Long value) {
            addCriterion("COMMIT_TRANSACTIONS <>", value, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsGreaterThan(Long value) {
            addCriterion("COMMIT_TRANSACTIONS >", value, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMIT_TRANSACTIONS >=", value, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsLessThan(Long value) {
            addCriterion("COMMIT_TRANSACTIONS <", value, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsLessThanOrEqualTo(Long value) {
            addCriterion("COMMIT_TRANSACTIONS <=", value, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsIn(List<Long> values) {
            addCriterion("COMMIT_TRANSACTIONS in", values, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsNotIn(List<Long> values) {
            addCriterion("COMMIT_TRANSACTIONS not in", values, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsBetween(Long value1, Long value2) {
            addCriterion("COMMIT_TRANSACTIONS between", value1, value2, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andCommitTransactionsNotBetween(Long value1, Long value2) {
            addCriterion("COMMIT_TRANSACTIONS not between", value1, value2, "commitTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsIsNull() {
            addCriterion("ROLLBACK_TRANSACTIONS is null");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsIsNotNull() {
            addCriterion("ROLLBACK_TRANSACTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsEqualTo(Long value) {
            addCriterion("ROLLBACK_TRANSACTIONS =", value, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsNotEqualTo(Long value) {
            addCriterion("ROLLBACK_TRANSACTIONS <>", value, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsGreaterThan(Long value) {
            addCriterion("ROLLBACK_TRANSACTIONS >", value, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLLBACK_TRANSACTIONS >=", value, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsLessThan(Long value) {
            addCriterion("ROLLBACK_TRANSACTIONS <", value, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsLessThanOrEqualTo(Long value) {
            addCriterion("ROLLBACK_TRANSACTIONS <=", value, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsIn(List<Long> values) {
            addCriterion("ROLLBACK_TRANSACTIONS in", values, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsNotIn(List<Long> values) {
            addCriterion("ROLLBACK_TRANSACTIONS not in", values, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsBetween(Long value1, Long value2) {
            addCriterion("ROLLBACK_TRANSACTIONS between", value1, value2, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andRollbackTransactionsNotBetween(Long value1, Long value2) {
            addCriterion("ROLLBACK_TRANSACTIONS not between", value1, value2, "rollbackTransactions");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsIsNull() {
            addCriterion("DENIED_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsIsNotNull() {
            addCriterion("DENIED_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsEqualTo(Long value) {
            addCriterion("DENIED_CONNECTIONS =", value, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsNotEqualTo(Long value) {
            addCriterion("DENIED_CONNECTIONS <>", value, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsGreaterThan(Long value) {
            addCriterion("DENIED_CONNECTIONS >", value, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsGreaterThanOrEqualTo(Long value) {
            addCriterion("DENIED_CONNECTIONS >=", value, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsLessThan(Long value) {
            addCriterion("DENIED_CONNECTIONS <", value, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsLessThanOrEqualTo(Long value) {
            addCriterion("DENIED_CONNECTIONS <=", value, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsIn(List<Long> values) {
            addCriterion("DENIED_CONNECTIONS in", values, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsNotIn(List<Long> values) {
            addCriterion("DENIED_CONNECTIONS not in", values, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsBetween(Long value1, Long value2) {
            addCriterion("DENIED_CONNECTIONS between", value1, value2, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andDeniedConnectionsNotBetween(Long value1, Long value2) {
            addCriterion("DENIED_CONNECTIONS not between", value1, value2, "deniedConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsIsNull() {
            addCriterion("LOST_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsIsNotNull() {
            addCriterion("LOST_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsEqualTo(Long value) {
            addCriterion("LOST_CONNECTIONS =", value, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsNotEqualTo(Long value) {
            addCriterion("LOST_CONNECTIONS <>", value, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsGreaterThan(Long value) {
            addCriterion("LOST_CONNECTIONS >", value, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsGreaterThanOrEqualTo(Long value) {
            addCriterion("LOST_CONNECTIONS >=", value, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsLessThan(Long value) {
            addCriterion("LOST_CONNECTIONS <", value, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsLessThanOrEqualTo(Long value) {
            addCriterion("LOST_CONNECTIONS <=", value, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsIn(List<Long> values) {
            addCriterion("LOST_CONNECTIONS in", values, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsNotIn(List<Long> values) {
            addCriterion("LOST_CONNECTIONS not in", values, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsBetween(Long value1, Long value2) {
            addCriterion("LOST_CONNECTIONS between", value1, value2, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andLostConnectionsNotBetween(Long value1, Long value2) {
            addCriterion("LOST_CONNECTIONS not between", value1, value2, "lostConnections");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedIsNull() {
            addCriterion("ACCESS_DENIED is null");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedIsNotNull() {
            addCriterion("ACCESS_DENIED is not null");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedEqualTo(Long value) {
            addCriterion("ACCESS_DENIED =", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedNotEqualTo(Long value) {
            addCriterion("ACCESS_DENIED <>", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedGreaterThan(Long value) {
            addCriterion("ACCESS_DENIED >", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCESS_DENIED >=", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedLessThan(Long value) {
            addCriterion("ACCESS_DENIED <", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedLessThanOrEqualTo(Long value) {
            addCriterion("ACCESS_DENIED <=", value, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedIn(List<Long> values) {
            addCriterion("ACCESS_DENIED in", values, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedNotIn(List<Long> values) {
            addCriterion("ACCESS_DENIED not in", values, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedBetween(Long value1, Long value2) {
            addCriterion("ACCESS_DENIED between", value1, value2, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andAccessDeniedNotBetween(Long value1, Long value2) {
            addCriterion("ACCESS_DENIED not between", value1, value2, "accessDenied");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesIsNull() {
            addCriterion("EMPTY_QUERIES is null");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesIsNotNull() {
            addCriterion("EMPTY_QUERIES is not null");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesEqualTo(Long value) {
            addCriterion("EMPTY_QUERIES =", value, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesNotEqualTo(Long value) {
            addCriterion("EMPTY_QUERIES <>", value, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesGreaterThan(Long value) {
            addCriterion("EMPTY_QUERIES >", value, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesGreaterThanOrEqualTo(Long value) {
            addCriterion("EMPTY_QUERIES >=", value, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesLessThan(Long value) {
            addCriterion("EMPTY_QUERIES <", value, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesLessThanOrEqualTo(Long value) {
            addCriterion("EMPTY_QUERIES <=", value, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesIn(List<Long> values) {
            addCriterion("EMPTY_QUERIES in", values, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesNotIn(List<Long> values) {
            addCriterion("EMPTY_QUERIES not in", values, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesBetween(Long value1, Long value2) {
            addCriterion("EMPTY_QUERIES between", value1, value2, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andEmptyQueriesNotBetween(Long value1, Long value2) {
            addCriterion("EMPTY_QUERIES not between", value1, value2, "emptyQueries");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsIsNull() {
            addCriterion("TOTAL_SSL_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsIsNotNull() {
            addCriterion("TOTAL_SSL_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsEqualTo(Long value) {
            addCriterion("TOTAL_SSL_CONNECTIONS =", value, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsNotEqualTo(Long value) {
            addCriterion("TOTAL_SSL_CONNECTIONS <>", value, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsGreaterThan(Long value) {
            addCriterion("TOTAL_SSL_CONNECTIONS >", value, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_SSL_CONNECTIONS >=", value, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsLessThan(Long value) {
            addCriterion("TOTAL_SSL_CONNECTIONS <", value, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_SSL_CONNECTIONS <=", value, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsIn(List<Long> values) {
            addCriterion("TOTAL_SSL_CONNECTIONS in", values, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsNotIn(List<Long> values) {
            addCriterion("TOTAL_SSL_CONNECTIONS not in", values, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsBetween(Long value1, Long value2) {
            addCriterion("TOTAL_SSL_CONNECTIONS between", value1, value2, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andTotalSslConnectionsNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_SSL_CONNECTIONS not between", value1, value2, "totalSslConnections");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededIsNull() {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED is null");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededIsNotNull() {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededEqualTo(Long value) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED =", value, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededNotEqualTo(Long value) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED <>", value, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededGreaterThan(Long value) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED >", value, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED >=", value, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededLessThan(Long value) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED <", value, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededLessThanOrEqualTo(Long value) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED <=", value, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededIn(List<Long> values) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED in", values, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededNotIn(List<Long> values) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED not in", values, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededBetween(Long value1, Long value2) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED between", value1, value2, "maxStatementTimeExceeded");
            return (Criteria) this;
        }

        public Criteria andMaxStatementTimeExceededNotBetween(Long value1, Long value2) {
            addCriterion("MAX_STATEMENT_TIME_EXCEEDED not between", value1, value2, "maxStatementTimeExceeded");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}