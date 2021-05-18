package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class SystemVariablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemVariablesExample() {
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

        public Criteria andVariableNameIsNull() {
            addCriterion("VARIABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNotNull() {
            addCriterion("VARIABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVariableNameEqualTo(String value) {
            addCriterion("VARIABLE_NAME =", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotEqualTo(String value) {
            addCriterion("VARIABLE_NAME <>", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThan(String value) {
            addCriterion("VARIABLE_NAME >", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME >=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThan(String value) {
            addCriterion("VARIABLE_NAME <", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME <=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLike(String value) {
            addCriterion("VARIABLE_NAME like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotLike(String value) {
            addCriterion("VARIABLE_NAME not like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIn(List<String> values) {
            addCriterion("VARIABLE_NAME in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotIn(List<String> values) {
            addCriterion("VARIABLE_NAME not in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME not between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andSessionValueIsNull() {
            addCriterion("SESSION_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSessionValueIsNotNull() {
            addCriterion("SESSION_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSessionValueEqualTo(String value) {
            addCriterion("SESSION_VALUE =", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueNotEqualTo(String value) {
            addCriterion("SESSION_VALUE <>", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueGreaterThan(String value) {
            addCriterion("SESSION_VALUE >", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_VALUE >=", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueLessThan(String value) {
            addCriterion("SESSION_VALUE <", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueLessThanOrEqualTo(String value) {
            addCriterion("SESSION_VALUE <=", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueLike(String value) {
            addCriterion("SESSION_VALUE like", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueNotLike(String value) {
            addCriterion("SESSION_VALUE not like", value, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueIn(List<String> values) {
            addCriterion("SESSION_VALUE in", values, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueNotIn(List<String> values) {
            addCriterion("SESSION_VALUE not in", values, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueBetween(String value1, String value2) {
            addCriterion("SESSION_VALUE between", value1, value2, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andSessionValueNotBetween(String value1, String value2) {
            addCriterion("SESSION_VALUE not between", value1, value2, "sessionValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueIsNull() {
            addCriterion("GLOBAL_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andGlobalValueIsNotNull() {
            addCriterion("GLOBAL_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalValueEqualTo(String value) {
            addCriterion("GLOBAL_VALUE =", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueNotEqualTo(String value) {
            addCriterion("GLOBAL_VALUE <>", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueGreaterThan(String value) {
            addCriterion("GLOBAL_VALUE >", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueGreaterThanOrEqualTo(String value) {
            addCriterion("GLOBAL_VALUE >=", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueLessThan(String value) {
            addCriterion("GLOBAL_VALUE <", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueLessThanOrEqualTo(String value) {
            addCriterion("GLOBAL_VALUE <=", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueLike(String value) {
            addCriterion("GLOBAL_VALUE like", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueNotLike(String value) {
            addCriterion("GLOBAL_VALUE not like", value, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueIn(List<String> values) {
            addCriterion("GLOBAL_VALUE in", values, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueNotIn(List<String> values) {
            addCriterion("GLOBAL_VALUE not in", values, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueBetween(String value1, String value2) {
            addCriterion("GLOBAL_VALUE between", value1, value2, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueNotBetween(String value1, String value2) {
            addCriterion("GLOBAL_VALUE not between", value1, value2, "globalValue");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginIsNull() {
            addCriterion("GLOBAL_VALUE_ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginIsNotNull() {
            addCriterion("GLOBAL_VALUE_ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginEqualTo(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN =", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginNotEqualTo(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN <>", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginGreaterThan(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN >", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginGreaterThanOrEqualTo(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN >=", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginLessThan(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN <", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginLessThanOrEqualTo(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN <=", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginLike(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN like", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginNotLike(String value) {
            addCriterion("GLOBAL_VALUE_ORIGIN not like", value, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginIn(List<String> values) {
            addCriterion("GLOBAL_VALUE_ORIGIN in", values, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginNotIn(List<String> values) {
            addCriterion("GLOBAL_VALUE_ORIGIN not in", values, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginBetween(String value1, String value2) {
            addCriterion("GLOBAL_VALUE_ORIGIN between", value1, value2, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andGlobalValueOriginNotBetween(String value1, String value2) {
            addCriterion("GLOBAL_VALUE_ORIGIN not between", value1, value2, "globalValueOrigin");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNull() {
            addCriterion("DEFAULT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNotNull() {
            addCriterion("DEFAULT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueEqualTo(String value) {
            addCriterion("DEFAULT_VALUE =", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotEqualTo(String value) {
            addCriterion("DEFAULT_VALUE <>", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThan(String value) {
            addCriterion("DEFAULT_VALUE >", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_VALUE >=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThan(String value) {
            addCriterion("DEFAULT_VALUE <", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_VALUE <=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLike(String value) {
            addCriterion("DEFAULT_VALUE like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotLike(String value) {
            addCriterion("DEFAULT_VALUE not like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIn(List<String> values) {
            addCriterion("DEFAULT_VALUE in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotIn(List<String> values) {
            addCriterion("DEFAULT_VALUE not in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueBetween(String value1, String value2) {
            addCriterion("DEFAULT_VALUE between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_VALUE not between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andVariableScopeIsNull() {
            addCriterion("VARIABLE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andVariableScopeIsNotNull() {
            addCriterion("VARIABLE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andVariableScopeEqualTo(String value) {
            addCriterion("VARIABLE_SCOPE =", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeNotEqualTo(String value) {
            addCriterion("VARIABLE_SCOPE <>", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeGreaterThan(String value) {
            addCriterion("VARIABLE_SCOPE >", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_SCOPE >=", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeLessThan(String value) {
            addCriterion("VARIABLE_SCOPE <", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_SCOPE <=", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeLike(String value) {
            addCriterion("VARIABLE_SCOPE like", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeNotLike(String value) {
            addCriterion("VARIABLE_SCOPE not like", value, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeIn(List<String> values) {
            addCriterion("VARIABLE_SCOPE in", values, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeNotIn(List<String> values) {
            addCriterion("VARIABLE_SCOPE not in", values, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeBetween(String value1, String value2) {
            addCriterion("VARIABLE_SCOPE between", value1, value2, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableScopeNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_SCOPE not between", value1, value2, "variableScope");
            return (Criteria) this;
        }

        public Criteria andVariableTypeIsNull() {
            addCriterion("VARIABLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVariableTypeIsNotNull() {
            addCriterion("VARIABLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVariableTypeEqualTo(String value) {
            addCriterion("VARIABLE_TYPE =", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeNotEqualTo(String value) {
            addCriterion("VARIABLE_TYPE <>", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeGreaterThan(String value) {
            addCriterion("VARIABLE_TYPE >", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_TYPE >=", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeLessThan(String value) {
            addCriterion("VARIABLE_TYPE <", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_TYPE <=", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeLike(String value) {
            addCriterion("VARIABLE_TYPE like", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeNotLike(String value) {
            addCriterion("VARIABLE_TYPE not like", value, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeIn(List<String> values) {
            addCriterion("VARIABLE_TYPE in", values, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeNotIn(List<String> values) {
            addCriterion("VARIABLE_TYPE not in", values, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeBetween(String value1, String value2) {
            addCriterion("VARIABLE_TYPE between", value1, value2, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableTypeNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_TYPE not between", value1, value2, "variableType");
            return (Criteria) this;
        }

        public Criteria andVariableCommentIsNull() {
            addCriterion("VARIABLE_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andVariableCommentIsNotNull() {
            addCriterion("VARIABLE_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andVariableCommentEqualTo(String value) {
            addCriterion("VARIABLE_COMMENT =", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentNotEqualTo(String value) {
            addCriterion("VARIABLE_COMMENT <>", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentGreaterThan(String value) {
            addCriterion("VARIABLE_COMMENT >", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_COMMENT >=", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentLessThan(String value) {
            addCriterion("VARIABLE_COMMENT <", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_COMMENT <=", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentLike(String value) {
            addCriterion("VARIABLE_COMMENT like", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentNotLike(String value) {
            addCriterion("VARIABLE_COMMENT not like", value, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentIn(List<String> values) {
            addCriterion("VARIABLE_COMMENT in", values, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentNotIn(List<String> values) {
            addCriterion("VARIABLE_COMMENT not in", values, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentBetween(String value1, String value2) {
            addCriterion("VARIABLE_COMMENT between", value1, value2, "variableComment");
            return (Criteria) this;
        }

        public Criteria andVariableCommentNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_COMMENT not between", value1, value2, "variableComment");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueIsNull() {
            addCriterion("NUMERIC_MIN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueIsNotNull() {
            addCriterion("NUMERIC_MIN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueEqualTo(String value) {
            addCriterion("NUMERIC_MIN_VALUE =", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueNotEqualTo(String value) {
            addCriterion("NUMERIC_MIN_VALUE <>", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueGreaterThan(String value) {
            addCriterion("NUMERIC_MIN_VALUE >", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueGreaterThanOrEqualTo(String value) {
            addCriterion("NUMERIC_MIN_VALUE >=", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueLessThan(String value) {
            addCriterion("NUMERIC_MIN_VALUE <", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueLessThanOrEqualTo(String value) {
            addCriterion("NUMERIC_MIN_VALUE <=", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueLike(String value) {
            addCriterion("NUMERIC_MIN_VALUE like", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueNotLike(String value) {
            addCriterion("NUMERIC_MIN_VALUE not like", value, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueIn(List<String> values) {
            addCriterion("NUMERIC_MIN_VALUE in", values, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueNotIn(List<String> values) {
            addCriterion("NUMERIC_MIN_VALUE not in", values, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueBetween(String value1, String value2) {
            addCriterion("NUMERIC_MIN_VALUE between", value1, value2, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMinValueNotBetween(String value1, String value2) {
            addCriterion("NUMERIC_MIN_VALUE not between", value1, value2, "numericMinValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueIsNull() {
            addCriterion("NUMERIC_MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueIsNotNull() {
            addCriterion("NUMERIC_MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueEqualTo(String value) {
            addCriterion("NUMERIC_MAX_VALUE =", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueNotEqualTo(String value) {
            addCriterion("NUMERIC_MAX_VALUE <>", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueGreaterThan(String value) {
            addCriterion("NUMERIC_MAX_VALUE >", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueGreaterThanOrEqualTo(String value) {
            addCriterion("NUMERIC_MAX_VALUE >=", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueLessThan(String value) {
            addCriterion("NUMERIC_MAX_VALUE <", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueLessThanOrEqualTo(String value) {
            addCriterion("NUMERIC_MAX_VALUE <=", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueLike(String value) {
            addCriterion("NUMERIC_MAX_VALUE like", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueNotLike(String value) {
            addCriterion("NUMERIC_MAX_VALUE not like", value, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueIn(List<String> values) {
            addCriterion("NUMERIC_MAX_VALUE in", values, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueNotIn(List<String> values) {
            addCriterion("NUMERIC_MAX_VALUE not in", values, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueBetween(String value1, String value2) {
            addCriterion("NUMERIC_MAX_VALUE between", value1, value2, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericMaxValueNotBetween(String value1, String value2) {
            addCriterion("NUMERIC_MAX_VALUE not between", value1, value2, "numericMaxValue");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeIsNull() {
            addCriterion("NUMERIC_BLOCK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeIsNotNull() {
            addCriterion("NUMERIC_BLOCK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeEqualTo(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE =", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeNotEqualTo(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE <>", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeGreaterThan(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE >", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeGreaterThanOrEqualTo(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE >=", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeLessThan(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE <", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeLessThanOrEqualTo(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE <=", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeLike(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE like", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeNotLike(String value) {
            addCriterion("NUMERIC_BLOCK_SIZE not like", value, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeIn(List<String> values) {
            addCriterion("NUMERIC_BLOCK_SIZE in", values, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeNotIn(List<String> values) {
            addCriterion("NUMERIC_BLOCK_SIZE not in", values, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeBetween(String value1, String value2) {
            addCriterion("NUMERIC_BLOCK_SIZE between", value1, value2, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andNumericBlockSizeNotBetween(String value1, String value2) {
            addCriterion("NUMERIC_BLOCK_SIZE not between", value1, value2, "numericBlockSize");
            return (Criteria) this;
        }

        public Criteria andReadOnlyIsNull() {
            addCriterion("READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andReadOnlyIsNotNull() {
            addCriterion("READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andReadOnlyEqualTo(String value) {
            addCriterion("READ_ONLY =", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotEqualTo(String value) {
            addCriterion("READ_ONLY <>", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyGreaterThan(String value) {
            addCriterion("READ_ONLY >", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyGreaterThanOrEqualTo(String value) {
            addCriterion("READ_ONLY >=", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyLessThan(String value) {
            addCriterion("READ_ONLY <", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyLessThanOrEqualTo(String value) {
            addCriterion("READ_ONLY <=", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyLike(String value) {
            addCriterion("READ_ONLY like", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotLike(String value) {
            addCriterion("READ_ONLY not like", value, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyIn(List<String> values) {
            addCriterion("READ_ONLY in", values, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotIn(List<String> values) {
            addCriterion("READ_ONLY not in", values, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyBetween(String value1, String value2) {
            addCriterion("READ_ONLY between", value1, value2, "readOnly");
            return (Criteria) this;
        }

        public Criteria andReadOnlyNotBetween(String value1, String value2) {
            addCriterion("READ_ONLY not between", value1, value2, "readOnly");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentIsNull() {
            addCriterion("COMMAND_LINE_ARGUMENT is null");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentIsNotNull() {
            addCriterion("COMMAND_LINE_ARGUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentEqualTo(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT =", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentNotEqualTo(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT <>", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentGreaterThan(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT >", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT >=", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentLessThan(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT <", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentLessThanOrEqualTo(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT <=", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentLike(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT like", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentNotLike(String value) {
            addCriterion("COMMAND_LINE_ARGUMENT not like", value, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentIn(List<String> values) {
            addCriterion("COMMAND_LINE_ARGUMENT in", values, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentNotIn(List<String> values) {
            addCriterion("COMMAND_LINE_ARGUMENT not in", values, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentBetween(String value1, String value2) {
            addCriterion("COMMAND_LINE_ARGUMENT between", value1, value2, "commandLineArgument");
            return (Criteria) this;
        }

        public Criteria andCommandLineArgumentNotBetween(String value1, String value2) {
            addCriterion("COMMAND_LINE_ARGUMENT not between", value1, value2, "commandLineArgument");
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