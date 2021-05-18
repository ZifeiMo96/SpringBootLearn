package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class InnodbSysSemaphoreWaitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbSysSemaphoreWaitsExample() {
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

        public Criteria andThreadIdIsNull() {
            addCriterion("THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("THREAD_ID =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("THREAD_ID <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("THREAD_ID >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("THREAD_ID <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("THREAD_ID in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("THREAD_ID not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("OBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("OBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("OBJECT_NAME =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("OBJECT_NAME <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("OBJECT_NAME >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(String value) {
            addCriterion("OBJECT_NAME <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLike(String value) {
            addCriterion("OBJECT_NAME like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotLike(String value) {
            addCriterion("OBJECT_NAME not like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<String> values) {
            addCriterion("OBJECT_NAME in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<String> values) {
            addCriterion("OBJECT_NAME not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andFileIsNull() {
            addCriterion("FILE is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("FILE is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("FILE =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("FILE <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("FILE >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("FILE >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("FILE <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("FILE <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("FILE like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("FILE not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("FILE in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("FILE not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("FILE between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("FILE not between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("LINE is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("LINE is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(Integer value) {
            addCriterion("LINE =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(Integer value) {
            addCriterion("LINE <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(Integer value) {
            addCriterion("LINE >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINE >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(Integer value) {
            addCriterion("LINE <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(Integer value) {
            addCriterion("LINE <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<Integer> values) {
            addCriterion("LINE in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<Integer> values) {
            addCriterion("LINE not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(Integer value1, Integer value2) {
            addCriterion("LINE between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(Integer value1, Integer value2) {
            addCriterion("LINE not between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIsNull() {
            addCriterion("WAIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIsNotNull() {
            addCriterion("WAIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWaitTimeEqualTo(Long value) {
            addCriterion("WAIT_TIME =", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotEqualTo(Long value) {
            addCriterion("WAIT_TIME <>", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeGreaterThan(Long value) {
            addCriterion("WAIT_TIME >", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("WAIT_TIME >=", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeLessThan(Long value) {
            addCriterion("WAIT_TIME <", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeLessThanOrEqualTo(Long value) {
            addCriterion("WAIT_TIME <=", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIn(List<Long> values) {
            addCriterion("WAIT_TIME in", values, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotIn(List<Long> values) {
            addCriterion("WAIT_TIME not in", values, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeBetween(Long value1, Long value2) {
            addCriterion("WAIT_TIME between", value1, value2, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotBetween(Long value1, Long value2) {
            addCriterion("WAIT_TIME not between", value1, value2, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitObjectIsNull() {
            addCriterion("WAIT_OBJECT is null");
            return (Criteria) this;
        }

        public Criteria andWaitObjectIsNotNull() {
            addCriterion("WAIT_OBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andWaitObjectEqualTo(Long value) {
            addCriterion("WAIT_OBJECT =", value, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectNotEqualTo(Long value) {
            addCriterion("WAIT_OBJECT <>", value, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectGreaterThan(Long value) {
            addCriterion("WAIT_OBJECT >", value, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectGreaterThanOrEqualTo(Long value) {
            addCriterion("WAIT_OBJECT >=", value, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectLessThan(Long value) {
            addCriterion("WAIT_OBJECT <", value, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectLessThanOrEqualTo(Long value) {
            addCriterion("WAIT_OBJECT <=", value, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectIn(List<Long> values) {
            addCriterion("WAIT_OBJECT in", values, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectNotIn(List<Long> values) {
            addCriterion("WAIT_OBJECT not in", values, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectBetween(Long value1, Long value2) {
            addCriterion("WAIT_OBJECT between", value1, value2, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitObjectNotBetween(Long value1, Long value2) {
            addCriterion("WAIT_OBJECT not between", value1, value2, "waitObject");
            return (Criteria) this;
        }

        public Criteria andWaitTypeIsNull() {
            addCriterion("WAIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWaitTypeIsNotNull() {
            addCriterion("WAIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWaitTypeEqualTo(String value) {
            addCriterion("WAIT_TYPE =", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeNotEqualTo(String value) {
            addCriterion("WAIT_TYPE <>", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeGreaterThan(String value) {
            addCriterion("WAIT_TYPE >", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WAIT_TYPE >=", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeLessThan(String value) {
            addCriterion("WAIT_TYPE <", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeLessThanOrEqualTo(String value) {
            addCriterion("WAIT_TYPE <=", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeLike(String value) {
            addCriterion("WAIT_TYPE like", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeNotLike(String value) {
            addCriterion("WAIT_TYPE not like", value, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeIn(List<String> values) {
            addCriterion("WAIT_TYPE in", values, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeNotIn(List<String> values) {
            addCriterion("WAIT_TYPE not in", values, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeBetween(String value1, String value2) {
            addCriterion("WAIT_TYPE between", value1, value2, "waitType");
            return (Criteria) this;
        }

        public Criteria andWaitTypeNotBetween(String value1, String value2) {
            addCriterion("WAIT_TYPE not between", value1, value2, "waitType");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdIsNull() {
            addCriterion("HOLDER_THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdIsNotNull() {
            addCriterion("HOLDER_THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdEqualTo(Long value) {
            addCriterion("HOLDER_THREAD_ID =", value, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdNotEqualTo(Long value) {
            addCriterion("HOLDER_THREAD_ID <>", value, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdGreaterThan(Long value) {
            addCriterion("HOLDER_THREAD_ID >", value, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HOLDER_THREAD_ID >=", value, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdLessThan(Long value) {
            addCriterion("HOLDER_THREAD_ID <", value, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("HOLDER_THREAD_ID <=", value, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdIn(List<Long> values) {
            addCriterion("HOLDER_THREAD_ID in", values, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdNotIn(List<Long> values) {
            addCriterion("HOLDER_THREAD_ID not in", values, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdBetween(Long value1, Long value2) {
            addCriterion("HOLDER_THREAD_ID between", value1, value2, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("HOLDER_THREAD_ID not between", value1, value2, "holderThreadId");
            return (Criteria) this;
        }

        public Criteria andHolderFileIsNull() {
            addCriterion("HOLDER_FILE is null");
            return (Criteria) this;
        }

        public Criteria andHolderFileIsNotNull() {
            addCriterion("HOLDER_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andHolderFileEqualTo(String value) {
            addCriterion("HOLDER_FILE =", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileNotEqualTo(String value) {
            addCriterion("HOLDER_FILE <>", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileGreaterThan(String value) {
            addCriterion("HOLDER_FILE >", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDER_FILE >=", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileLessThan(String value) {
            addCriterion("HOLDER_FILE <", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileLessThanOrEqualTo(String value) {
            addCriterion("HOLDER_FILE <=", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileLike(String value) {
            addCriterion("HOLDER_FILE like", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileNotLike(String value) {
            addCriterion("HOLDER_FILE not like", value, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileIn(List<String> values) {
            addCriterion("HOLDER_FILE in", values, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileNotIn(List<String> values) {
            addCriterion("HOLDER_FILE not in", values, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileBetween(String value1, String value2) {
            addCriterion("HOLDER_FILE between", value1, value2, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderFileNotBetween(String value1, String value2) {
            addCriterion("HOLDER_FILE not between", value1, value2, "holderFile");
            return (Criteria) this;
        }

        public Criteria andHolderLineIsNull() {
            addCriterion("HOLDER_LINE is null");
            return (Criteria) this;
        }

        public Criteria andHolderLineIsNotNull() {
            addCriterion("HOLDER_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andHolderLineEqualTo(Integer value) {
            addCriterion("HOLDER_LINE =", value, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineNotEqualTo(Integer value) {
            addCriterion("HOLDER_LINE <>", value, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineGreaterThan(Integer value) {
            addCriterion("HOLDER_LINE >", value, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOLDER_LINE >=", value, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineLessThan(Integer value) {
            addCriterion("HOLDER_LINE <", value, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineLessThanOrEqualTo(Integer value) {
            addCriterion("HOLDER_LINE <=", value, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineIn(List<Integer> values) {
            addCriterion("HOLDER_LINE in", values, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineNotIn(List<Integer> values) {
            addCriterion("HOLDER_LINE not in", values, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineBetween(Integer value1, Integer value2) {
            addCriterion("HOLDER_LINE between", value1, value2, "holderLine");
            return (Criteria) this;
        }

        public Criteria andHolderLineNotBetween(Integer value1, Integer value2) {
            addCriterion("HOLDER_LINE not between", value1, value2, "holderLine");
            return (Criteria) this;
        }

        public Criteria andCreatedFileIsNull() {
            addCriterion("CREATED_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedFileIsNotNull() {
            addCriterion("CREATED_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedFileEqualTo(String value) {
            addCriterion("CREATED_FILE =", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileNotEqualTo(String value) {
            addCriterion("CREATED_FILE <>", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileGreaterThan(String value) {
            addCriterion("CREATED_FILE >", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_FILE >=", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileLessThan(String value) {
            addCriterion("CREATED_FILE <", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileLessThanOrEqualTo(String value) {
            addCriterion("CREATED_FILE <=", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileLike(String value) {
            addCriterion("CREATED_FILE like", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileNotLike(String value) {
            addCriterion("CREATED_FILE not like", value, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileIn(List<String> values) {
            addCriterion("CREATED_FILE in", values, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileNotIn(List<String> values) {
            addCriterion("CREATED_FILE not in", values, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileBetween(String value1, String value2) {
            addCriterion("CREATED_FILE between", value1, value2, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedFileNotBetween(String value1, String value2) {
            addCriterion("CREATED_FILE not between", value1, value2, "createdFile");
            return (Criteria) this;
        }

        public Criteria andCreatedLineIsNull() {
            addCriterion("CREATED_LINE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedLineIsNotNull() {
            addCriterion("CREATED_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedLineEqualTo(Integer value) {
            addCriterion("CREATED_LINE =", value, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineNotEqualTo(Integer value) {
            addCriterion("CREATED_LINE <>", value, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineGreaterThan(Integer value) {
            addCriterion("CREATED_LINE >", value, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_LINE >=", value, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineLessThan(Integer value) {
            addCriterion("CREATED_LINE <", value, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_LINE <=", value, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineIn(List<Integer> values) {
            addCriterion("CREATED_LINE in", values, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineNotIn(List<Integer> values) {
            addCriterion("CREATED_LINE not in", values, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_LINE between", value1, value2, "createdLine");
            return (Criteria) this;
        }

        public Criteria andCreatedLineNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_LINE not between", value1, value2, "createdLine");
            return (Criteria) this;
        }

        public Criteria andWriterThreadIsNull() {
            addCriterion("WRITER_THREAD is null");
            return (Criteria) this;
        }

        public Criteria andWriterThreadIsNotNull() {
            addCriterion("WRITER_THREAD is not null");
            return (Criteria) this;
        }

        public Criteria andWriterThreadEqualTo(Long value) {
            addCriterion("WRITER_THREAD =", value, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadNotEqualTo(Long value) {
            addCriterion("WRITER_THREAD <>", value, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadGreaterThan(Long value) {
            addCriterion("WRITER_THREAD >", value, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITER_THREAD >=", value, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadLessThan(Long value) {
            addCriterion("WRITER_THREAD <", value, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadLessThanOrEqualTo(Long value) {
            addCriterion("WRITER_THREAD <=", value, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadIn(List<Long> values) {
            addCriterion("WRITER_THREAD in", values, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadNotIn(List<Long> values) {
            addCriterion("WRITER_THREAD not in", values, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadBetween(Long value1, Long value2) {
            addCriterion("WRITER_THREAD between", value1, value2, "writerThread");
            return (Criteria) this;
        }

        public Criteria andWriterThreadNotBetween(Long value1, Long value2) {
            addCriterion("WRITER_THREAD not between", value1, value2, "writerThread");
            return (Criteria) this;
        }

        public Criteria andReservationModeIsNull() {
            addCriterion("RESERVATION_MODE is null");
            return (Criteria) this;
        }

        public Criteria andReservationModeIsNotNull() {
            addCriterion("RESERVATION_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andReservationModeEqualTo(String value) {
            addCriterion("RESERVATION_MODE =", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeNotEqualTo(String value) {
            addCriterion("RESERVATION_MODE <>", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeGreaterThan(String value) {
            addCriterion("RESERVATION_MODE >", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVATION_MODE >=", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeLessThan(String value) {
            addCriterion("RESERVATION_MODE <", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeLessThanOrEqualTo(String value) {
            addCriterion("RESERVATION_MODE <=", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeLike(String value) {
            addCriterion("RESERVATION_MODE like", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeNotLike(String value) {
            addCriterion("RESERVATION_MODE not like", value, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeIn(List<String> values) {
            addCriterion("RESERVATION_MODE in", values, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeNotIn(List<String> values) {
            addCriterion("RESERVATION_MODE not in", values, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeBetween(String value1, String value2) {
            addCriterion("RESERVATION_MODE between", value1, value2, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReservationModeNotBetween(String value1, String value2) {
            addCriterion("RESERVATION_MODE not between", value1, value2, "reservationMode");
            return (Criteria) this;
        }

        public Criteria andReadersIsNull() {
            addCriterion("READERS is null");
            return (Criteria) this;
        }

        public Criteria andReadersIsNotNull() {
            addCriterion("READERS is not null");
            return (Criteria) this;
        }

        public Criteria andReadersEqualTo(Integer value) {
            addCriterion("READERS =", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotEqualTo(Integer value) {
            addCriterion("READERS <>", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThan(Integer value) {
            addCriterion("READERS >", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersGreaterThanOrEqualTo(Integer value) {
            addCriterion("READERS >=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThan(Integer value) {
            addCriterion("READERS <", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersLessThanOrEqualTo(Integer value) {
            addCriterion("READERS <=", value, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersIn(List<Integer> values) {
            addCriterion("READERS in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotIn(List<Integer> values) {
            addCriterion("READERS not in", values, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersBetween(Integer value1, Integer value2) {
            addCriterion("READERS between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andReadersNotBetween(Integer value1, Integer value2) {
            addCriterion("READERS not between", value1, value2, "readers");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagIsNull() {
            addCriterion("WAITERS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagIsNotNull() {
            addCriterion("WAITERS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagEqualTo(Long value) {
            addCriterion("WAITERS_FLAG =", value, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagNotEqualTo(Long value) {
            addCriterion("WAITERS_FLAG <>", value, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagGreaterThan(Long value) {
            addCriterion("WAITERS_FLAG >", value, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("WAITERS_FLAG >=", value, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagLessThan(Long value) {
            addCriterion("WAITERS_FLAG <", value, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagLessThanOrEqualTo(Long value) {
            addCriterion("WAITERS_FLAG <=", value, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagIn(List<Long> values) {
            addCriterion("WAITERS_FLAG in", values, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagNotIn(List<Long> values) {
            addCriterion("WAITERS_FLAG not in", values, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagBetween(Long value1, Long value2) {
            addCriterion("WAITERS_FLAG between", value1, value2, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andWaitersFlagNotBetween(Long value1, Long value2) {
            addCriterion("WAITERS_FLAG not between", value1, value2, "waitersFlag");
            return (Criteria) this;
        }

        public Criteria andLockWordIsNull() {
            addCriterion("LOCK_WORD is null");
            return (Criteria) this;
        }

        public Criteria andLockWordIsNotNull() {
            addCriterion("LOCK_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andLockWordEqualTo(Long value) {
            addCriterion("LOCK_WORD =", value, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordNotEqualTo(Long value) {
            addCriterion("LOCK_WORD <>", value, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordGreaterThan(Long value) {
            addCriterion("LOCK_WORD >", value, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordGreaterThanOrEqualTo(Long value) {
            addCriterion("LOCK_WORD >=", value, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordLessThan(Long value) {
            addCriterion("LOCK_WORD <", value, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordLessThanOrEqualTo(Long value) {
            addCriterion("LOCK_WORD <=", value, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordIn(List<Long> values) {
            addCriterion("LOCK_WORD in", values, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordNotIn(List<Long> values) {
            addCriterion("LOCK_WORD not in", values, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordBetween(Long value1, Long value2) {
            addCriterion("LOCK_WORD between", value1, value2, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLockWordNotBetween(Long value1, Long value2) {
            addCriterion("LOCK_WORD not between", value1, value2, "lockWord");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileIsNull() {
            addCriterion("LAST_WRITER_FILE is null");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileIsNotNull() {
            addCriterion("LAST_WRITER_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileEqualTo(String value) {
            addCriterion("LAST_WRITER_FILE =", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileNotEqualTo(String value) {
            addCriterion("LAST_WRITER_FILE <>", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileGreaterThan(String value) {
            addCriterion("LAST_WRITER_FILE >", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_WRITER_FILE >=", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileLessThan(String value) {
            addCriterion("LAST_WRITER_FILE <", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileLessThanOrEqualTo(String value) {
            addCriterion("LAST_WRITER_FILE <=", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileLike(String value) {
            addCriterion("LAST_WRITER_FILE like", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileNotLike(String value) {
            addCriterion("LAST_WRITER_FILE not like", value, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileIn(List<String> values) {
            addCriterion("LAST_WRITER_FILE in", values, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileNotIn(List<String> values) {
            addCriterion("LAST_WRITER_FILE not in", values, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileBetween(String value1, String value2) {
            addCriterion("LAST_WRITER_FILE between", value1, value2, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterFileNotBetween(String value1, String value2) {
            addCriterion("LAST_WRITER_FILE not between", value1, value2, "lastWriterFile");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineIsNull() {
            addCriterion("LAST_WRITER_LINE is null");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineIsNotNull() {
            addCriterion("LAST_WRITER_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineEqualTo(Integer value) {
            addCriterion("LAST_WRITER_LINE =", value, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineNotEqualTo(Integer value) {
            addCriterion("LAST_WRITER_LINE <>", value, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineGreaterThan(Integer value) {
            addCriterion("LAST_WRITER_LINE >", value, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_WRITER_LINE >=", value, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineLessThan(Integer value) {
            addCriterion("LAST_WRITER_LINE <", value, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_WRITER_LINE <=", value, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineIn(List<Integer> values) {
            addCriterion("LAST_WRITER_LINE in", values, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineNotIn(List<Integer> values) {
            addCriterion("LAST_WRITER_LINE not in", values, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineBetween(Integer value1, Integer value2) {
            addCriterion("LAST_WRITER_LINE between", value1, value2, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andLastWriterLineNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_WRITER_LINE not between", value1, value2, "lastWriterLine");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountIsNull() {
            addCriterion("OS_WAIT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountIsNotNull() {
            addCriterion("OS_WAIT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountEqualTo(Integer value) {
            addCriterion("OS_WAIT_COUNT =", value, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountNotEqualTo(Integer value) {
            addCriterion("OS_WAIT_COUNT <>", value, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountGreaterThan(Integer value) {
            addCriterion("OS_WAIT_COUNT >", value, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OS_WAIT_COUNT >=", value, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountLessThan(Integer value) {
            addCriterion("OS_WAIT_COUNT <", value, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountLessThanOrEqualTo(Integer value) {
            addCriterion("OS_WAIT_COUNT <=", value, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountIn(List<Integer> values) {
            addCriterion("OS_WAIT_COUNT in", values, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountNotIn(List<Integer> values) {
            addCriterion("OS_WAIT_COUNT not in", values, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountBetween(Integer value1, Integer value2) {
            addCriterion("OS_WAIT_COUNT between", value1, value2, "osWaitCount");
            return (Criteria) this;
        }

        public Criteria andOsWaitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("OS_WAIT_COUNT not between", value1, value2, "osWaitCount");
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