package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortIsNull() {
            addCriterion("last_login_port is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortIsNotNull() {
            addCriterion("last_login_port is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortEqualTo(Integer value) {
            addCriterion("last_login_port =", value, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortNotEqualTo(Integer value) {
            addCriterion("last_login_port <>", value, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortGreaterThan(Integer value) {
            addCriterion("last_login_port >", value, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login_port >=", value, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortLessThan(Integer value) {
            addCriterion("last_login_port <", value, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortLessThanOrEqualTo(Integer value) {
            addCriterion("last_login_port <=", value, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortIn(List<Integer> values) {
            addCriterion("last_login_port in", values, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortNotIn(List<Integer> values) {
            addCriterion("last_login_port not in", values, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortBetween(Integer value1, Integer value2) {
            addCriterion("last_login_port between", value1, value2, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andLastLoginPortNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login_port not between", value1, value2, "lastLoginPort");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNull() {
            addCriterion("register_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNotNull() {
            addCriterion("register_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpEqualTo(String value) {
            addCriterion("register_ip =", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotEqualTo(String value) {
            addCriterion("register_ip <>", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThan(String value) {
            addCriterion("register_ip >", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThanOrEqualTo(String value) {
            addCriterion("register_ip >=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThan(String value) {
            addCriterion("register_ip <", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThanOrEqualTo(String value) {
            addCriterion("register_ip <=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLike(String value) {
            addCriterion("register_ip like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotLike(String value) {
            addCriterion("register_ip not like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIn(List<String> values) {
            addCriterion("register_ip in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotIn(List<String> values) {
            addCriterion("register_ip not in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpBetween(String value1, String value2) {
            addCriterion("register_ip between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotBetween(String value1, String value2) {
            addCriterion("register_ip not between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterPortIsNull() {
            addCriterion("register_port is null");
            return (Criteria) this;
        }

        public Criteria andRegisterPortIsNotNull() {
            addCriterion("register_port is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterPortEqualTo(Integer value) {
            addCriterion("register_port =", value, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortNotEqualTo(Integer value) {
            addCriterion("register_port <>", value, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortGreaterThan(Integer value) {
            addCriterion("register_port >", value, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_port >=", value, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortLessThan(Integer value) {
            addCriterion("register_port <", value, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortLessThanOrEqualTo(Integer value) {
            addCriterion("register_port <=", value, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortIn(List<Integer> values) {
            addCriterion("register_port in", values, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortNotIn(List<Integer> values) {
            addCriterion("register_port not in", values, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortBetween(Integer value1, Integer value2) {
            addCriterion("register_port between", value1, value2, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterPortNotBetween(Integer value1, Integer value2) {
            addCriterion("register_port not between", value1, value2, "registerPort");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonIsNull() {
            addCriterion("register_reason is null");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonIsNotNull() {
            addCriterion("register_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonEqualTo(String value) {
            addCriterion("register_reason =", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonNotEqualTo(String value) {
            addCriterion("register_reason <>", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonGreaterThan(String value) {
            addCriterion("register_reason >", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonGreaterThanOrEqualTo(String value) {
            addCriterion("register_reason >=", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonLessThan(String value) {
            addCriterion("register_reason <", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonLessThanOrEqualTo(String value) {
            addCriterion("register_reason <=", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonLike(String value) {
            addCriterion("register_reason like", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonNotLike(String value) {
            addCriterion("register_reason not like", value, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonIn(List<String> values) {
            addCriterion("register_reason in", values, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonNotIn(List<String> values) {
            addCriterion("register_reason not in", values, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonBetween(String value1, String value2) {
            addCriterion("register_reason between", value1, value2, "registerReason");
            return (Criteria) this;
        }

        public Criteria andRegisterReasonNotBetween(String value1, String value2) {
            addCriterion("register_reason not between", value1, value2, "registerReason");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutIsNull() {
            addCriterion("username_bout is null");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutIsNotNull() {
            addCriterion("username_bout is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutEqualTo(Integer value) {
            addCriterion("username_bout =", value, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutNotEqualTo(Integer value) {
            addCriterion("username_bout <>", value, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutGreaterThan(Integer value) {
            addCriterion("username_bout >", value, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("username_bout >=", value, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutLessThan(Integer value) {
            addCriterion("username_bout <", value, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutLessThanOrEqualTo(Integer value) {
            addCriterion("username_bout <=", value, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutIn(List<Integer> values) {
            addCriterion("username_bout in", values, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutNotIn(List<Integer> values) {
            addCriterion("username_bout not in", values, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutBetween(Integer value1, Integer value2) {
            addCriterion("username_bout between", value1, value2, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andUsernameBoutNotBetween(Integer value1, Integer value2) {
            addCriterion("username_bout not between", value1, value2, "usernameBout");
            return (Criteria) this;
        }

        public Criteria andThreadCountIsNull() {
            addCriterion("thread_count is null");
            return (Criteria) this;
        }

        public Criteria andThreadCountIsNotNull() {
            addCriterion("thread_count is not null");
            return (Criteria) this;
        }

        public Criteria andThreadCountEqualTo(Integer value) {
            addCriterion("thread_count =", value, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountNotEqualTo(Integer value) {
            addCriterion("thread_count <>", value, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountGreaterThan(Integer value) {
            addCriterion("thread_count >", value, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("thread_count >=", value, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountLessThan(Integer value) {
            addCriterion("thread_count <", value, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountLessThanOrEqualTo(Integer value) {
            addCriterion("thread_count <=", value, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountIn(List<Integer> values) {
            addCriterion("thread_count in", values, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountNotIn(List<Integer> values) {
            addCriterion("thread_count not in", values, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountBetween(Integer value1, Integer value2) {
            addCriterion("thread_count between", value1, value2, "threadCount");
            return (Criteria) this;
        }

        public Criteria andThreadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("thread_count not between", value1, value2, "threadCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountIsNull() {
            addCriterion("follow_count is null");
            return (Criteria) this;
        }

        public Criteria andFollowCountIsNotNull() {
            addCriterion("follow_count is not null");
            return (Criteria) this;
        }

        public Criteria andFollowCountEqualTo(Integer value) {
            addCriterion("follow_count =", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountNotEqualTo(Integer value) {
            addCriterion("follow_count <>", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountGreaterThan(Integer value) {
            addCriterion("follow_count >", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_count >=", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountLessThan(Integer value) {
            addCriterion("follow_count <", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountLessThanOrEqualTo(Integer value) {
            addCriterion("follow_count <=", value, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountIn(List<Integer> values) {
            addCriterion("follow_count in", values, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountNotIn(List<Integer> values) {
            addCriterion("follow_count not in", values, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountBetween(Integer value1, Integer value2) {
            addCriterion("follow_count between", value1, value2, "followCount");
            return (Criteria) this;
        }

        public Criteria andFollowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_count not between", value1, value2, "followCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNull() {
            addCriterion("fans_count is null");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNotNull() {
            addCriterion("fans_count is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountEqualTo(Integer value) {
            addCriterion("fans_count =", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotEqualTo(Integer value) {
            addCriterion("fans_count <>", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThan(Integer value) {
            addCriterion("fans_count >", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_count >=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThan(Integer value) {
            addCriterion("fans_count <", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("fans_count <=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIn(List<Integer> values) {
            addCriterion("fans_count in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotIn(List<Integer> values) {
            addCriterion("fans_count not in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountBetween(Integer value1, Integer value2) {
            addCriterion("fans_count between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_count not between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountIsNull() {
            addCriterion("liked_count is null");
            return (Criteria) this;
        }

        public Criteria andLikedCountIsNotNull() {
            addCriterion("liked_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikedCountEqualTo(Integer value) {
            addCriterion("liked_count =", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountNotEqualTo(Integer value) {
            addCriterion("liked_count <>", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountGreaterThan(Integer value) {
            addCriterion("liked_count >", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("liked_count >=", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountLessThan(Integer value) {
            addCriterion("liked_count <", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountLessThanOrEqualTo(Integer value) {
            addCriterion("liked_count <=", value, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountIn(List<Integer> values) {
            addCriterion("liked_count in", values, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountNotIn(List<Integer> values) {
            addCriterion("liked_count not in", values, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountBetween(Integer value1, Integer value2) {
            addCriterion("liked_count between", value1, value2, "likedCount");
            return (Criteria) this;
        }

        public Criteria andLikedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("liked_count not between", value1, value2, "likedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIsNull() {
            addCriterion("question_count is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIsNotNull() {
            addCriterion("question_count is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountEqualTo(Integer value) {
            addCriterion("question_count =", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotEqualTo(Integer value) {
            addCriterion("question_count <>", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThan(Integer value) {
            addCriterion("question_count >", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_count >=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThan(Integer value) {
            addCriterion("question_count <", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThanOrEqualTo(Integer value) {
            addCriterion("question_count <=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIn(List<Integer> values) {
            addCriterion("question_count in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotIn(List<Integer> values) {
            addCriterion("question_count not in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountBetween(Integer value1, Integer value2) {
            addCriterion("question_count between", value1, value2, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("question_count not between", value1, value2, "questionCount");
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

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andAvatarAtIsNull() {
            addCriterion("avatar_at is null");
            return (Criteria) this;
        }

        public Criteria andAvatarAtIsNotNull() {
            addCriterion("avatar_at is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarAtEqualTo(Date value) {
            addCriterion("avatar_at =", value, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtNotEqualTo(Date value) {
            addCriterion("avatar_at <>", value, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtGreaterThan(Date value) {
            addCriterion("avatar_at >", value, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtGreaterThanOrEqualTo(Date value) {
            addCriterion("avatar_at >=", value, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtLessThan(Date value) {
            addCriterion("avatar_at <", value, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtLessThanOrEqualTo(Date value) {
            addCriterion("avatar_at <=", value, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtIn(List<Date> values) {
            addCriterion("avatar_at in", values, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtNotIn(List<Date> values) {
            addCriterion("avatar_at not in", values, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtBetween(Date value1, Date value2) {
            addCriterion("avatar_at between", value1, value2, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andAvatarAtNotBetween(Date value1, Date value2) {
            addCriterion("avatar_at not between", value1, value2, "avatarAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtIsNull() {
            addCriterion("login_at is null");
            return (Criteria) this;
        }

        public Criteria andLoginAtIsNotNull() {
            addCriterion("login_at is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAtEqualTo(Date value) {
            addCriterion("login_at =", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtNotEqualTo(Date value) {
            addCriterion("login_at <>", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtGreaterThan(Date value) {
            addCriterion("login_at >", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtGreaterThanOrEqualTo(Date value) {
            addCriterion("login_at >=", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtLessThan(Date value) {
            addCriterion("login_at <", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtLessThanOrEqualTo(Date value) {
            addCriterion("login_at <=", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtIn(List<Date> values) {
            addCriterion("login_at in", values, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtNotIn(List<Date> values) {
            addCriterion("login_at not in", values, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtBetween(Date value1, Date value2) {
            addCriterion("login_at between", value1, value2, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtNotBetween(Date value1, Date value2) {
            addCriterion("login_at not between", value1, value2, "loginAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtIsNull() {
            addCriterion("joined_at is null");
            return (Criteria) this;
        }

        public Criteria andJoinedAtIsNotNull() {
            addCriterion("joined_at is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedAtEqualTo(Date value) {
            addCriterion("joined_at =", value, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtNotEqualTo(Date value) {
            addCriterion("joined_at <>", value, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtGreaterThan(Date value) {
            addCriterion("joined_at >", value, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("joined_at >=", value, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtLessThan(Date value) {
            addCriterion("joined_at <", value, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtLessThanOrEqualTo(Date value) {
            addCriterion("joined_at <=", value, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtIn(List<Date> values) {
            addCriterion("joined_at in", values, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtNotIn(List<Date> values) {
            addCriterion("joined_at not in", values, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtBetween(Date value1, Date value2) {
            addCriterion("joined_at between", value1, value2, "joinedAt");
            return (Criteria) this;
        }

        public Criteria andJoinedAtNotBetween(Date value1, Date value2) {
            addCriterion("joined_at not between", value1, value2, "joinedAt");
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