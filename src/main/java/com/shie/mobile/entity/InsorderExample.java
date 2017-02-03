package com.shie.mobile.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsorderExample() {
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

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNull() {
            addCriterion("productCode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("productCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("productCode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("productCode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("productCode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("productCode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("productCode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("productCode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("productCode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("productCode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("productCode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("productCode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("productCode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("productCode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("applyDate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applyDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("applyDate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("applyDate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("applyDate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("applyDate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("applyDate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("applyDate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("applyDate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("applyDate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("applyDate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("applyDate not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeIsNull() {
            addCriterion("provinceComCode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeIsNotNull() {
            addCriterion("provinceComCode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeEqualTo(String value) {
            addCriterion("provinceComCode =", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeNotEqualTo(String value) {
            addCriterion("provinceComCode <>", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeGreaterThan(String value) {
            addCriterion("provinceComCode >", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeGreaterThanOrEqualTo(String value) {
            addCriterion("provinceComCode >=", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeLessThan(String value) {
            addCriterion("provinceComCode <", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeLessThanOrEqualTo(String value) {
            addCriterion("provinceComCode <=", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeLike(String value) {
            addCriterion("provinceComCode like", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeNotLike(String value) {
            addCriterion("provinceComCode not like", value, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeIn(List<String> values) {
            addCriterion("provinceComCode in", values, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeNotIn(List<String> values) {
            addCriterion("provinceComCode not in", values, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeBetween(String value1, String value2) {
            addCriterion("provinceComCode between", value1, value2, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andProvincecomcodeNotBetween(String value1, String value2) {
            addCriterion("provinceComCode not between", value1, value2, "provincecomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeIsNull() {
            addCriterion("branchComCode is null");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeIsNotNull() {
            addCriterion("branchComCode is not null");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeEqualTo(String value) {
            addCriterion("branchComCode =", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeNotEqualTo(String value) {
            addCriterion("branchComCode <>", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeGreaterThan(String value) {
            addCriterion("branchComCode >", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeGreaterThanOrEqualTo(String value) {
            addCriterion("branchComCode >=", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeLessThan(String value) {
            addCriterion("branchComCode <", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeLessThanOrEqualTo(String value) {
            addCriterion("branchComCode <=", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeLike(String value) {
            addCriterion("branchComCode like", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeNotLike(String value) {
            addCriterion("branchComCode not like", value, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeIn(List<String> values) {
            addCriterion("branchComCode in", values, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeNotIn(List<String> values) {
            addCriterion("branchComCode not in", values, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeBetween(String value1, String value2) {
            addCriterion("branchComCode between", value1, value2, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBranchcomcodeNotBetween(String value1, String value2) {
            addCriterion("branchComCode not between", value1, value2, "branchcomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeIsNull() {
            addCriterion("businessComCode is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeIsNotNull() {
            addCriterion("businessComCode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeEqualTo(String value) {
            addCriterion("businessComCode =", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeNotEqualTo(String value) {
            addCriterion("businessComCode <>", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeGreaterThan(String value) {
            addCriterion("businessComCode >", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeGreaterThanOrEqualTo(String value) {
            addCriterion("businessComCode >=", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeLessThan(String value) {
            addCriterion("businessComCode <", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeLessThanOrEqualTo(String value) {
            addCriterion("businessComCode <=", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeLike(String value) {
            addCriterion("businessComCode like", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeNotLike(String value) {
            addCriterion("businessComCode not like", value, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeIn(List<String> values) {
            addCriterion("businessComCode in", values, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeNotIn(List<String> values) {
            addCriterion("businessComCode not in", values, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeBetween(String value1, String value2) {
            addCriterion("businessComCode between", value1, value2, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andBusinesscomcodeNotBetween(String value1, String value2) {
            addCriterion("businessComCode not between", value1, value2, "businesscomcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("agentCode is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("agentCode is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("agentCode =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("agentCode <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("agentCode >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("agentCode >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("agentCode <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("agentCode <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("agentCode like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("agentCode not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("agentCode in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("agentCode not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("agentCode between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("agentCode not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andHoldertypeIsNull() {
            addCriterion("holderType is null");
            return (Criteria) this;
        }

        public Criteria andHoldertypeIsNotNull() {
            addCriterion("holderType is not null");
            return (Criteria) this;
        }

        public Criteria andHoldertypeEqualTo(String value) {
            addCriterion("holderType =", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeNotEqualTo(String value) {
            addCriterion("holderType <>", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeGreaterThan(String value) {
            addCriterion("holderType >", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeGreaterThanOrEqualTo(String value) {
            addCriterion("holderType >=", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeLessThan(String value) {
            addCriterion("holderType <", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeLessThanOrEqualTo(String value) {
            addCriterion("holderType <=", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeLike(String value) {
            addCriterion("holderType like", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeNotLike(String value) {
            addCriterion("holderType not like", value, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeIn(List<String> values) {
            addCriterion("holderType in", values, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeNotIn(List<String> values) {
            addCriterion("holderType not in", values, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeBetween(String value1, String value2) {
            addCriterion("holderType between", value1, value2, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldertypeNotBetween(String value1, String value2) {
            addCriterion("holderType not between", value1, value2, "holdertype");
            return (Criteria) this;
        }

        public Criteria andHoldernameIsNull() {
            addCriterion("holderName is null");
            return (Criteria) this;
        }

        public Criteria andHoldernameIsNotNull() {
            addCriterion("holderName is not null");
            return (Criteria) this;
        }

        public Criteria andHoldernameEqualTo(String value) {
            addCriterion("holderName =", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotEqualTo(String value) {
            addCriterion("holderName <>", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameGreaterThan(String value) {
            addCriterion("holderName >", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameGreaterThanOrEqualTo(String value) {
            addCriterion("holderName >=", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameLessThan(String value) {
            addCriterion("holderName <", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameLessThanOrEqualTo(String value) {
            addCriterion("holderName <=", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameLike(String value) {
            addCriterion("holderName like", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotLike(String value) {
            addCriterion("holderName not like", value, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameIn(List<String> values) {
            addCriterion("holderName in", values, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotIn(List<String> values) {
            addCriterion("holderName not in", values, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameBetween(String value1, String value2) {
            addCriterion("holderName between", value1, value2, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldernameNotBetween(String value1, String value2) {
            addCriterion("holderName not between", value1, value2, "holdername");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeIsNull() {
            addCriterion("holderCertiType is null");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeIsNotNull() {
            addCriterion("holderCertiType is not null");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeEqualTo(String value) {
            addCriterion("holderCertiType =", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeNotEqualTo(String value) {
            addCriterion("holderCertiType <>", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeGreaterThan(String value) {
            addCriterion("holderCertiType >", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeGreaterThanOrEqualTo(String value) {
            addCriterion("holderCertiType >=", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeLessThan(String value) {
            addCriterion("holderCertiType <", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeLessThanOrEqualTo(String value) {
            addCriterion("holderCertiType <=", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeLike(String value) {
            addCriterion("holderCertiType like", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeNotLike(String value) {
            addCriterion("holderCertiType not like", value, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeIn(List<String> values) {
            addCriterion("holderCertiType in", values, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeNotIn(List<String> values) {
            addCriterion("holderCertiType not in", values, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeBetween(String value1, String value2) {
            addCriterion("holderCertiType between", value1, value2, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertitypeNotBetween(String value1, String value2) {
            addCriterion("holderCertiType not between", value1, value2, "holdercertitype");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoIsNull() {
            addCriterion("holderCertiNo is null");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoIsNotNull() {
            addCriterion("holderCertiNo is not null");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoEqualTo(String value) {
            addCriterion("holderCertiNo =", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoNotEqualTo(String value) {
            addCriterion("holderCertiNo <>", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoGreaterThan(String value) {
            addCriterion("holderCertiNo >", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoGreaterThanOrEqualTo(String value) {
            addCriterion("holderCertiNo >=", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoLessThan(String value) {
            addCriterion("holderCertiNo <", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoLessThanOrEqualTo(String value) {
            addCriterion("holderCertiNo <=", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoLike(String value) {
            addCriterion("holderCertiNo like", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoNotLike(String value) {
            addCriterion("holderCertiNo not like", value, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoIn(List<String> values) {
            addCriterion("holderCertiNo in", values, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoNotIn(List<String> values) {
            addCriterion("holderCertiNo not in", values, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoBetween(String value1, String value2) {
            addCriterion("holderCertiNo between", value1, value2, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldercertinoNotBetween(String value1, String value2) {
            addCriterion("holderCertiNo not between", value1, value2, "holdercertino");
            return (Criteria) this;
        }

        public Criteria andHoldersexIsNull() {
            addCriterion("holderSex is null");
            return (Criteria) this;
        }

        public Criteria andHoldersexIsNotNull() {
            addCriterion("holderSex is not null");
            return (Criteria) this;
        }

        public Criteria andHoldersexEqualTo(String value) {
            addCriterion("holderSex =", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexNotEqualTo(String value) {
            addCriterion("holderSex <>", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexGreaterThan(String value) {
            addCriterion("holderSex >", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexGreaterThanOrEqualTo(String value) {
            addCriterion("holderSex >=", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexLessThan(String value) {
            addCriterion("holderSex <", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexLessThanOrEqualTo(String value) {
            addCriterion("holderSex <=", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexLike(String value) {
            addCriterion("holderSex like", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexNotLike(String value) {
            addCriterion("holderSex not like", value, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexIn(List<String> values) {
            addCriterion("holderSex in", values, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexNotIn(List<String> values) {
            addCriterion("holderSex not in", values, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexBetween(String value1, String value2) {
            addCriterion("holderSex between", value1, value2, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldersexNotBetween(String value1, String value2) {
            addCriterion("holderSex not between", value1, value2, "holdersex");
            return (Criteria) this;
        }

        public Criteria andHoldermobileIsNull() {
            addCriterion("holderMobile is null");
            return (Criteria) this;
        }

        public Criteria andHoldermobileIsNotNull() {
            addCriterion("holderMobile is not null");
            return (Criteria) this;
        }

        public Criteria andHoldermobileEqualTo(String value) {
            addCriterion("holderMobile =", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileNotEqualTo(String value) {
            addCriterion("holderMobile <>", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileGreaterThan(String value) {
            addCriterion("holderMobile >", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileGreaterThanOrEqualTo(String value) {
            addCriterion("holderMobile >=", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileLessThan(String value) {
            addCriterion("holderMobile <", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileLessThanOrEqualTo(String value) {
            addCriterion("holderMobile <=", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileLike(String value) {
            addCriterion("holderMobile like", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileNotLike(String value) {
            addCriterion("holderMobile not like", value, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileIn(List<String> values) {
            addCriterion("holderMobile in", values, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileNotIn(List<String> values) {
            addCriterion("holderMobile not in", values, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileBetween(String value1, String value2) {
            addCriterion("holderMobile between", value1, value2, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHoldermobileNotBetween(String value1, String value2) {
            addCriterion("holderMobile not between", value1, value2, "holdermobile");
            return (Criteria) this;
        }

        public Criteria andHolderemailIsNull() {
            addCriterion("holderEmail is null");
            return (Criteria) this;
        }

        public Criteria andHolderemailIsNotNull() {
            addCriterion("holderEmail is not null");
            return (Criteria) this;
        }

        public Criteria andHolderemailEqualTo(String value) {
            addCriterion("holderEmail =", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailNotEqualTo(String value) {
            addCriterion("holderEmail <>", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailGreaterThan(String value) {
            addCriterion("holderEmail >", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailGreaterThanOrEqualTo(String value) {
            addCriterion("holderEmail >=", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailLessThan(String value) {
            addCriterion("holderEmail <", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailLessThanOrEqualTo(String value) {
            addCriterion("holderEmail <=", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailLike(String value) {
            addCriterion("holderEmail like", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailNotLike(String value) {
            addCriterion("holderEmail not like", value, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailIn(List<String> values) {
            addCriterion("holderEmail in", values, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailNotIn(List<String> values) {
            addCriterion("holderEmail not in", values, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailBetween(String value1, String value2) {
            addCriterion("holderEmail between", value1, value2, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderemailNotBetween(String value1, String value2) {
            addCriterion("holderEmail not between", value1, value2, "holderemail");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredIsNull() {
            addCriterion("holderRelaToInsured is null");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredIsNotNull() {
            addCriterion("holderRelaToInsured is not null");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredEqualTo(String value) {
            addCriterion("holderRelaToInsured =", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredNotEqualTo(String value) {
            addCriterion("holderRelaToInsured <>", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredGreaterThan(String value) {
            addCriterion("holderRelaToInsured >", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredGreaterThanOrEqualTo(String value) {
            addCriterion("holderRelaToInsured >=", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredLessThan(String value) {
            addCriterion("holderRelaToInsured <", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredLessThanOrEqualTo(String value) {
            addCriterion("holderRelaToInsured <=", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredLike(String value) {
            addCriterion("holderRelaToInsured like", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredNotLike(String value) {
            addCriterion("holderRelaToInsured not like", value, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredIn(List<String> values) {
            addCriterion("holderRelaToInsured in", values, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredNotIn(List<String> values) {
            addCriterion("holderRelaToInsured not in", values, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredBetween(String value1, String value2) {
            addCriterion("holderRelaToInsured between", value1, value2, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderrelatoinsuredNotBetween(String value1, String value2) {
            addCriterion("holderRelaToInsured not between", value1, value2, "holderrelatoinsured");
            return (Criteria) this;
        }

        public Criteria andHolderaddrIsNull() {
            addCriterion("holderAddr is null");
            return (Criteria) this;
        }

        public Criteria andHolderaddrIsNotNull() {
            addCriterion("holderAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHolderaddrEqualTo(String value) {
            addCriterion("holderAddr =", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrNotEqualTo(String value) {
            addCriterion("holderAddr <>", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrGreaterThan(String value) {
            addCriterion("holderAddr >", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrGreaterThanOrEqualTo(String value) {
            addCriterion("holderAddr >=", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrLessThan(String value) {
            addCriterion("holderAddr <", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrLessThanOrEqualTo(String value) {
            addCriterion("holderAddr <=", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrLike(String value) {
            addCriterion("holderAddr like", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrNotLike(String value) {
            addCriterion("holderAddr not like", value, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrIn(List<String> values) {
            addCriterion("holderAddr in", values, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrNotIn(List<String> values) {
            addCriterion("holderAddr not in", values, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrBetween(String value1, String value2) {
            addCriterion("holderAddr between", value1, value2, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andHolderaddrNotBetween(String value1, String value2) {
            addCriterion("holderAddr not between", value1, value2, "holderaddr");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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