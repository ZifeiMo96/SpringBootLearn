package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SourcelayFileSharedInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcelayFileSharedInfoExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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

        public Criteria andSharedDescIsNull() {
            addCriterion("shared_desc is null");
            return (Criteria) this;
        }

        public Criteria andSharedDescIsNotNull() {
            addCriterion("shared_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSharedDescEqualTo(String value) {
            addCriterion("shared_desc =", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescNotEqualTo(String value) {
            addCriterion("shared_desc <>", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescGreaterThan(String value) {
            addCriterion("shared_desc >", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescGreaterThanOrEqualTo(String value) {
            addCriterion("shared_desc >=", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescLessThan(String value) {
            addCriterion("shared_desc <", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescLessThanOrEqualTo(String value) {
            addCriterion("shared_desc <=", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescLike(String value) {
            addCriterion("shared_desc like", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescNotLike(String value) {
            addCriterion("shared_desc not like", value, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescIn(List<String> values) {
            addCriterion("shared_desc in", values, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescNotIn(List<String> values) {
            addCriterion("shared_desc not in", values, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescBetween(String value1, String value2) {
            addCriterion("shared_desc between", value1, value2, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedDescNotBetween(String value1, String value2) {
            addCriterion("shared_desc not between", value1, value2, "sharedDesc");
            return (Criteria) this;
        }

        public Criteria andSharedTypeIsNull() {
            addCriterion("shared_type is null");
            return (Criteria) this;
        }

        public Criteria andSharedTypeIsNotNull() {
            addCriterion("shared_type is not null");
            return (Criteria) this;
        }

        public Criteria andSharedTypeEqualTo(Short value) {
            addCriterion("shared_type =", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotEqualTo(Short value) {
            addCriterion("shared_type <>", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeGreaterThan(Short value) {
            addCriterion("shared_type >", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("shared_type >=", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeLessThan(Short value) {
            addCriterion("shared_type <", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeLessThanOrEqualTo(Short value) {
            addCriterion("shared_type <=", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeIn(List<Short> values) {
            addCriterion("shared_type in", values, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotIn(List<Short> values) {
            addCriterion("shared_type not in", values, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeBetween(Short value1, Short value2) {
            addCriterion("shared_type between", value1, value2, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotBetween(Short value1, Short value2) {
            addCriterion("shared_type not between", value1, value2, "sharedType");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIsNull() {
            addCriterion("is_anonymous is null");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIsNotNull() {
            addCriterion("is_anonymous is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousEqualTo(Byte value) {
            addCriterion("is_anonymous =", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotEqualTo(Byte value) {
            addCriterion("is_anonymous <>", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousGreaterThan(Byte value) {
            addCriterion("is_anonymous >", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_anonymous >=", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousLessThan(Byte value) {
            addCriterion("is_anonymous <", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousLessThanOrEqualTo(Byte value) {
            addCriterion("is_anonymous <=", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIn(List<Byte> values) {
            addCriterion("is_anonymous in", values, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotIn(List<Byte> values) {
            addCriterion("is_anonymous not in", values, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousBetween(Byte value1, Byte value2) {
            addCriterion("is_anonymous between", value1, value2, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotBetween(Byte value1, Byte value2) {
            addCriterion("is_anonymous not between", value1, value2, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNull() {
            addCriterion("download_count is null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNotNull() {
            addCriterion("download_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountEqualTo(Integer value) {
            addCriterion("download_count =", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotEqualTo(Integer value) {
            addCriterion("download_count <>", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThan(Integer value) {
            addCriterion("download_count >", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_count >=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThan(Integer value) {
            addCriterion("download_count <", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("download_count <=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIn(List<Integer> values) {
            addCriterion("download_count in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotIn(List<Integer> values) {
            addCriterion("download_count not in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("download_count between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("download_count not between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIsNull() {
            addCriterion("is_recommended is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIsNotNull() {
            addCriterion("is_recommended is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedEqualTo(Byte value) {
            addCriterion("is_recommended =", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotEqualTo(Byte value) {
            addCriterion("is_recommended <>", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedGreaterThan(Byte value) {
            addCriterion("is_recommended >", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_recommended >=", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedLessThan(Byte value) {
            addCriterion("is_recommended <", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedLessThanOrEqualTo(Byte value) {
            addCriterion("is_recommended <=", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIn(List<Byte> values) {
            addCriterion("is_recommended in", values, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotIn(List<Byte> values) {
            addCriterion("is_recommended not in", values, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedBetween(Byte value1, Byte value2) {
            addCriterion("is_recommended between", value1, value2, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_recommended not between", value1, value2, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtIsNull() {
            addCriterion("recommended_at is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtIsNotNull() {
            addCriterion("recommended_at is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtEqualTo(Date value) {
            addCriterion("recommended_at =", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotEqualTo(Date value) {
            addCriterion("recommended_at <>", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtGreaterThan(Date value) {
            addCriterion("recommended_at >", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("recommended_at >=", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtLessThan(Date value) {
            addCriterion("recommended_at <", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtLessThanOrEqualTo(Date value) {
            addCriterion("recommended_at <=", value, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtIn(List<Date> values) {
            addCriterion("recommended_at in", values, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotIn(List<Date> values) {
            addCriterion("recommended_at not in", values, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtBetween(Date value1, Date value2) {
            addCriterion("recommended_at between", value1, value2, "recommendedAt");
            return (Criteria) this;
        }

        public Criteria andRecommendedAtNotBetween(Date value1, Date value2) {
            addCriterion("recommended_at not between", value1, value2, "recommendedAt");
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

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Date value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedIdIsNull() {
            addCriterion("deleted_id is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIdIsNotNull() {
            addCriterion("deleted_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedIdEqualTo(Long value) {
            addCriterion("deleted_id =", value, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdNotEqualTo(Long value) {
            addCriterion("deleted_id <>", value, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdGreaterThan(Long value) {
            addCriterion("deleted_id >", value, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deleted_id >=", value, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdLessThan(Long value) {
            addCriterion("deleted_id <", value, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdLessThanOrEqualTo(Long value) {
            addCriterion("deleted_id <=", value, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdIn(List<Long> values) {
            addCriterion("deleted_id in", values, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdNotIn(List<Long> values) {
            addCriterion("deleted_id not in", values, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdBetween(Long value1, Long value2) {
            addCriterion("deleted_id between", value1, value2, "deletedId");
            return (Criteria) this;
        }

        public Criteria andDeletedIdNotBetween(Long value1, Long value2) {
            addCriterion("deleted_id not between", value1, value2, "deletedId");
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