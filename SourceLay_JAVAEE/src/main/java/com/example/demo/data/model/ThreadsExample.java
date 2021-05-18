package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThreadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreadsExample() {
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

        public Criteria andLastPostedUserIdIsNull() {
            addCriterion("last_posted_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdIsNotNull() {
            addCriterion("last_posted_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdEqualTo(Long value) {
            addCriterion("last_posted_user_id =", value, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdNotEqualTo(Long value) {
            addCriterion("last_posted_user_id <>", value, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdGreaterThan(Long value) {
            addCriterion("last_posted_user_id >", value, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_posted_user_id >=", value, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdLessThan(Long value) {
            addCriterion("last_posted_user_id <", value, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("last_posted_user_id <=", value, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdIn(List<Long> values) {
            addCriterion("last_posted_user_id in", values, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdNotIn(List<Long> values) {
            addCriterion("last_posted_user_id not in", values, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdBetween(Long value1, Long value2) {
            addCriterion("last_posted_user_id between", value1, value2, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andLastPostedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("last_posted_user_id not between", value1, value2, "lastPostedUserId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andAttachmentPriceIsNull() {
            addCriterion("attachment_price is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceIsNotNull() {
            addCriterion("attachment_price is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceEqualTo(BigDecimal value) {
            addCriterion("attachment_price =", value, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceNotEqualTo(BigDecimal value) {
            addCriterion("attachment_price <>", value, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceGreaterThan(BigDecimal value) {
            addCriterion("attachment_price >", value, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attachment_price >=", value, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceLessThan(BigDecimal value) {
            addCriterion("attachment_price <", value, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attachment_price <=", value, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceIn(List<BigDecimal> values) {
            addCriterion("attachment_price in", values, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceNotIn(List<BigDecimal> values) {
            addCriterion("attachment_price not in", values, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attachment_price between", value1, value2, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andAttachmentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attachment_price not between", value1, value2, "attachmentPrice");
            return (Criteria) this;
        }

        public Criteria andFreeWordsIsNull() {
            addCriterion("free_words is null");
            return (Criteria) this;
        }

        public Criteria andFreeWordsIsNotNull() {
            addCriterion("free_words is not null");
            return (Criteria) this;
        }

        public Criteria andFreeWordsEqualTo(Double value) {
            addCriterion("free_words =", value, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsNotEqualTo(Double value) {
            addCriterion("free_words <>", value, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsGreaterThan(Double value) {
            addCriterion("free_words >", value, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsGreaterThanOrEqualTo(Double value) {
            addCriterion("free_words >=", value, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsLessThan(Double value) {
            addCriterion("free_words <", value, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsLessThanOrEqualTo(Double value) {
            addCriterion("free_words <=", value, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsIn(List<Double> values) {
            addCriterion("free_words in", values, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsNotIn(List<Double> values) {
            addCriterion("free_words not in", values, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsBetween(Double value1, Double value2) {
            addCriterion("free_words between", value1, value2, "freeWords");
            return (Criteria) this;
        }

        public Criteria andFreeWordsNotBetween(Double value1, Double value2) {
            addCriterion("free_words not between", value1, value2, "freeWords");
            return (Criteria) this;
        }

        public Criteria andPostCountIsNull() {
            addCriterion("post_count is null");
            return (Criteria) this;
        }

        public Criteria andPostCountIsNotNull() {
            addCriterion("post_count is not null");
            return (Criteria) this;
        }

        public Criteria andPostCountEqualTo(Integer value) {
            addCriterion("post_count =", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountNotEqualTo(Integer value) {
            addCriterion("post_count <>", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountGreaterThan(Integer value) {
            addCriterion("post_count >", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_count >=", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountLessThan(Integer value) {
            addCriterion("post_count <", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountLessThanOrEqualTo(Integer value) {
            addCriterion("post_count <=", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountIn(List<Integer> values) {
            addCriterion("post_count in", values, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountNotIn(List<Integer> values) {
            addCriterion("post_count not in", values, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountBetween(Integer value1, Integer value2) {
            addCriterion("post_count between", value1, value2, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountNotBetween(Integer value1, Integer value2) {
            addCriterion("post_count not between", value1, value2, "postCount");
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

        public Criteria andRewardedCountIsNull() {
            addCriterion("rewarded_count is null");
            return (Criteria) this;
        }

        public Criteria andRewardedCountIsNotNull() {
            addCriterion("rewarded_count is not null");
            return (Criteria) this;
        }

        public Criteria andRewardedCountEqualTo(Integer value) {
            addCriterion("rewarded_count =", value, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountNotEqualTo(Integer value) {
            addCriterion("rewarded_count <>", value, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountGreaterThan(Integer value) {
            addCriterion("rewarded_count >", value, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rewarded_count >=", value, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountLessThan(Integer value) {
            addCriterion("rewarded_count <", value, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountLessThanOrEqualTo(Integer value) {
            addCriterion("rewarded_count <=", value, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountIn(List<Integer> values) {
            addCriterion("rewarded_count in", values, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountNotIn(List<Integer> values) {
            addCriterion("rewarded_count not in", values, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountBetween(Integer value1, Integer value2) {
            addCriterion("rewarded_count between", value1, value2, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andRewardedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("rewarded_count not between", value1, value2, "rewardedCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountIsNull() {
            addCriterion("paid_count is null");
            return (Criteria) this;
        }

        public Criteria andPaidCountIsNotNull() {
            addCriterion("paid_count is not null");
            return (Criteria) this;
        }

        public Criteria andPaidCountEqualTo(Integer value) {
            addCriterion("paid_count =", value, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountNotEqualTo(Integer value) {
            addCriterion("paid_count <>", value, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountGreaterThan(Integer value) {
            addCriterion("paid_count >", value, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid_count >=", value, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountLessThan(Integer value) {
            addCriterion("paid_count <", value, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountLessThanOrEqualTo(Integer value) {
            addCriterion("paid_count <=", value, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountIn(List<Integer> values) {
            addCriterion("paid_count in", values, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountNotIn(List<Integer> values) {
            addCriterion("paid_count not in", values, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountBetween(Integer value1, Integer value2) {
            addCriterion("paid_count between", value1, value2, "paidCount");
            return (Criteria) this;
        }

        public Criteria andPaidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("paid_count not between", value1, value2, "paidCount");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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

        public Criteria andDeletedUserIdIsNull() {
            addCriterion("deleted_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdIsNotNull() {
            addCriterion("deleted_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdEqualTo(Long value) {
            addCriterion("deleted_user_id =", value, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdNotEqualTo(Long value) {
            addCriterion("deleted_user_id <>", value, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdGreaterThan(Long value) {
            addCriterion("deleted_user_id >", value, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deleted_user_id >=", value, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdLessThan(Long value) {
            addCriterion("deleted_user_id <", value, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdLessThanOrEqualTo(Long value) {
            addCriterion("deleted_user_id <=", value, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdIn(List<Long> values) {
            addCriterion("deleted_user_id in", values, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdNotIn(List<Long> values) {
            addCriterion("deleted_user_id not in", values, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdBetween(Long value1, Long value2) {
            addCriterion("deleted_user_id between", value1, value2, "deletedUserId");
            return (Criteria) this;
        }

        public Criteria andDeletedUserIdNotBetween(Long value1, Long value2) {
            addCriterion("deleted_user_id not between", value1, value2, "deletedUserId");
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

        public Criteria andIsStickyIsNull() {
            addCriterion("is_sticky is null");
            return (Criteria) this;
        }

        public Criteria andIsStickyIsNotNull() {
            addCriterion("is_sticky is not null");
            return (Criteria) this;
        }

        public Criteria andIsStickyEqualTo(Byte value) {
            addCriterion("is_sticky =", value, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyNotEqualTo(Byte value) {
            addCriterion("is_sticky <>", value, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyGreaterThan(Byte value) {
            addCriterion("is_sticky >", value, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sticky >=", value, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyLessThan(Byte value) {
            addCriterion("is_sticky <", value, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyLessThanOrEqualTo(Byte value) {
            addCriterion("is_sticky <=", value, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyIn(List<Byte> values) {
            addCriterion("is_sticky in", values, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyNotIn(List<Byte> values) {
            addCriterion("is_sticky not in", values, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyBetween(Byte value1, Byte value2) {
            addCriterion("is_sticky between", value1, value2, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsStickyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sticky not between", value1, value2, "isSticky");
            return (Criteria) this;
        }

        public Criteria andIsEssenceIsNull() {
            addCriterion("is_essence is null");
            return (Criteria) this;
        }

        public Criteria andIsEssenceIsNotNull() {
            addCriterion("is_essence is not null");
            return (Criteria) this;
        }

        public Criteria andIsEssenceEqualTo(Byte value) {
            addCriterion("is_essence =", value, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceNotEqualTo(Byte value) {
            addCriterion("is_essence <>", value, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceGreaterThan(Byte value) {
            addCriterion("is_essence >", value, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_essence >=", value, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceLessThan(Byte value) {
            addCriterion("is_essence <", value, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceLessThanOrEqualTo(Byte value) {
            addCriterion("is_essence <=", value, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceIn(List<Byte> values) {
            addCriterion("is_essence in", values, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceNotIn(List<Byte> values) {
            addCriterion("is_essence not in", values, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceBetween(Byte value1, Byte value2) {
            addCriterion("is_essence between", value1, value2, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsEssenceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_essence not between", value1, value2, "isEssence");
            return (Criteria) this;
        }

        public Criteria andIsSiteIsNull() {
            addCriterion("is_site is null");
            return (Criteria) this;
        }

        public Criteria andIsSiteIsNotNull() {
            addCriterion("is_site is not null");
            return (Criteria) this;
        }

        public Criteria andIsSiteEqualTo(Byte value) {
            addCriterion("is_site =", value, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteNotEqualTo(Byte value) {
            addCriterion("is_site <>", value, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteGreaterThan(Byte value) {
            addCriterion("is_site >", value, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_site >=", value, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteLessThan(Byte value) {
            addCriterion("is_site <", value, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteLessThanOrEqualTo(Byte value) {
            addCriterion("is_site <=", value, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteIn(List<Byte> values) {
            addCriterion("is_site in", values, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteNotIn(List<Byte> values) {
            addCriterion("is_site not in", values, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteBetween(Byte value1, Byte value2) {
            addCriterion("is_site between", value1, value2, "isSite");
            return (Criteria) this;
        }

        public Criteria andIsSiteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_site not between", value1, value2, "isSite");
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

        public Criteria andIsDisplayIsNull() {
            addCriterion("is_display is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNotNull() {
            addCriterion("is_display is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayEqualTo(Byte value) {
            addCriterion("is_display =", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotEqualTo(Byte value) {
            addCriterion("is_display <>", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThan(Byte value) {
            addCriterion("is_display >", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_display >=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThan(Byte value) {
            addCriterion("is_display <", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThanOrEqualTo(Byte value) {
            addCriterion("is_display <=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIn(List<Byte> values) {
            addCriterion("is_display in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotIn(List<Byte> values) {
            addCriterion("is_display not in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayBetween(Byte value1, Byte value2) {
            addCriterion("is_display between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotBetween(Byte value1, Byte value2) {
            addCriterion("is_display not between", value1, value2, "isDisplay");
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