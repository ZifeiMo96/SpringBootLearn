package com.example.demo.data.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(BigDecimal value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(BigDecimal value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(BigDecimal value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(BigDecimal value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<BigDecimal> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<BigDecimal> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIsNull() {
            addCriterion("withdrawal is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIsNotNull() {
            addCriterion("withdrawal is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalEqualTo(BigDecimal value) {
            addCriterion("withdrawal =", value, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNotEqualTo(BigDecimal value) {
            addCriterion("withdrawal <>", value, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalGreaterThan(BigDecimal value) {
            addCriterion("withdrawal >", value, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal >=", value, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalLessThan(BigDecimal value) {
            addCriterion("withdrawal <", value, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal <=", value, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalIn(List<BigDecimal> values) {
            addCriterion("withdrawal in", values, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNotIn(List<BigDecimal> values) {
            addCriterion("withdrawal not in", values, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal between", value1, value2, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andWithdrawalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal not between", value1, value2, "withdrawal");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNull() {
            addCriterion("total_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(BigDecimal value) {
            addCriterion("total_profit =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(BigDecimal value) {
            addCriterion("total_profit <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(BigDecimal value) {
            addCriterion("total_profit >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_profit >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(BigDecimal value) {
            addCriterion("total_profit <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_profit <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<BigDecimal> values) {
            addCriterion("total_profit in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<BigDecimal> values) {
            addCriterion("total_profit not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_profit between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_profit not between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitIsNull() {
            addCriterion("register_profit is null");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitIsNotNull() {
            addCriterion("register_profit is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitEqualTo(BigDecimal value) {
            addCriterion("register_profit =", value, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitNotEqualTo(BigDecimal value) {
            addCriterion("register_profit <>", value, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitGreaterThan(BigDecimal value) {
            addCriterion("register_profit >", value, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("register_profit >=", value, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitLessThan(BigDecimal value) {
            addCriterion("register_profit <", value, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("register_profit <=", value, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitIn(List<BigDecimal> values) {
            addCriterion("register_profit in", values, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitNotIn(List<BigDecimal> values) {
            addCriterion("register_profit not in", values, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_profit between", value1, value2, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andRegisterProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_profit not between", value1, value2, "registerProfit");
            return (Criteria) this;
        }

        public Criteria andMasterPortionIsNull() {
            addCriterion("master_portion is null");
            return (Criteria) this;
        }

        public Criteria andMasterPortionIsNotNull() {
            addCriterion("master_portion is not null");
            return (Criteria) this;
        }

        public Criteria andMasterPortionEqualTo(BigDecimal value) {
            addCriterion("master_portion =", value, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionNotEqualTo(BigDecimal value) {
            addCriterion("master_portion <>", value, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionGreaterThan(BigDecimal value) {
            addCriterion("master_portion >", value, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("master_portion >=", value, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionLessThan(BigDecimal value) {
            addCriterion("master_portion <", value, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("master_portion <=", value, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionIn(List<BigDecimal> values) {
            addCriterion("master_portion in", values, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionNotIn(List<BigDecimal> values) {
            addCriterion("master_portion not in", values, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_portion between", value1, value2, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andMasterPortionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("master_portion not between", value1, value2, "masterPortion");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitIsNull() {
            addCriterion("withdrawal_profit is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitIsNotNull() {
            addCriterion("withdrawal_profit is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitEqualTo(BigDecimal value) {
            addCriterion("withdrawal_profit =", value, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitNotEqualTo(BigDecimal value) {
            addCriterion("withdrawal_profit <>", value, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitGreaterThan(BigDecimal value) {
            addCriterion("withdrawal_profit >", value, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal_profit >=", value, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitLessThan(BigDecimal value) {
            addCriterion("withdrawal_profit <", value, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal_profit <=", value, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitIn(List<BigDecimal> values) {
            addCriterion("withdrawal_profit in", values, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitNotIn(List<BigDecimal> values) {
            addCriterion("withdrawal_profit not in", values, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal_profit between", value1, value2, "withdrawalProfit");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal_profit not between", value1, value2, "withdrawalProfit");
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
            addCriterionForJDBCDate("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterionForJDBCDate("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterionForJDBCDate("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_at not between", value1, value2, "createdAt");
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