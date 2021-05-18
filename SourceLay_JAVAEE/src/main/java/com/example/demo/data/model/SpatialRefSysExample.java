package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class SpatialRefSysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpatialRefSysExample() {
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

        public Criteria andSridIsNull() {
            addCriterion("SRID is null");
            return (Criteria) this;
        }

        public Criteria andSridIsNotNull() {
            addCriterion("SRID is not null");
            return (Criteria) this;
        }

        public Criteria andSridEqualTo(Short value) {
            addCriterion("SRID =", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridNotEqualTo(Short value) {
            addCriterion("SRID <>", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridGreaterThan(Short value) {
            addCriterion("SRID >", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridGreaterThanOrEqualTo(Short value) {
            addCriterion("SRID >=", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridLessThan(Short value) {
            addCriterion("SRID <", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridLessThanOrEqualTo(Short value) {
            addCriterion("SRID <=", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridIn(List<Short> values) {
            addCriterion("SRID in", values, "srid");
            return (Criteria) this;
        }

        public Criteria andSridNotIn(List<Short> values) {
            addCriterion("SRID not in", values, "srid");
            return (Criteria) this;
        }

        public Criteria andSridBetween(Short value1, Short value2) {
            addCriterion("SRID between", value1, value2, "srid");
            return (Criteria) this;
        }

        public Criteria andSridNotBetween(Short value1, Short value2) {
            addCriterion("SRID not between", value1, value2, "srid");
            return (Criteria) this;
        }

        public Criteria andAuthNameIsNull() {
            addCriterion("AUTH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthNameIsNotNull() {
            addCriterion("AUTH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthNameEqualTo(String value) {
            addCriterion("AUTH_NAME =", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotEqualTo(String value) {
            addCriterion("AUTH_NAME <>", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameGreaterThan(String value) {
            addCriterion("AUTH_NAME >", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_NAME >=", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameLessThan(String value) {
            addCriterion("AUTH_NAME <", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameLessThanOrEqualTo(String value) {
            addCriterion("AUTH_NAME <=", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameLike(String value) {
            addCriterion("AUTH_NAME like", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotLike(String value) {
            addCriterion("AUTH_NAME not like", value, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameIn(List<String> values) {
            addCriterion("AUTH_NAME in", values, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotIn(List<String> values) {
            addCriterion("AUTH_NAME not in", values, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameBetween(String value1, String value2) {
            addCriterion("AUTH_NAME between", value1, value2, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthNameNotBetween(String value1, String value2) {
            addCriterion("AUTH_NAME not between", value1, value2, "authName");
            return (Criteria) this;
        }

        public Criteria andAuthSridIsNull() {
            addCriterion("AUTH_SRID is null");
            return (Criteria) this;
        }

        public Criteria andAuthSridIsNotNull() {
            addCriterion("AUTH_SRID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthSridEqualTo(Integer value) {
            addCriterion("AUTH_SRID =", value, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridNotEqualTo(Integer value) {
            addCriterion("AUTH_SRID <>", value, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridGreaterThan(Integer value) {
            addCriterion("AUTH_SRID >", value, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTH_SRID >=", value, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridLessThan(Integer value) {
            addCriterion("AUTH_SRID <", value, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridLessThanOrEqualTo(Integer value) {
            addCriterion("AUTH_SRID <=", value, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridIn(List<Integer> values) {
            addCriterion("AUTH_SRID in", values, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridNotIn(List<Integer> values) {
            addCriterion("AUTH_SRID not in", values, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_SRID between", value1, value2, "authSrid");
            return (Criteria) this;
        }

        public Criteria andAuthSridNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_SRID not between", value1, value2, "authSrid");
            return (Criteria) this;
        }

        public Criteria andSrtextIsNull() {
            addCriterion("SRTEXT is null");
            return (Criteria) this;
        }

        public Criteria andSrtextIsNotNull() {
            addCriterion("SRTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andSrtextEqualTo(String value) {
            addCriterion("SRTEXT =", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextNotEqualTo(String value) {
            addCriterion("SRTEXT <>", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextGreaterThan(String value) {
            addCriterion("SRTEXT >", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextGreaterThanOrEqualTo(String value) {
            addCriterion("SRTEXT >=", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextLessThan(String value) {
            addCriterion("SRTEXT <", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextLessThanOrEqualTo(String value) {
            addCriterion("SRTEXT <=", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextLike(String value) {
            addCriterion("SRTEXT like", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextNotLike(String value) {
            addCriterion("SRTEXT not like", value, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextIn(List<String> values) {
            addCriterion("SRTEXT in", values, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextNotIn(List<String> values) {
            addCriterion("SRTEXT not in", values, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextBetween(String value1, String value2) {
            addCriterion("SRTEXT between", value1, value2, "srtext");
            return (Criteria) this;
        }

        public Criteria andSrtextNotBetween(String value1, String value2) {
            addCriterion("SRTEXT not between", value1, value2, "srtext");
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