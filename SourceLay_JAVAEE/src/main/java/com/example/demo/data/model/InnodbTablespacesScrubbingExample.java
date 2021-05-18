package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InnodbTablespacesScrubbingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbTablespacesScrubbingExample() {
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

        public Criteria andSpaceIsNull() {
            addCriterion("SPACE is null");
            return (Criteria) this;
        }

        public Criteria andSpaceIsNotNull() {
            addCriterion("SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceEqualTo(Long value) {
            addCriterion("SPACE =", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotEqualTo(Long value) {
            addCriterion("SPACE <>", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThan(Long value) {
            addCriterion("SPACE >", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThanOrEqualTo(Long value) {
            addCriterion("SPACE >=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThan(Long value) {
            addCriterion("SPACE <", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThanOrEqualTo(Long value) {
            addCriterion("SPACE <=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceIn(List<Long> values) {
            addCriterion("SPACE in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotIn(List<Long> values) {
            addCriterion("SPACE not in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceBetween(Long value1, Long value2) {
            addCriterion("SPACE between", value1, value2, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotBetween(Long value1, Long value2) {
            addCriterion("SPACE not between", value1, value2, "space");
            return (Criteria) this;
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

        public Criteria andCompressedIsNull() {
            addCriterion("COMPRESSED is null");
            return (Criteria) this;
        }

        public Criteria andCompressedIsNotNull() {
            addCriterion("COMPRESSED is not null");
            return (Criteria) this;
        }

        public Criteria andCompressedEqualTo(Integer value) {
            addCriterion("COMPRESSED =", value, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedNotEqualTo(Integer value) {
            addCriterion("COMPRESSED <>", value, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedGreaterThan(Integer value) {
            addCriterion("COMPRESSED >", value, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPRESSED >=", value, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedLessThan(Integer value) {
            addCriterion("COMPRESSED <", value, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedLessThanOrEqualTo(Integer value) {
            addCriterion("COMPRESSED <=", value, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedIn(List<Integer> values) {
            addCriterion("COMPRESSED in", values, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedNotIn(List<Integer> values) {
            addCriterion("COMPRESSED not in", values, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedBetween(Integer value1, Integer value2) {
            addCriterion("COMPRESSED between", value1, value2, "compressed");
            return (Criteria) this;
        }

        public Criteria andCompressedNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPRESSED not between", value1, value2, "compressed");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedIsNull() {
            addCriterion("LAST_SCRUB_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedIsNotNull() {
            addCriterion("LAST_SCRUB_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedEqualTo(Date value) {
            addCriterion("LAST_SCRUB_COMPLETED =", value, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedNotEqualTo(Date value) {
            addCriterion("LAST_SCRUB_COMPLETED <>", value, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedGreaterThan(Date value) {
            addCriterion("LAST_SCRUB_COMPLETED >", value, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SCRUB_COMPLETED >=", value, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedLessThan(Date value) {
            addCriterion("LAST_SCRUB_COMPLETED <", value, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SCRUB_COMPLETED <=", value, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedIn(List<Date> values) {
            addCriterion("LAST_SCRUB_COMPLETED in", values, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedNotIn(List<Date> values) {
            addCriterion("LAST_SCRUB_COMPLETED not in", values, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedBetween(Date value1, Date value2) {
            addCriterion("LAST_SCRUB_COMPLETED between", value1, value2, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andLastScrubCompletedNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SCRUB_COMPLETED not between", value1, value2, "lastScrubCompleted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedIsNull() {
            addCriterion("CURRENT_SCRUB_STARTED is null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedIsNotNull() {
            addCriterion("CURRENT_SCRUB_STARTED is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedEqualTo(Date value) {
            addCriterion("CURRENT_SCRUB_STARTED =", value, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedNotEqualTo(Date value) {
            addCriterion("CURRENT_SCRUB_STARTED <>", value, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedGreaterThan(Date value) {
            addCriterion("CURRENT_SCRUB_STARTED >", value, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedGreaterThanOrEqualTo(Date value) {
            addCriterion("CURRENT_SCRUB_STARTED >=", value, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedLessThan(Date value) {
            addCriterion("CURRENT_SCRUB_STARTED <", value, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedLessThanOrEqualTo(Date value) {
            addCriterion("CURRENT_SCRUB_STARTED <=", value, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedIn(List<Date> values) {
            addCriterion("CURRENT_SCRUB_STARTED in", values, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedNotIn(List<Date> values) {
            addCriterion("CURRENT_SCRUB_STARTED not in", values, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedBetween(Date value1, Date value2) {
            addCriterion("CURRENT_SCRUB_STARTED between", value1, value2, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubStartedNotBetween(Date value1, Date value2) {
            addCriterion("CURRENT_SCRUB_STARTED not between", value1, value2, "currentScrubStarted");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsIsNull() {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS is null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsIsNotNull() {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsEqualTo(Integer value) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS =", value, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsNotEqualTo(Integer value) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS <>", value, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsGreaterThan(Integer value) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS >", value, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS >=", value, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsLessThan(Integer value) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS <", value, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS <=", value, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsIn(List<Integer> values) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS in", values, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsNotIn(List<Integer> values) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS not in", values, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS between", value1, value2, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubActiveThreadsNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_SCRUB_ACTIVE_THREADS not between", value1, value2, "currentScrubActiveThreads");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberIsNull() {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberIsNotNull() {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER =", value, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberNotEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER <>", value, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberGreaterThan(Long value) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER >", value, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER >=", value, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberLessThan(Long value) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER <", value, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER <=", value, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberIn(List<Long> values) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER in", values, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberNotIn(List<Long> values) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER not in", values, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberBetween(Long value1, Long value2) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER between", value1, value2, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubPageNumberNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_SCRUB_PAGE_NUMBER not between", value1, value2, "currentScrubPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberIsNull() {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberIsNotNull() {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER =", value, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberNotEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER <>", value, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberGreaterThan(Long value) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER >", value, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER >=", value, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberLessThan(Long value) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER <", value, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER <=", value, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberIn(List<Long> values) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER in", values, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberNotIn(List<Long> values) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER not in", values, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberBetween(Long value1, Long value2) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER between", value1, value2, "currentScrubMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentScrubMaxPageNumberNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_SCRUB_MAX_PAGE_NUMBER not between", value1, value2, "currentScrubMaxPageNumber");
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