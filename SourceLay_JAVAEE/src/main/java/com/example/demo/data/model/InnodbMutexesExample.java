package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class InnodbMutexesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbMutexesExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreateFileIsNull() {
            addCriterion("CREATE_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCreateFileIsNotNull() {
            addCriterion("CREATE_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateFileEqualTo(String value) {
            addCriterion("CREATE_FILE =", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileNotEqualTo(String value) {
            addCriterion("CREATE_FILE <>", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileGreaterThan(String value) {
            addCriterion("CREATE_FILE >", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_FILE >=", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileLessThan(String value) {
            addCriterion("CREATE_FILE <", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileLessThanOrEqualTo(String value) {
            addCriterion("CREATE_FILE <=", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileLike(String value) {
            addCriterion("CREATE_FILE like", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileNotLike(String value) {
            addCriterion("CREATE_FILE not like", value, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileIn(List<String> values) {
            addCriterion("CREATE_FILE in", values, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileNotIn(List<String> values) {
            addCriterion("CREATE_FILE not in", values, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileBetween(String value1, String value2) {
            addCriterion("CREATE_FILE between", value1, value2, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateFileNotBetween(String value1, String value2) {
            addCriterion("CREATE_FILE not between", value1, value2, "createFile");
            return (Criteria) this;
        }

        public Criteria andCreateLineIsNull() {
            addCriterion("CREATE_LINE is null");
            return (Criteria) this;
        }

        public Criteria andCreateLineIsNotNull() {
            addCriterion("CREATE_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateLineEqualTo(Integer value) {
            addCriterion("CREATE_LINE =", value, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineNotEqualTo(Integer value) {
            addCriterion("CREATE_LINE <>", value, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineGreaterThan(Integer value) {
            addCriterion("CREATE_LINE >", value, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_LINE >=", value, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineLessThan(Integer value) {
            addCriterion("CREATE_LINE <", value, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_LINE <=", value, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineIn(List<Integer> values) {
            addCriterion("CREATE_LINE in", values, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineNotIn(List<Integer> values) {
            addCriterion("CREATE_LINE not in", values, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_LINE between", value1, value2, "createLine");
            return (Criteria) this;
        }

        public Criteria andCreateLineNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_LINE not between", value1, value2, "createLine");
            return (Criteria) this;
        }

        public Criteria andOsWaitsIsNull() {
            addCriterion("OS_WAITS is null");
            return (Criteria) this;
        }

        public Criteria andOsWaitsIsNotNull() {
            addCriterion("OS_WAITS is not null");
            return (Criteria) this;
        }

        public Criteria andOsWaitsEqualTo(Long value) {
            addCriterion("OS_WAITS =", value, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsNotEqualTo(Long value) {
            addCriterion("OS_WAITS <>", value, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsGreaterThan(Long value) {
            addCriterion("OS_WAITS >", value, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsGreaterThanOrEqualTo(Long value) {
            addCriterion("OS_WAITS >=", value, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsLessThan(Long value) {
            addCriterion("OS_WAITS <", value, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsLessThanOrEqualTo(Long value) {
            addCriterion("OS_WAITS <=", value, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsIn(List<Long> values) {
            addCriterion("OS_WAITS in", values, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsNotIn(List<Long> values) {
            addCriterion("OS_WAITS not in", values, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsBetween(Long value1, Long value2) {
            addCriterion("OS_WAITS between", value1, value2, "osWaits");
            return (Criteria) this;
        }

        public Criteria andOsWaitsNotBetween(Long value1, Long value2) {
            addCriterion("OS_WAITS not between", value1, value2, "osWaits");
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