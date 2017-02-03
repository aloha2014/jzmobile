package com.shie.mobile.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsorderpayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsorderpayExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andInsorderpayIdIsNull() {
            addCriterion("insorderpay_id is null");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdIsNotNull() {
            addCriterion("insorderpay_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdEqualTo(Integer value) {
            addCriterion("insorderpay_id =", value, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdNotEqualTo(Integer value) {
            addCriterion("insorderpay_id <>", value, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdGreaterThan(Integer value) {
            addCriterion("insorderpay_id >", value, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insorderpay_id >=", value, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdLessThan(Integer value) {
            addCriterion("insorderpay_id <", value, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdLessThanOrEqualTo(Integer value) {
            addCriterion("insorderpay_id <=", value, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdIn(List<Integer> values) {
            addCriterion("insorderpay_id in", values, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdNotIn(List<Integer> values) {
            addCriterion("insorderpay_id not in", values, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdBetween(Integer value1, Integer value2) {
            addCriterion("insorderpay_id between", value1, value2, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderpayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insorderpay_id not between", value1, value2, "insorderpayId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdIsNull() {
            addCriterion("insorder_id is null");
            return (Criteria) this;
        }

        public Criteria andInsorderIdIsNotNull() {
            addCriterion("insorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsorderIdEqualTo(Integer value) {
            addCriterion("insorder_id =", value, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdNotEqualTo(Integer value) {
            addCriterion("insorder_id <>", value, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdGreaterThan(Integer value) {
            addCriterion("insorder_id >", value, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insorder_id >=", value, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdLessThan(Integer value) {
            addCriterion("insorder_id <", value, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("insorder_id <=", value, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdIn(List<Integer> values) {
            addCriterion("insorder_id in", values, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdNotIn(List<Integer> values) {
            addCriterion("insorder_id not in", values, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdBetween(Integer value1, Integer value2) {
            addCriterion("insorder_id between", value1, value2, "insorderId");
            return (Criteria) this;
        }

        public Criteria andInsorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insorder_id not between", value1, value2, "insorderId");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("payChannel is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("payChannel is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("payChannel =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("payChannel <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("payChannel >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("payChannel >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("payChannel <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("payChannel <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("payChannel like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("payChannel not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("payChannel in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("payChannel not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("payChannel between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("payChannel not between", value1, value2, "paychannel");
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