package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserWalletLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWalletLogsExample() {
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

        public Criteria andSourceUserIdIsNull() {
            addCriterion("source_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdIsNotNull() {
            addCriterion("source_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdEqualTo(Long value) {
            addCriterion("source_user_id =", value, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdNotEqualTo(Long value) {
            addCriterion("source_user_id <>", value, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdGreaterThan(Long value) {
            addCriterion("source_user_id >", value, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_user_id >=", value, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdLessThan(Long value) {
            addCriterion("source_user_id <", value, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("source_user_id <=", value, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdIn(List<Long> values) {
            addCriterion("source_user_id in", values, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdNotIn(List<Long> values) {
            addCriterion("source_user_id not in", values, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdBetween(Long value1, Long value2) {
            addCriterion("source_user_id between", value1, value2, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andSourceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("source_user_id not between", value1, value2, "sourceUserId");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountIsNull() {
            addCriterion("change_available_amount is null");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountIsNotNull() {
            addCriterion("change_available_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountEqualTo(BigDecimal value) {
            addCriterion("change_available_amount =", value, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountNotEqualTo(BigDecimal value) {
            addCriterion("change_available_amount <>", value, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountGreaterThan(BigDecimal value) {
            addCriterion("change_available_amount >", value, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_available_amount >=", value, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountLessThan(BigDecimal value) {
            addCriterion("change_available_amount <", value, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_available_amount <=", value, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountIn(List<BigDecimal> values) {
            addCriterion("change_available_amount in", values, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountNotIn(List<BigDecimal> values) {
            addCriterion("change_available_amount not in", values, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_available_amount between", value1, value2, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAvailableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_available_amount not between", value1, value2, "changeAvailableAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountIsNull() {
            addCriterion("change_freeze_amount is null");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountIsNotNull() {
            addCriterion("change_freeze_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountEqualTo(BigDecimal value) {
            addCriterion("change_freeze_amount =", value, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountNotEqualTo(BigDecimal value) {
            addCriterion("change_freeze_amount <>", value, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountGreaterThan(BigDecimal value) {
            addCriterion("change_freeze_amount >", value, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_freeze_amount >=", value, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountLessThan(BigDecimal value) {
            addCriterion("change_freeze_amount <", value, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_freeze_amount <=", value, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountIn(List<BigDecimal> values) {
            addCriterion("change_freeze_amount in", values, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountNotIn(List<BigDecimal> values) {
            addCriterion("change_freeze_amount not in", values, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_freeze_amount between", value1, value2, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeFreezeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_freeze_amount not between", value1, value2, "changeFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(Short value) {
            addCriterion("change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(Short value) {
            addCriterion("change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(Short value) {
            addCriterion("change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(Short value) {
            addCriterion("change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(Short value) {
            addCriterion("change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<Short> values) {
            addCriterion("change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<Short> values) {
            addCriterion("change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(Short value1, Short value2) {
            addCriterion("change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(Short value1, Short value2) {
            addCriterion("change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeDescIsNull() {
            addCriterion("change_desc is null");
            return (Criteria) this;
        }

        public Criteria andChangeDescIsNotNull() {
            addCriterion("change_desc is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDescEqualTo(String value) {
            addCriterion("change_desc =", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotEqualTo(String value) {
            addCriterion("change_desc <>", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescGreaterThan(String value) {
            addCriterion("change_desc >", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescGreaterThanOrEqualTo(String value) {
            addCriterion("change_desc >=", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescLessThan(String value) {
            addCriterion("change_desc <", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescLessThanOrEqualTo(String value) {
            addCriterion("change_desc <=", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescLike(String value) {
            addCriterion("change_desc like", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotLike(String value) {
            addCriterion("change_desc not like", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescIn(List<String> values) {
            addCriterion("change_desc in", values, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotIn(List<String> values) {
            addCriterion("change_desc not in", values, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescBetween(String value1, String value2) {
            addCriterion("change_desc between", value1, value2, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotBetween(String value1, String value2) {
            addCriterion("change_desc not between", value1, value2, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdIsNull() {
            addCriterion("user_wallet_cash_id is null");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdIsNotNull() {
            addCriterion("user_wallet_cash_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdEqualTo(Long value) {
            addCriterion("user_wallet_cash_id =", value, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdNotEqualTo(Long value) {
            addCriterion("user_wallet_cash_id <>", value, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdGreaterThan(Long value) {
            addCriterion("user_wallet_cash_id >", value, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_wallet_cash_id >=", value, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdLessThan(Long value) {
            addCriterion("user_wallet_cash_id <", value, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdLessThanOrEqualTo(Long value) {
            addCriterion("user_wallet_cash_id <=", value, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdIn(List<Long> values) {
            addCriterion("user_wallet_cash_id in", values, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdNotIn(List<Long> values) {
            addCriterion("user_wallet_cash_id not in", values, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdBetween(Long value1, Long value2) {
            addCriterion("user_wallet_cash_id between", value1, value2, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andUserWalletCashIdNotBetween(Long value1, Long value2) {
            addCriterion("user_wallet_cash_id not between", value1, value2, "userWalletCashId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
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