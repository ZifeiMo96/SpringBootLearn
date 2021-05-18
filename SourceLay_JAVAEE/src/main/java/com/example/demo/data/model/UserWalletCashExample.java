package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserWalletCashExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWalletCashExample() {
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

        public Criteria andCashSnIsNull() {
            addCriterion("cash_sn is null");
            return (Criteria) this;
        }

        public Criteria andCashSnIsNotNull() {
            addCriterion("cash_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCashSnEqualTo(Long value) {
            addCriterion("cash_sn =", value, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnNotEqualTo(Long value) {
            addCriterion("cash_sn <>", value, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnGreaterThan(Long value) {
            addCriterion("cash_sn >", value, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnGreaterThanOrEqualTo(Long value) {
            addCriterion("cash_sn >=", value, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnLessThan(Long value) {
            addCriterion("cash_sn <", value, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnLessThanOrEqualTo(Long value) {
            addCriterion("cash_sn <=", value, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnIn(List<Long> values) {
            addCriterion("cash_sn in", values, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnNotIn(List<Long> values) {
            addCriterion("cash_sn not in", values, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnBetween(Long value1, Long value2) {
            addCriterion("cash_sn between", value1, value2, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashSnNotBetween(Long value1, Long value2) {
            addCriterion("cash_sn not between", value1, value2, "cashSn");
            return (Criteria) this;
        }

        public Criteria andCashChargeIsNull() {
            addCriterion("cash_charge is null");
            return (Criteria) this;
        }

        public Criteria andCashChargeIsNotNull() {
            addCriterion("cash_charge is not null");
            return (Criteria) this;
        }

        public Criteria andCashChargeEqualTo(BigDecimal value) {
            addCriterion("cash_charge =", value, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeNotEqualTo(BigDecimal value) {
            addCriterion("cash_charge <>", value, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeGreaterThan(BigDecimal value) {
            addCriterion("cash_charge >", value, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_charge >=", value, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeLessThan(BigDecimal value) {
            addCriterion("cash_charge <", value, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_charge <=", value, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeIn(List<BigDecimal> values) {
            addCriterion("cash_charge in", values, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeNotIn(List<BigDecimal> values) {
            addCriterion("cash_charge not in", values, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_charge between", value1, value2, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_charge not between", value1, value2, "cashCharge");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountIsNull() {
            addCriterion("cash_actual_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountIsNotNull() {
            addCriterion("cash_actual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountEqualTo(BigDecimal value) {
            addCriterion("cash_actual_amount =", value, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountNotEqualTo(BigDecimal value) {
            addCriterion("cash_actual_amount <>", value, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountGreaterThan(BigDecimal value) {
            addCriterion("cash_actual_amount >", value, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_actual_amount >=", value, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountLessThan(BigDecimal value) {
            addCriterion("cash_actual_amount <", value, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_actual_amount <=", value, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountIn(List<BigDecimal> values) {
            addCriterion("cash_actual_amount in", values, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountNotIn(List<BigDecimal> values) {
            addCriterion("cash_actual_amount not in", values, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_actual_amount between", value1, value2, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashActualAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_actual_amount not between", value1, value2, "cashActualAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountIsNull() {
            addCriterion("cash_apply_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountIsNotNull() {
            addCriterion("cash_apply_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountEqualTo(BigDecimal value) {
            addCriterion("cash_apply_amount =", value, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountNotEqualTo(BigDecimal value) {
            addCriterion("cash_apply_amount <>", value, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountGreaterThan(BigDecimal value) {
            addCriterion("cash_apply_amount >", value, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_apply_amount >=", value, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountLessThan(BigDecimal value) {
            addCriterion("cash_apply_amount <", value, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_apply_amount <=", value, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountIn(List<BigDecimal> values) {
            addCriterion("cash_apply_amount in", values, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountNotIn(List<BigDecimal> values) {
            addCriterion("cash_apply_amount not in", values, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_apply_amount between", value1, value2, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashApplyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_apply_amount not between", value1, value2, "cashApplyAmount");
            return (Criteria) this;
        }

        public Criteria andCashStatusIsNull() {
            addCriterion("cash_status is null");
            return (Criteria) this;
        }

        public Criteria andCashStatusIsNotNull() {
            addCriterion("cash_status is not null");
            return (Criteria) this;
        }

        public Criteria andCashStatusEqualTo(Byte value) {
            addCriterion("cash_status =", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusNotEqualTo(Byte value) {
            addCriterion("cash_status <>", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusGreaterThan(Byte value) {
            addCriterion("cash_status >", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cash_status >=", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusLessThan(Byte value) {
            addCriterion("cash_status <", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusLessThanOrEqualTo(Byte value) {
            addCriterion("cash_status <=", value, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusIn(List<Byte> values) {
            addCriterion("cash_status in", values, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusNotIn(List<Byte> values) {
            addCriterion("cash_status not in", values, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusBetween(Byte value1, Byte value2) {
            addCriterion("cash_status between", value1, value2, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cash_status not between", value1, value2, "cashStatus");
            return (Criteria) this;
        }

        public Criteria andCashMobileIsNull() {
            addCriterion("cash_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCashMobileIsNotNull() {
            addCriterion("cash_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCashMobileEqualTo(String value) {
            addCriterion("cash_mobile =", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileNotEqualTo(String value) {
            addCriterion("cash_mobile <>", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileGreaterThan(String value) {
            addCriterion("cash_mobile >", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cash_mobile >=", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileLessThan(String value) {
            addCriterion("cash_mobile <", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileLessThanOrEqualTo(String value) {
            addCriterion("cash_mobile <=", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileLike(String value) {
            addCriterion("cash_mobile like", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileNotLike(String value) {
            addCriterion("cash_mobile not like", value, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileIn(List<String> values) {
            addCriterion("cash_mobile in", values, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileNotIn(List<String> values) {
            addCriterion("cash_mobile not in", values, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileBetween(String value1, String value2) {
            addCriterion("cash_mobile between", value1, value2, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashMobileNotBetween(String value1, String value2) {
            addCriterion("cash_mobile not between", value1, value2, "cashMobile");
            return (Criteria) this;
        }

        public Criteria andCashTypeIsNull() {
            addCriterion("cash_type is null");
            return (Criteria) this;
        }

        public Criteria andCashTypeIsNotNull() {
            addCriterion("cash_type is not null");
            return (Criteria) this;
        }

        public Criteria andCashTypeEqualTo(Byte value) {
            addCriterion("cash_type =", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotEqualTo(Byte value) {
            addCriterion("cash_type <>", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeGreaterThan(Byte value) {
            addCriterion("cash_type >", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cash_type >=", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLessThan(Byte value) {
            addCriterion("cash_type <", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeLessThanOrEqualTo(Byte value) {
            addCriterion("cash_type <=", value, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeIn(List<Byte> values) {
            addCriterion("cash_type in", values, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotIn(List<Byte> values) {
            addCriterion("cash_type not in", values, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeBetween(Byte value1, Byte value2) {
            addCriterion("cash_type between", value1, value2, "cashType");
            return (Criteria) this;
        }

        public Criteria andCashTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("cash_type not between", value1, value2, "cashType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("error_code is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("error_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("error_code =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("error_code <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("error_code >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("error_code >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("error_code <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("error_code <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("error_code like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("error_code not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("error_code in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("error_code not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("error_code between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("error_code not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("error_message is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("error_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("error_message =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("error_message <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("error_message >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("error_message >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("error_message <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("error_message <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("error_message like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("error_message not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("error_message in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("error_message not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("error_message between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("error_message not between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusIsNull() {
            addCriterion("refunds_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusIsNotNull() {
            addCriterion("refunds_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusEqualTo(Byte value) {
            addCriterion("refunds_status =", value, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusNotEqualTo(Byte value) {
            addCriterion("refunds_status <>", value, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusGreaterThan(Byte value) {
            addCriterion("refunds_status >", value, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("refunds_status >=", value, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusLessThan(Byte value) {
            addCriterion("refunds_status <", value, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("refunds_status <=", value, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusIn(List<Byte> values) {
            addCriterion("refunds_status in", values, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusNotIn(List<Byte> values) {
            addCriterion("refunds_status not in", values, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusBetween(Byte value1, Byte value2) {
            addCriterion("refunds_status between", value1, value2, "refundsStatus");
            return (Criteria) this;
        }

        public Criteria andRefundsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("refunds_status not between", value1, value2, "refundsStatus");
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