package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class TableStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableStatisticsExample() {
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

        public Criteria andTableSchemaIsNull() {
            addCriterion("TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("TABLE_SCHEMA =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("TABLE_SCHEMA >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("TABLE_SCHEMA <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("TABLE_SCHEMA like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("TABLE_SCHEMA not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("TABLE_SCHEMA in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("TABLE_SCHEMA not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
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

        public Criteria andRowsChangedIsNull() {
            addCriterion("ROWS_CHANGED is null");
            return (Criteria) this;
        }

        public Criteria andRowsChangedIsNotNull() {
            addCriterion("ROWS_CHANGED is not null");
            return (Criteria) this;
        }

        public Criteria andRowsChangedEqualTo(Long value) {
            addCriterion("ROWS_CHANGED =", value, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedNotEqualTo(Long value) {
            addCriterion("ROWS_CHANGED <>", value, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedGreaterThan(Long value) {
            addCriterion("ROWS_CHANGED >", value, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_CHANGED >=", value, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedLessThan(Long value) {
            addCriterion("ROWS_CHANGED <", value, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_CHANGED <=", value, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedIn(List<Long> values) {
            addCriterion("ROWS_CHANGED in", values, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedNotIn(List<Long> values) {
            addCriterion("ROWS_CHANGED not in", values, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedBetween(Long value1, Long value2) {
            addCriterion("ROWS_CHANGED between", value1, value2, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_CHANGED not between", value1, value2, "rowsChanged");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesIsNull() {
            addCriterion("ROWS_CHANGED_X_INDEXES is null");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesIsNotNull() {
            addCriterion("ROWS_CHANGED_X_INDEXES is not null");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesEqualTo(Long value) {
            addCriterion("ROWS_CHANGED_X_INDEXES =", value, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesNotEqualTo(Long value) {
            addCriterion("ROWS_CHANGED_X_INDEXES <>", value, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesGreaterThan(Long value) {
            addCriterion("ROWS_CHANGED_X_INDEXES >", value, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_CHANGED_X_INDEXES >=", value, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesLessThan(Long value) {
            addCriterion("ROWS_CHANGED_X_INDEXES <", value, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_CHANGED_X_INDEXES <=", value, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesIn(List<Long> values) {
            addCriterion("ROWS_CHANGED_X_INDEXES in", values, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesNotIn(List<Long> values) {
            addCriterion("ROWS_CHANGED_X_INDEXES not in", values, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesBetween(Long value1, Long value2) {
            addCriterion("ROWS_CHANGED_X_INDEXES between", value1, value2, "rowsChangedXIndexes");
            return (Criteria) this;
        }

        public Criteria andRowsChangedXIndexesNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_CHANGED_X_INDEXES not between", value1, value2, "rowsChangedXIndexes");
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