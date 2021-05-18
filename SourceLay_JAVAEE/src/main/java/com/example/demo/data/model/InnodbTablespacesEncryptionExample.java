package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class InnodbTablespacesEncryptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbTablespacesEncryptionExample() {
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

        public Criteria andSpaceEqualTo(Integer value) {
            addCriterion("SPACE =", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotEqualTo(Integer value) {
            addCriterion("SPACE <>", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThan(Integer value) {
            addCriterion("SPACE >", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPACE >=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThan(Integer value) {
            addCriterion("SPACE <", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("SPACE <=", value, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceIn(List<Integer> values) {
            addCriterion("SPACE in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotIn(List<Integer> values) {
            addCriterion("SPACE not in", values, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceBetween(Integer value1, Integer value2) {
            addCriterion("SPACE between", value1, value2, "space");
            return (Criteria) this;
        }

        public Criteria andSpaceNotBetween(Integer value1, Integer value2) {
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

        public Criteria andEncryptionSchemeIsNull() {
            addCriterion("ENCRYPTION_SCHEME is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeIsNotNull() {
            addCriterion("ENCRYPTION_SCHEME is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeEqualTo(Integer value) {
            addCriterion("ENCRYPTION_SCHEME =", value, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeNotEqualTo(Integer value) {
            addCriterion("ENCRYPTION_SCHEME <>", value, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeGreaterThan(Integer value) {
            addCriterion("ENCRYPTION_SCHEME >", value, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENCRYPTION_SCHEME >=", value, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeLessThan(Integer value) {
            addCriterion("ENCRYPTION_SCHEME <", value, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeLessThanOrEqualTo(Integer value) {
            addCriterion("ENCRYPTION_SCHEME <=", value, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeIn(List<Integer> values) {
            addCriterion("ENCRYPTION_SCHEME in", values, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeNotIn(List<Integer> values) {
            addCriterion("ENCRYPTION_SCHEME not in", values, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeBetween(Integer value1, Integer value2) {
            addCriterion("ENCRYPTION_SCHEME between", value1, value2, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andEncryptionSchemeNotBetween(Integer value1, Integer value2) {
            addCriterion("ENCRYPTION_SCHEME not between", value1, value2, "encryptionScheme");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsIsNull() {
            addCriterion("KEYSERVER_REQUESTS is null");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsIsNotNull() {
            addCriterion("KEYSERVER_REQUESTS is not null");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsEqualTo(Integer value) {
            addCriterion("KEYSERVER_REQUESTS =", value, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsNotEqualTo(Integer value) {
            addCriterion("KEYSERVER_REQUESTS <>", value, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsGreaterThan(Integer value) {
            addCriterion("KEYSERVER_REQUESTS >", value, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsGreaterThanOrEqualTo(Integer value) {
            addCriterion("KEYSERVER_REQUESTS >=", value, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsLessThan(Integer value) {
            addCriterion("KEYSERVER_REQUESTS <", value, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsLessThanOrEqualTo(Integer value) {
            addCriterion("KEYSERVER_REQUESTS <=", value, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsIn(List<Integer> values) {
            addCriterion("KEYSERVER_REQUESTS in", values, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsNotIn(List<Integer> values) {
            addCriterion("KEYSERVER_REQUESTS not in", values, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsBetween(Integer value1, Integer value2) {
            addCriterion("KEYSERVER_REQUESTS between", value1, value2, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andKeyserverRequestsNotBetween(Integer value1, Integer value2) {
            addCriterion("KEYSERVER_REQUESTS not between", value1, value2, "keyserverRequests");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionIsNull() {
            addCriterion("MIN_KEY_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionIsNotNull() {
            addCriterion("MIN_KEY_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionEqualTo(Integer value) {
            addCriterion("MIN_KEY_VERSION =", value, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionNotEqualTo(Integer value) {
            addCriterion("MIN_KEY_VERSION <>", value, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionGreaterThan(Integer value) {
            addCriterion("MIN_KEY_VERSION >", value, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_KEY_VERSION >=", value, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionLessThan(Integer value) {
            addCriterion("MIN_KEY_VERSION <", value, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_KEY_VERSION <=", value, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionIn(List<Integer> values) {
            addCriterion("MIN_KEY_VERSION in", values, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionNotIn(List<Integer> values) {
            addCriterion("MIN_KEY_VERSION not in", values, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionBetween(Integer value1, Integer value2) {
            addCriterion("MIN_KEY_VERSION between", value1, value2, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andMinKeyVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_KEY_VERSION not between", value1, value2, "minKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionIsNull() {
            addCriterion("CURRENT_KEY_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionIsNotNull() {
            addCriterion("CURRENT_KEY_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_VERSION =", value, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionNotEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_VERSION <>", value, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionGreaterThan(Integer value) {
            addCriterion("CURRENT_KEY_VERSION >", value, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_VERSION >=", value, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionLessThan(Integer value) {
            addCriterion("CURRENT_KEY_VERSION <", value, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_VERSION <=", value, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionIn(List<Integer> values) {
            addCriterion("CURRENT_KEY_VERSION in", values, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionNotIn(List<Integer> values) {
            addCriterion("CURRENT_KEY_VERSION not in", values, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_KEY_VERSION between", value1, value2, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_KEY_VERSION not between", value1, value2, "currentKeyVersion");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberIsNull() {
            addCriterion("KEY_ROTATION_PAGE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberIsNotNull() {
            addCriterion("KEY_ROTATION_PAGE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberEqualTo(Long value) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER =", value, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberNotEqualTo(Long value) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER <>", value, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberGreaterThan(Long value) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER >", value, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER >=", value, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberLessThan(Long value) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER <", value, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberLessThanOrEqualTo(Long value) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER <=", value, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberIn(List<Long> values) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER in", values, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberNotIn(List<Long> values) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER not in", values, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberBetween(Long value1, Long value2) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER between", value1, value2, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationPageNumberNotBetween(Long value1, Long value2) {
            addCriterion("KEY_ROTATION_PAGE_NUMBER not between", value1, value2, "keyRotationPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberIsNull() {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberIsNotNull() {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberEqualTo(Long value) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER =", value, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberNotEqualTo(Long value) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER <>", value, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberGreaterThan(Long value) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER >", value, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER >=", value, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberLessThan(Long value) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER <", value, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberLessThanOrEqualTo(Long value) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER <=", value, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberIn(List<Long> values) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER in", values, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberNotIn(List<Long> values) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER not in", values, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberBetween(Long value1, Long value2) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER between", value1, value2, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andKeyRotationMaxPageNumberNotBetween(Long value1, Long value2) {
            addCriterion("KEY_ROTATION_MAX_PAGE_NUMBER not between", value1, value2, "keyRotationMaxPageNumber");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdIsNull() {
            addCriterion("CURRENT_KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdIsNotNull() {
            addCriterion("CURRENT_KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_ID =", value, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdNotEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_ID <>", value, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdGreaterThan(Integer value) {
            addCriterion("CURRENT_KEY_ID >", value, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_ID >=", value, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdLessThan(Integer value) {
            addCriterion("CURRENT_KEY_ID <", value, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_KEY_ID <=", value, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdIn(List<Integer> values) {
            addCriterion("CURRENT_KEY_ID in", values, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdNotIn(List<Integer> values) {
            addCriterion("CURRENT_KEY_ID not in", values, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_KEY_ID between", value1, value2, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andCurrentKeyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_KEY_ID not between", value1, value2, "currentKeyId");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingIsNull() {
            addCriterion("ROTATING_OR_FLUSHING is null");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingIsNotNull() {
            addCriterion("ROTATING_OR_FLUSHING is not null");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingEqualTo(Integer value) {
            addCriterion("ROTATING_OR_FLUSHING =", value, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingNotEqualTo(Integer value) {
            addCriterion("ROTATING_OR_FLUSHING <>", value, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingGreaterThan(Integer value) {
            addCriterion("ROTATING_OR_FLUSHING >", value, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROTATING_OR_FLUSHING >=", value, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingLessThan(Integer value) {
            addCriterion("ROTATING_OR_FLUSHING <", value, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingLessThanOrEqualTo(Integer value) {
            addCriterion("ROTATING_OR_FLUSHING <=", value, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingIn(List<Integer> values) {
            addCriterion("ROTATING_OR_FLUSHING in", values, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingNotIn(List<Integer> values) {
            addCriterion("ROTATING_OR_FLUSHING not in", values, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingBetween(Integer value1, Integer value2) {
            addCriterion("ROTATING_OR_FLUSHING between", value1, value2, "rotatingOrFlushing");
            return (Criteria) this;
        }

        public Criteria andRotatingOrFlushingNotBetween(Integer value1, Integer value2) {
            addCriterion("ROTATING_OR_FLUSHING not between", value1, value2, "rotatingOrFlushing");
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