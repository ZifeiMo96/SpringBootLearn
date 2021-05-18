package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnIsNull() {
            addCriterion("payment_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSnIsNotNull() {
            addCriterion("payment_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSnEqualTo(String value) {
            addCriterion("payment_sn =", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnNotEqualTo(String value) {
            addCriterion("payment_sn <>", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnGreaterThan(String value) {
            addCriterion("payment_sn >", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnGreaterThanOrEqualTo(String value) {
            addCriterion("payment_sn >=", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnLessThan(String value) {
            addCriterion("payment_sn <", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnLessThanOrEqualTo(String value) {
            addCriterion("payment_sn <=", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnLike(String value) {
            addCriterion("payment_sn like", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnNotLike(String value) {
            addCriterion("payment_sn not like", value, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnIn(List<String> values) {
            addCriterion("payment_sn in", values, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnNotIn(List<String> values) {
            addCriterion("payment_sn not in", values, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnBetween(String value1, String value2) {
            addCriterion("payment_sn between", value1, value2, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andPaymentSnNotBetween(String value1, String value2) {
            addCriterion("payment_sn not between", value1, value2, "paymentSn");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountIsNull() {
            addCriterion("master_amount is null");
            return (Criteria) this;
        }

        public Criteria andMasterAmountIsNotNull() {
            addCriterion("master_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMasterAmountEqualTo(BigDecimal value) {
            addCriterion("master_amount =", value, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountNotEqualTo(BigDecimal value) {
            addCriterion("master_amount <>", value, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountGreaterThan(BigDecimal value) {
            addCriterion("master_amount >", value, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("master_amount >=", value, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountLessThan(BigDecimal value) {
            addCriterion("master_amount <", value, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("master_amount <=", value, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountIn(List<BigDecimal> values) {
            addCriterion("master_amount in", values, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountNotIn(List<BigDecimal> values) {
            addCriterion("master_amount not in", values, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_amount between", value1, value2, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andMasterAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_amount not between", value1, value2, "masterAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountIsNull() {
            addCriterion("author_amount is null");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountIsNotNull() {
            addCriterion("author_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountEqualTo(BigDecimal value) {
            addCriterion("author_amount =", value, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountNotEqualTo(BigDecimal value) {
            addCriterion("author_amount <>", value, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountGreaterThan(BigDecimal value) {
            addCriterion("author_amount >", value, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("author_amount >=", value, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountLessThan(BigDecimal value) {
            addCriterion("author_amount <", value, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("author_amount <=", value, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountIn(List<BigDecimal> values) {
            addCriterion("author_amount in", values, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountNotIn(List<BigDecimal> values) {
            addCriterion("author_amount not in", values, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("author_amount between", value1, value2, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("author_amount not between", value1, value2, "authorAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountIsNull() {
            addCriterion("third_party_amount is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountIsNotNull() {
            addCriterion("third_party_amount is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountEqualTo(BigDecimal value) {
            addCriterion("third_party_amount =", value, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountNotEqualTo(BigDecimal value) {
            addCriterion("third_party_amount <>", value, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountGreaterThan(BigDecimal value) {
            addCriterion("third_party_amount >", value, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("third_party_amount >=", value, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountLessThan(BigDecimal value) {
            addCriterion("third_party_amount <", value, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("third_party_amount <=", value, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountIn(List<BigDecimal> values) {
            addCriterion("third_party_amount in", values, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountNotIn(List<BigDecimal> values) {
            addCriterion("third_party_amount not in", values, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_party_amount between", value1, value2, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_party_amount not between", value1, value2, "thirdPartyAmount");
            return (Criteria) this;
        }

        public Criteria andBeScaleIsNull() {
            addCriterion("be_scale is null");
            return (Criteria) this;
        }

        public Criteria andBeScaleIsNotNull() {
            addCriterion("be_scale is not null");
            return (Criteria) this;
        }

        public Criteria andBeScaleEqualTo(Double value) {
            addCriterion("be_scale =", value, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleNotEqualTo(Double value) {
            addCriterion("be_scale <>", value, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleGreaterThan(Double value) {
            addCriterion("be_scale >", value, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("be_scale >=", value, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleLessThan(Double value) {
            addCriterion("be_scale <", value, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleLessThanOrEqualTo(Double value) {
            addCriterion("be_scale <=", value, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleIn(List<Double> values) {
            addCriterion("be_scale in", values, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleNotIn(List<Double> values) {
            addCriterion("be_scale not in", values, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleBetween(Double value1, Double value2) {
            addCriterion("be_scale between", value1, value2, "beScale");
            return (Criteria) this;
        }

        public Criteria andBeScaleNotBetween(Double value1, Double value2) {
            addCriterion("be_scale not between", value1, value2, "beScale");
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

        public Criteria andPayeeIdIsNull() {
            addCriterion("payee_id is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdIsNotNull() {
            addCriterion("payee_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeIdEqualTo(Long value) {
            addCriterion("payee_id =", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotEqualTo(Long value) {
            addCriterion("payee_id <>", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdGreaterThan(Long value) {
            addCriterion("payee_id >", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("payee_id >=", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdLessThan(Long value) {
            addCriterion("payee_id <", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdLessThanOrEqualTo(Long value) {
            addCriterion("payee_id <=", value, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdIn(List<Long> values) {
            addCriterion("payee_id in", values, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotIn(List<Long> values) {
            addCriterion("payee_id not in", values, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdBetween(Long value1, Long value2) {
            addCriterion("payee_id between", value1, value2, "payeeId");
            return (Criteria) this;
        }

        public Criteria andPayeeIdNotBetween(Long value1, Long value2) {
            addCriterion("payee_id not between", value1, value2, "payeeId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIsNull() {
            addCriterion("third_party_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIsNotNull() {
            addCriterion("third_party_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdEqualTo(Long value) {
            addCriterion("third_party_id =", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotEqualTo(Long value) {
            addCriterion("third_party_id <>", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdGreaterThan(Long value) {
            addCriterion("third_party_id >", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("third_party_id >=", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLessThan(Long value) {
            addCriterion("third_party_id <", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLessThanOrEqualTo(Long value) {
            addCriterion("third_party_id <=", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIn(List<Long> values) {
            addCriterion("third_party_id in", values, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotIn(List<Long> values) {
            addCriterion("third_party_id not in", values, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdBetween(Long value1, Long value2) {
            addCriterion("third_party_id between", value1, value2, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotBetween(Long value1, Long value2) {
            addCriterion("third_party_id not between", value1, value2, "thirdPartyId");
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNull() {
            addCriterion("thread_id is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("thread_id =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("thread_id <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("thread_id >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("thread_id >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("thread_id <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("thread_id <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("thread_id in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("thread_id not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("thread_id between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("thread_id not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Short value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Short value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Short value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Short value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Short value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Short> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Short> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Short value1, Short value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Short value1, Short value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
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

        public Criteria andExpiredAtIsNull() {
            addCriterion("expired_at is null");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIsNotNull() {
            addCriterion("expired_at is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredAtEqualTo(Date value) {
            addCriterion("expired_at =", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotEqualTo(Date value) {
            addCriterion("expired_at <>", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtGreaterThan(Date value) {
            addCriterion("expired_at >", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtGreaterThanOrEqualTo(Date value) {
            addCriterion("expired_at >=", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtLessThan(Date value) {
            addCriterion("expired_at <", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtLessThanOrEqualTo(Date value) {
            addCriterion("expired_at <=", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIn(List<Date> values) {
            addCriterion("expired_at in", values, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotIn(List<Date> values) {
            addCriterion("expired_at not in", values, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtBetween(Date value1, Date value2) {
            addCriterion("expired_at between", value1, value2, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotBetween(Date value1, Date value2) {
            addCriterion("expired_at not between", value1, value2, "expiredAt");
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