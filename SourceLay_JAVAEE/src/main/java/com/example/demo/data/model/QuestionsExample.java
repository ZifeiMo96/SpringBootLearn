package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionsExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNull() {
            addCriterion("thread_id is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("thread_id =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("thread_id <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("thread_id >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("thread_id >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("thread_id <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("thread_id <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("thread_id in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("thread_id not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("thread_id between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("thread_id not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdIsNull() {
            addCriterion("be_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBeUserIdIsNotNull() {
            addCriterion("be_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeUserIdEqualTo(Long value) {
            addCriterion("be_user_id =", value, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdNotEqualTo(Long value) {
            addCriterion("be_user_id <>", value, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdGreaterThan(Long value) {
            addCriterion("be_user_id >", value, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("be_user_id >=", value, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdLessThan(Long value) {
            addCriterion("be_user_id <", value, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdLessThanOrEqualTo(Long value) {
            addCriterion("be_user_id <=", value, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdIn(List<Long> values) {
            addCriterion("be_user_id in", values, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdNotIn(List<Long> values) {
            addCriterion("be_user_id not in", values, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdBetween(Long value1, Long value2) {
            addCriterion("be_user_id between", value1, value2, "beUserId");
            return (Criteria) this;
        }

        public Criteria andBeUserIdNotBetween(Long value1, Long value2) {
            addCriterion("be_user_id not between", value1, value2, "beUserId");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceIsNull() {
            addCriterion("onlooker_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceIsNotNull() {
            addCriterion("onlooker_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceEqualTo(BigDecimal value) {
            addCriterion("onlooker_unit_price =", value, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("onlooker_unit_price <>", value, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("onlooker_unit_price >", value, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("onlooker_unit_price >=", value, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceLessThan(BigDecimal value) {
            addCriterion("onlooker_unit_price <", value, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("onlooker_unit_price <=", value, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceIn(List<BigDecimal> values) {
            addCriterion("onlooker_unit_price in", values, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("onlooker_unit_price not in", values, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onlooker_unit_price between", value1, value2, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onlooker_unit_price not between", value1, value2, "onlookerUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceIsNull() {
            addCriterion("onlooker_price is null");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceIsNotNull() {
            addCriterion("onlooker_price is not null");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceEqualTo(BigDecimal value) {
            addCriterion("onlooker_price =", value, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceNotEqualTo(BigDecimal value) {
            addCriterion("onlooker_price <>", value, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceGreaterThan(BigDecimal value) {
            addCriterion("onlooker_price >", value, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("onlooker_price >=", value, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceLessThan(BigDecimal value) {
            addCriterion("onlooker_price <", value, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("onlooker_price <=", value, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceIn(List<BigDecimal> values) {
            addCriterion("onlooker_price in", values, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceNotIn(List<BigDecimal> values) {
            addCriterion("onlooker_price not in", values, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onlooker_price between", value1, value2, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onlooker_price not between", value1, value2, "onlookerPrice");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberIsNull() {
            addCriterion("onlooker_number is null");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberIsNotNull() {
            addCriterion("onlooker_number is not null");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberEqualTo(Long value) {
            addCriterion("onlooker_number =", value, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberNotEqualTo(Long value) {
            addCriterion("onlooker_number <>", value, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberGreaterThan(Long value) {
            addCriterion("onlooker_number >", value, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("onlooker_number >=", value, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberLessThan(Long value) {
            addCriterion("onlooker_number <", value, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberLessThanOrEqualTo(Long value) {
            addCriterion("onlooker_number <=", value, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberIn(List<Long> values) {
            addCriterion("onlooker_number in", values, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberNotIn(List<Long> values) {
            addCriterion("onlooker_number not in", values, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberBetween(Long value1, Long value2) {
            addCriterion("onlooker_number between", value1, value2, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andOnlookerNumberNotBetween(Long value1, Long value2) {
            addCriterion("onlooker_number not between", value1, value2, "onlookerNumber");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerIsNull() {
            addCriterion("is_onlooker is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerIsNotNull() {
            addCriterion("is_onlooker is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerEqualTo(Byte value) {
            addCriterion("is_onlooker =", value, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerNotEqualTo(Byte value) {
            addCriterion("is_onlooker <>", value, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerGreaterThan(Byte value) {
            addCriterion("is_onlooker >", value, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_onlooker >=", value, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerLessThan(Byte value) {
            addCriterion("is_onlooker <", value, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerLessThanOrEqualTo(Byte value) {
            addCriterion("is_onlooker <=", value, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerIn(List<Byte> values) {
            addCriterion("is_onlooker in", values, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerNotIn(List<Byte> values) {
            addCriterion("is_onlooker not in", values, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerBetween(Byte value1, Byte value2) {
            addCriterion("is_onlooker between", value1, value2, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsOnlookerNotBetween(Byte value1, Byte value2) {
            addCriterion("is_onlooker not between", value1, value2, "isOnlooker");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIsNull() {
            addCriterion("is_answer is null");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIsNotNull() {
            addCriterion("is_answer is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnswerEqualTo(Byte value) {
            addCriterion("is_answer =", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotEqualTo(Byte value) {
            addCriterion("is_answer <>", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerGreaterThan(Byte value) {
            addCriterion("is_answer >", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_answer >=", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerLessThan(Byte value) {
            addCriterion("is_answer <", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerLessThanOrEqualTo(Byte value) {
            addCriterion("is_answer <=", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIn(List<Byte> values) {
            addCriterion("is_answer in", values, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotIn(List<Byte> values) {
            addCriterion("is_answer not in", values, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerBetween(Byte value1, Byte value2) {
            addCriterion("is_answer between", value1, value2, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotBetween(Byte value1, Byte value2) {
            addCriterion("is_answer not between", value1, value2, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIsNull() {
            addCriterion("is_approved is null");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIsNotNull() {
            addCriterion("is_approved is not null");
            return (Criteria) this;
        }

        public Criteria andIsApprovedEqualTo(Byte value) {
            addCriterion("is_approved =", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotEqualTo(Byte value) {
            addCriterion("is_approved <>", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedGreaterThan(Byte value) {
            addCriterion("is_approved >", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_approved >=", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLessThan(Byte value) {
            addCriterion("is_approved <", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLessThanOrEqualTo(Byte value) {
            addCriterion("is_approved <=", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIn(List<Byte> values) {
            addCriterion("is_approved in", values, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotIn(List<Byte> values) {
            addCriterion("is_approved not in", values, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedBetween(Byte value1, Byte value2) {
            addCriterion("is_approved between", value1, value2, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_approved not between", value1, value2, "isApproved");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIsNull() {
            addCriterion("expired_at is null");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIsNotNull() {
            addCriterion("expired_at is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredAtEqualTo(Date value) {
            addCriterion("expired_at =", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotEqualTo(Date value) {
            addCriterion("expired_at <>", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtGreaterThan(Date value) {
            addCriterion("expired_at >", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtGreaterThanOrEqualTo(Date value) {
            addCriterion("expired_at >=", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtLessThan(Date value) {
            addCriterion("expired_at <", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtLessThanOrEqualTo(Date value) {
            addCriterion("expired_at <=", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIn(List<Date> values) {
            addCriterion("expired_at in", values, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotIn(List<Date> values) {
            addCriterion("expired_at not in", values, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtBetween(Date value1, Date value2) {
            addCriterion("expired_at between", value1, value2, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotBetween(Date value1, Date value2) {
            addCriterion("expired_at not between", value1, value2, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtIsNull() {
            addCriterion("answered_at is null");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtIsNotNull() {
            addCriterion("answered_at is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtEqualTo(Date value) {
            addCriterion("answered_at =", value, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtNotEqualTo(Date value) {
            addCriterion("answered_at <>", value, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtGreaterThan(Date value) {
            addCriterion("answered_at >", value, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtGreaterThanOrEqualTo(Date value) {
            addCriterion("answered_at >=", value, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtLessThan(Date value) {
            addCriterion("answered_at <", value, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtLessThanOrEqualTo(Date value) {
            addCriterion("answered_at <=", value, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtIn(List<Date> values) {
            addCriterion("answered_at in", values, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtNotIn(List<Date> values) {
            addCriterion("answered_at not in", values, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtBetween(Date value1, Date value2) {
            addCriterion("answered_at between", value1, value2, "answeredAt");
            return (Criteria) this;
        }

        public Criteria andAnsweredAtNotBetween(Date value1, Date value2) {
            addCriterion("answered_at not between", value1, value2, "answeredAt");
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