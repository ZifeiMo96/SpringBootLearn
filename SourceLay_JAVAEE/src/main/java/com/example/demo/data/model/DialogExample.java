package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DialogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DialogExample() {
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

        public Criteria andDialogMessageIdIsNull() {
            addCriterion("dialog_message_id is null");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdIsNotNull() {
            addCriterion("dialog_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdEqualTo(Long value) {
            addCriterion("dialog_message_id =", value, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdNotEqualTo(Long value) {
            addCriterion("dialog_message_id <>", value, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdGreaterThan(Long value) {
            addCriterion("dialog_message_id >", value, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dialog_message_id >=", value, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdLessThan(Long value) {
            addCriterion("dialog_message_id <", value, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("dialog_message_id <=", value, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdIn(List<Long> values) {
            addCriterion("dialog_message_id in", values, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdNotIn(List<Long> values) {
            addCriterion("dialog_message_id not in", values, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdBetween(Long value1, Long value2) {
            addCriterion("dialog_message_id between", value1, value2, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andDialogMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("dialog_message_id not between", value1, value2, "dialogMessageId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdIsNull() {
            addCriterion("sender_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdIsNotNull() {
            addCriterion("sender_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdEqualTo(Long value) {
            addCriterion("sender_user_id =", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdNotEqualTo(Long value) {
            addCriterion("sender_user_id <>", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdGreaterThan(Long value) {
            addCriterion("sender_user_id >", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sender_user_id >=", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdLessThan(Long value) {
            addCriterion("sender_user_id <", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sender_user_id <=", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdIn(List<Long> values) {
            addCriterion("sender_user_id in", values, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdNotIn(List<Long> values) {
            addCriterion("sender_user_id not in", values, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdBetween(Long value1, Long value2) {
            addCriterion("sender_user_id between", value1, value2, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sender_user_id not between", value1, value2, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdIsNull() {
            addCriterion("recipient_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdIsNotNull() {
            addCriterion("recipient_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdEqualTo(Long value) {
            addCriterion("recipient_user_id =", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdNotEqualTo(Long value) {
            addCriterion("recipient_user_id <>", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdGreaterThan(Long value) {
            addCriterion("recipient_user_id >", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recipient_user_id >=", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdLessThan(Long value) {
            addCriterion("recipient_user_id <", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdLessThanOrEqualTo(Long value) {
            addCriterion("recipient_user_id <=", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdIn(List<Long> values) {
            addCriterion("recipient_user_id in", values, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdNotIn(List<Long> values) {
            addCriterion("recipient_user_id not in", values, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdBetween(Long value1, Long value2) {
            addCriterion("recipient_user_id between", value1, value2, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdNotBetween(Long value1, Long value2) {
            addCriterion("recipient_user_id not between", value1, value2, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtIsNull() {
            addCriterion("recipient_read_at is null");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtIsNotNull() {
            addCriterion("recipient_read_at is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtEqualTo(Date value) {
            addCriterion("recipient_read_at =", value, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtNotEqualTo(Date value) {
            addCriterion("recipient_read_at <>", value, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtGreaterThan(Date value) {
            addCriterion("recipient_read_at >", value, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtGreaterThanOrEqualTo(Date value) {
            addCriterion("recipient_read_at >=", value, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtLessThan(Date value) {
            addCriterion("recipient_read_at <", value, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtLessThanOrEqualTo(Date value) {
            addCriterion("recipient_read_at <=", value, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtIn(List<Date> values) {
            addCriterion("recipient_read_at in", values, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtNotIn(List<Date> values) {
            addCriterion("recipient_read_at not in", values, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtBetween(Date value1, Date value2) {
            addCriterion("recipient_read_at between", value1, value2, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andRecipientReadAtNotBetween(Date value1, Date value2) {
            addCriterion("recipient_read_at not between", value1, value2, "recipientReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtIsNull() {
            addCriterion("sender_read_at is null");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtIsNotNull() {
            addCriterion("sender_read_at is not null");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtEqualTo(Date value) {
            addCriterion("sender_read_at =", value, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtNotEqualTo(Date value) {
            addCriterion("sender_read_at <>", value, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtGreaterThan(Date value) {
            addCriterion("sender_read_at >", value, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtGreaterThanOrEqualTo(Date value) {
            addCriterion("sender_read_at >=", value, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtLessThan(Date value) {
            addCriterion("sender_read_at <", value, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtLessThanOrEqualTo(Date value) {
            addCriterion("sender_read_at <=", value, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtIn(List<Date> values) {
            addCriterion("sender_read_at in", values, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtNotIn(List<Date> values) {
            addCriterion("sender_read_at not in", values, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtBetween(Date value1, Date value2) {
            addCriterion("sender_read_at between", value1, value2, "senderReadAt");
            return (Criteria) this;
        }

        public Criteria andSenderReadAtNotBetween(Date value1, Date value2) {
            addCriterion("sender_read_at not between", value1, value2, "senderReadAt");
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

        public Criteria andSenderDeletedAtIsNull() {
            addCriterion("sender_deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtIsNotNull() {
            addCriterion("sender_deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtEqualTo(Date value) {
            addCriterion("sender_deleted_at =", value, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtNotEqualTo(Date value) {
            addCriterion("sender_deleted_at <>", value, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtGreaterThan(Date value) {
            addCriterion("sender_deleted_at >", value, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("sender_deleted_at >=", value, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtLessThan(Date value) {
            addCriterion("sender_deleted_at <", value, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("sender_deleted_at <=", value, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtIn(List<Date> values) {
            addCriterion("sender_deleted_at in", values, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtNotIn(List<Date> values) {
            addCriterion("sender_deleted_at not in", values, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtBetween(Date value1, Date value2) {
            addCriterion("sender_deleted_at between", value1, value2, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andSenderDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("sender_deleted_at not between", value1, value2, "senderDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtIsNull() {
            addCriterion("recipient_deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtIsNotNull() {
            addCriterion("recipient_deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtEqualTo(Date value) {
            addCriterion("recipient_deleted_at =", value, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtNotEqualTo(Date value) {
            addCriterion("recipient_deleted_at <>", value, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtGreaterThan(Date value) {
            addCriterion("recipient_deleted_at >", value, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("recipient_deleted_at >=", value, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtLessThan(Date value) {
            addCriterion("recipient_deleted_at <", value, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("recipient_deleted_at <=", value, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtIn(List<Date> values) {
            addCriterion("recipient_deleted_at in", values, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtNotIn(List<Date> values) {
            addCriterion("recipient_deleted_at not in", values, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtBetween(Date value1, Date value2) {
            addCriterion("recipient_deleted_at between", value1, value2, "recipientDeletedAt");
            return (Criteria) this;
        }

        public Criteria andRecipientDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("recipient_deleted_at not between", value1, value2, "recipientDeletedAt");
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