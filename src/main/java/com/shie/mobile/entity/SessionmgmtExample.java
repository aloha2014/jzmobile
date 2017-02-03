package com.shie.mobile.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessionmgmtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessionmgmtExample() {
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

        public Criteria andSessionmgmtIdIsNull() {
            addCriterion("sessionmgmt_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdIsNotNull() {
            addCriterion("sessionmgmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdEqualTo(Integer value) {
            addCriterion("sessionmgmt_id =", value, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdNotEqualTo(Integer value) {
            addCriterion("sessionmgmt_id <>", value, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdGreaterThan(Integer value) {
            addCriterion("sessionmgmt_id >", value, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sessionmgmt_id >=", value, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdLessThan(Integer value) {
            addCriterion("sessionmgmt_id <", value, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdLessThanOrEqualTo(Integer value) {
            addCriterion("sessionmgmt_id <=", value, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdIn(List<Integer> values) {
            addCriterion("sessionmgmt_id in", values, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdNotIn(List<Integer> values) {
            addCriterion("sessionmgmt_id not in", values, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdBetween(Integer value1, Integer value2) {
            addCriterion("sessionmgmt_id between", value1, value2, "sessionmgmtId");
            return (Criteria) this;
        }

        public Criteria andSessionmgmtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sessionmgmt_id not between", value1, value2, "sessionmgmtId");
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

        public Criteria andIpaddressIsNull() {
            addCriterion("ipAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("ipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("ipAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("ipAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("ipAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("ipAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("ipAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("ipAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("ipAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("ipAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("ipAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("ipAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("ipAddress not between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("mobileNo is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("mobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("mobileNo =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("mobileNo <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("mobileNo >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("mobileNo >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("mobileNo <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("mobileNo <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("mobileNo like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("mobileNo not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("mobileNo in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("mobileNo not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("mobileNo between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("mobileNo not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andVerficodeIsNull() {
            addCriterion("verficode is null");
            return (Criteria) this;
        }

        public Criteria andVerficodeIsNotNull() {
            addCriterion("verficode is not null");
            return (Criteria) this;
        }

        public Criteria andVerficodeEqualTo(String value) {
            addCriterion("verficode =", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeNotEqualTo(String value) {
            addCriterion("verficode <>", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeGreaterThan(String value) {
            addCriterion("verficode >", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeGreaterThanOrEqualTo(String value) {
            addCriterion("verficode >=", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeLessThan(String value) {
            addCriterion("verficode <", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeLessThanOrEqualTo(String value) {
            addCriterion("verficode <=", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeLike(String value) {
            addCriterion("verficode like", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeNotLike(String value) {
            addCriterion("verficode not like", value, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeIn(List<String> values) {
            addCriterion("verficode in", values, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeNotIn(List<String> values) {
            addCriterion("verficode not in", values, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeBetween(String value1, String value2) {
            addCriterion("verficode between", value1, value2, "verficode");
            return (Criteria) this;
        }

        public Criteria andVerficodeNotBetween(String value1, String value2) {
            addCriterion("verficode not between", value1, value2, "verficode");
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