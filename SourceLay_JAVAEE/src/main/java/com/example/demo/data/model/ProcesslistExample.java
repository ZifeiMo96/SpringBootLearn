package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcesslistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcesslistExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andHostIsNull() {
            addCriterion("HOST is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("HOST is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("HOST =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("HOST <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("HOST >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("HOST >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("HOST <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("HOST <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("HOST like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("HOST not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("HOST in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("HOST not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("HOST between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("HOST not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("DB is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("DB is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("DB =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("DB <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("DB >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("DB >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("DB <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("DB <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("DB like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("DB not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("DB in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("DB not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("DB between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("DB not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andCommandIsNull() {
            addCriterion("COMMAND is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("COMMAND is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("COMMAND =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("COMMAND <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("COMMAND >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("COMMAND >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("COMMAND <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("COMMAND <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("COMMAND like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("COMMAND not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("COMMAND in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("COMMAND not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("COMMAND between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("COMMAND not between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTimeMsIsNull() {
            addCriterion("TIME_MS is null");
            return (Criteria) this;
        }

        public Criteria andTimeMsIsNotNull() {
            addCriterion("TIME_MS is not null");
            return (Criteria) this;
        }

        public Criteria andTimeMsEqualTo(BigDecimal value) {
            addCriterion("TIME_MS =", value, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsNotEqualTo(BigDecimal value) {
            addCriterion("TIME_MS <>", value, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsGreaterThan(BigDecimal value) {
            addCriterion("TIME_MS >", value, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIME_MS >=", value, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsLessThan(BigDecimal value) {
            addCriterion("TIME_MS <", value, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIME_MS <=", value, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsIn(List<BigDecimal> values) {
            addCriterion("TIME_MS in", values, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsNotIn(List<BigDecimal> values) {
            addCriterion("TIME_MS not in", values, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIME_MS between", value1, value2, "timeMs");
            return (Criteria) this;
        }

        public Criteria andTimeMsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIME_MS not between", value1, value2, "timeMs");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(Byte value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(Byte value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(Byte value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(Byte value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(Byte value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(Byte value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<Byte> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<Byte> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(Byte value1, Byte value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(Byte value1, Byte value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andMaxStageIsNull() {
            addCriterion("MAX_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andMaxStageIsNotNull() {
            addCriterion("MAX_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStageEqualTo(Byte value) {
            addCriterion("MAX_STAGE =", value, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageNotEqualTo(Byte value) {
            addCriterion("MAX_STAGE <>", value, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageGreaterThan(Byte value) {
            addCriterion("MAX_STAGE >", value, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageGreaterThanOrEqualTo(Byte value) {
            addCriterion("MAX_STAGE >=", value, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageLessThan(Byte value) {
            addCriterion("MAX_STAGE <", value, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageLessThanOrEqualTo(Byte value) {
            addCriterion("MAX_STAGE <=", value, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageIn(List<Byte> values) {
            addCriterion("MAX_STAGE in", values, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageNotIn(List<Byte> values) {
            addCriterion("MAX_STAGE not in", values, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageBetween(Byte value1, Byte value2) {
            addCriterion("MAX_STAGE between", value1, value2, "maxStage");
            return (Criteria) this;
        }

        public Criteria andMaxStageNotBetween(Byte value1, Byte value2) {
            addCriterion("MAX_STAGE not between", value1, value2, "maxStage");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("PROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("PROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(BigDecimal value) {
            addCriterion("PROGRESS =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(BigDecimal value) {
            addCriterion("PROGRESS <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(BigDecimal value) {
            addCriterion("PROGRESS >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRESS >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(BigDecimal value) {
            addCriterion("PROGRESS <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRESS <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<BigDecimal> values) {
            addCriterion("PROGRESS in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<BigDecimal> values) {
            addCriterion("PROGRESS not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRESS between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRESS not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNull() {
            addCriterion("MEMORY_USED is null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIsNotNull() {
            addCriterion("MEMORY_USED is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedEqualTo(Long value) {
            addCriterion("MEMORY_USED =", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotEqualTo(Long value) {
            addCriterion("MEMORY_USED <>", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThan(Long value) {
            addCriterion("MEMORY_USED >", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMORY_USED >=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThan(Long value) {
            addCriterion("MEMORY_USED <", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedLessThanOrEqualTo(Long value) {
            addCriterion("MEMORY_USED <=", value, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedIn(List<Long> values) {
            addCriterion("MEMORY_USED in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotIn(List<Long> values) {
            addCriterion("MEMORY_USED not in", values, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedBetween(Long value1, Long value2) {
            addCriterion("MEMORY_USED between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMemoryUsedNotBetween(Long value1, Long value2) {
            addCriterion("MEMORY_USED not between", value1, value2, "memoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedIsNull() {
            addCriterion("MAX_MEMORY_USED is null");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedIsNotNull() {
            addCriterion("MAX_MEMORY_USED is not null");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedEqualTo(Long value) {
            addCriterion("MAX_MEMORY_USED =", value, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedNotEqualTo(Long value) {
            addCriterion("MAX_MEMORY_USED <>", value, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedGreaterThan(Long value) {
            addCriterion("MAX_MEMORY_USED >", value, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_MEMORY_USED >=", value, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedLessThan(Long value) {
            addCriterion("MAX_MEMORY_USED <", value, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedLessThanOrEqualTo(Long value) {
            addCriterion("MAX_MEMORY_USED <=", value, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedIn(List<Long> values) {
            addCriterion("MAX_MEMORY_USED in", values, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedNotIn(List<Long> values) {
            addCriterion("MAX_MEMORY_USED not in", values, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedBetween(Long value1, Long value2) {
            addCriterion("MAX_MEMORY_USED between", value1, value2, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andMaxMemoryUsedNotBetween(Long value1, Long value2) {
            addCriterion("MAX_MEMORY_USED not between", value1, value2, "maxMemoryUsed");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsIsNull() {
            addCriterion("EXAMINED_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsIsNotNull() {
            addCriterion("EXAMINED_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsEqualTo(Integer value) {
            addCriterion("EXAMINED_ROWS =", value, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsNotEqualTo(Integer value) {
            addCriterion("EXAMINED_ROWS <>", value, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsGreaterThan(Integer value) {
            addCriterion("EXAMINED_ROWS >", value, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXAMINED_ROWS >=", value, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsLessThan(Integer value) {
            addCriterion("EXAMINED_ROWS <", value, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsLessThanOrEqualTo(Integer value) {
            addCriterion("EXAMINED_ROWS <=", value, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsIn(List<Integer> values) {
            addCriterion("EXAMINED_ROWS in", values, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsNotIn(List<Integer> values) {
            addCriterion("EXAMINED_ROWS not in", values, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsBetween(Integer value1, Integer value2) {
            addCriterion("EXAMINED_ROWS between", value1, value2, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andExaminedRowsNotBetween(Integer value1, Integer value2) {
            addCriterion("EXAMINED_ROWS not between", value1, value2, "examinedRows");
            return (Criteria) this;
        }

        public Criteria andQueryIdIsNull() {
            addCriterion("QUERY_ID is null");
            return (Criteria) this;
        }

        public Criteria andQueryIdIsNotNull() {
            addCriterion("QUERY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQueryIdEqualTo(Long value) {
            addCriterion("QUERY_ID =", value, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdNotEqualTo(Long value) {
            addCriterion("QUERY_ID <>", value, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdGreaterThan(Long value) {
            addCriterion("QUERY_ID >", value, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QUERY_ID >=", value, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdLessThan(Long value) {
            addCriterion("QUERY_ID <", value, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdLessThanOrEqualTo(Long value) {
            addCriterion("QUERY_ID <=", value, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdIn(List<Long> values) {
            addCriterion("QUERY_ID in", values, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdNotIn(List<Long> values) {
            addCriterion("QUERY_ID not in", values, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdBetween(Long value1, Long value2) {
            addCriterion("QUERY_ID between", value1, value2, "queryId");
            return (Criteria) this;
        }

        public Criteria andQueryIdNotBetween(Long value1, Long value2) {
            addCriterion("QUERY_ID not between", value1, value2, "queryId");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("TID not between", value1, value2, "tid");
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