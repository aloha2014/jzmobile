package com.shie.mobile.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsorderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsorderdetailExample() {
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

        public Criteria andInsorderdetailIdIsNull() {
            addCriterion("insorderdetail_id is null");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdIsNotNull() {
            addCriterion("insorderdetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdEqualTo(Integer value) {
            addCriterion("insorderdetail_id =", value, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdNotEqualTo(Integer value) {
            addCriterion("insorderdetail_id <>", value, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdGreaterThan(Integer value) {
            addCriterion("insorderdetail_id >", value, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insorderdetail_id >=", value, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdLessThan(Integer value) {
            addCriterion("insorderdetail_id <", value, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("insorderdetail_id <=", value, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdIn(List<Integer> values) {
            addCriterion("insorderdetail_id in", values, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdNotIn(List<Integer> values) {
            addCriterion("insorderdetail_id not in", values, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("insorderdetail_id between", value1, value2, "insorderdetailId");
            return (Criteria) this;
        }

        public Criteria andInsorderdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insorderdetail_id not between", value1, value2, "insorderdetailId");
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

        public Criteria andInsurantnameIsNull() {
            addCriterion("insurantName is null");
            return (Criteria) this;
        }

        public Criteria andInsurantnameIsNotNull() {
            addCriterion("insurantName is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantnameEqualTo(String value) {
            addCriterion("insurantName =", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotEqualTo(String value) {
            addCriterion("insurantName <>", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameGreaterThan(String value) {
            addCriterion("insurantName >", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameGreaterThanOrEqualTo(String value) {
            addCriterion("insurantName >=", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameLessThan(String value) {
            addCriterion("insurantName <", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameLessThanOrEqualTo(String value) {
            addCriterion("insurantName <=", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameLike(String value) {
            addCriterion("insurantName like", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotLike(String value) {
            addCriterion("insurantName not like", value, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameIn(List<String> values) {
            addCriterion("insurantName in", values, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotIn(List<String> values) {
            addCriterion("insurantName not in", values, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameBetween(String value1, String value2) {
            addCriterion("insurantName between", value1, value2, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantnameNotBetween(String value1, String value2) {
            addCriterion("insurantName not between", value1, value2, "insurantname");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeIsNull() {
            addCriterion("insurantCertiType is null");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeIsNotNull() {
            addCriterion("insurantCertiType is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeEqualTo(String value) {
            addCriterion("insurantCertiType =", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeNotEqualTo(String value) {
            addCriterion("insurantCertiType <>", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeGreaterThan(String value) {
            addCriterion("insurantCertiType >", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeGreaterThanOrEqualTo(String value) {
            addCriterion("insurantCertiType >=", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeLessThan(String value) {
            addCriterion("insurantCertiType <", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeLessThanOrEqualTo(String value) {
            addCriterion("insurantCertiType <=", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeLike(String value) {
            addCriterion("insurantCertiType like", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeNotLike(String value) {
            addCriterion("insurantCertiType not like", value, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeIn(List<String> values) {
            addCriterion("insurantCertiType in", values, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeNotIn(List<String> values) {
            addCriterion("insurantCertiType not in", values, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeBetween(String value1, String value2) {
            addCriterion("insurantCertiType between", value1, value2, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertitypeNotBetween(String value1, String value2) {
            addCriterion("insurantCertiType not between", value1, value2, "insurantcertitype");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoIsNull() {
            addCriterion("insurantCertiNo is null");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoIsNotNull() {
            addCriterion("insurantCertiNo is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoEqualTo(String value) {
            addCriterion("insurantCertiNo =", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoNotEqualTo(String value) {
            addCriterion("insurantCertiNo <>", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoGreaterThan(String value) {
            addCriterion("insurantCertiNo >", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoGreaterThanOrEqualTo(String value) {
            addCriterion("insurantCertiNo >=", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoLessThan(String value) {
            addCriterion("insurantCertiNo <", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoLessThanOrEqualTo(String value) {
            addCriterion("insurantCertiNo <=", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoLike(String value) {
            addCriterion("insurantCertiNo like", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoNotLike(String value) {
            addCriterion("insurantCertiNo not like", value, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoIn(List<String> values) {
            addCriterion("insurantCertiNo in", values, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoNotIn(List<String> values) {
            addCriterion("insurantCertiNo not in", values, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoBetween(String value1, String value2) {
            addCriterion("insurantCertiNo between", value1, value2, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantcertinoNotBetween(String value1, String value2) {
            addCriterion("insurantCertiNo not between", value1, value2, "insurantcertino");
            return (Criteria) this;
        }

        public Criteria andInsurantsexIsNull() {
            addCriterion("insurantSex is null");
            return (Criteria) this;
        }

        public Criteria andInsurantsexIsNotNull() {
            addCriterion("insurantSex is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantsexEqualTo(String value) {
            addCriterion("insurantSex =", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexNotEqualTo(String value) {
            addCriterion("insurantSex <>", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexGreaterThan(String value) {
            addCriterion("insurantSex >", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexGreaterThanOrEqualTo(String value) {
            addCriterion("insurantSex >=", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexLessThan(String value) {
            addCriterion("insurantSex <", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexLessThanOrEqualTo(String value) {
            addCriterion("insurantSex <=", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexLike(String value) {
            addCriterion("insurantSex like", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexNotLike(String value) {
            addCriterion("insurantSex not like", value, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexIn(List<String> values) {
            addCriterion("insurantSex in", values, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexNotIn(List<String> values) {
            addCriterion("insurantSex not in", values, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexBetween(String value1, String value2) {
            addCriterion("insurantSex between", value1, value2, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantsexNotBetween(String value1, String value2) {
            addCriterion("insurantSex not between", value1, value2, "insurantsex");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileIsNull() {
            addCriterion("insurantMobile is null");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileIsNotNull() {
            addCriterion("insurantMobile is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileEqualTo(String value) {
            addCriterion("insurantMobile =", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileNotEqualTo(String value) {
            addCriterion("insurantMobile <>", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileGreaterThan(String value) {
            addCriterion("insurantMobile >", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileGreaterThanOrEqualTo(String value) {
            addCriterion("insurantMobile >=", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileLessThan(String value) {
            addCriterion("insurantMobile <", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileLessThanOrEqualTo(String value) {
            addCriterion("insurantMobile <=", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileLike(String value) {
            addCriterion("insurantMobile like", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileNotLike(String value) {
            addCriterion("insurantMobile not like", value, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileIn(List<String> values) {
            addCriterion("insurantMobile in", values, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileNotIn(List<String> values) {
            addCriterion("insurantMobile not in", values, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileBetween(String value1, String value2) {
            addCriterion("insurantMobile between", value1, value2, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantmobileNotBetween(String value1, String value2) {
            addCriterion("insurantMobile not between", value1, value2, "insurantmobile");
            return (Criteria) this;
        }

        public Criteria andInsurantemailIsNull() {
            addCriterion("insurantEmail is null");
            return (Criteria) this;
        }

        public Criteria andInsurantemailIsNotNull() {
            addCriterion("insurantEmail is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantemailEqualTo(String value) {
            addCriterion("insurantEmail =", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailNotEqualTo(String value) {
            addCriterion("insurantEmail <>", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailGreaterThan(String value) {
            addCriterion("insurantEmail >", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailGreaterThanOrEqualTo(String value) {
            addCriterion("insurantEmail >=", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailLessThan(String value) {
            addCriterion("insurantEmail <", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailLessThanOrEqualTo(String value) {
            addCriterion("insurantEmail <=", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailLike(String value) {
            addCriterion("insurantEmail like", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailNotLike(String value) {
            addCriterion("insurantEmail not like", value, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailIn(List<String> values) {
            addCriterion("insurantEmail in", values, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailNotIn(List<String> values) {
            addCriterion("insurantEmail not in", values, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailBetween(String value1, String value2) {
            addCriterion("insurantEmail between", value1, value2, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantemailNotBetween(String value1, String value2) {
            addCriterion("insurantEmail not between", value1, value2, "insurantemail");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrIsNull() {
            addCriterion("insurantAddr is null");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrIsNotNull() {
            addCriterion("insurantAddr is not null");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrEqualTo(String value) {
            addCriterion("insurantAddr =", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrNotEqualTo(String value) {
            addCriterion("insurantAddr <>", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrGreaterThan(String value) {
            addCriterion("insurantAddr >", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrGreaterThanOrEqualTo(String value) {
            addCriterion("insurantAddr >=", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrLessThan(String value) {
            addCriterion("insurantAddr <", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrLessThanOrEqualTo(String value) {
            addCriterion("insurantAddr <=", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrLike(String value) {
            addCriterion("insurantAddr like", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrNotLike(String value) {
            addCriterion("insurantAddr not like", value, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrIn(List<String> values) {
            addCriterion("insurantAddr in", values, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrNotIn(List<String> values) {
            addCriterion("insurantAddr not in", values, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrBetween(String value1, String value2) {
            addCriterion("insurantAddr between", value1, value2, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andInsurantaddrNotBetween(String value1, String value2) {
            addCriterion("insurantAddr not between", value1, value2, "insurantaddr");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNull() {
            addCriterion("provinceCode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNotNull() {
            addCriterion("provinceCode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeEqualTo(String value) {
            addCriterion("provinceCode =", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotEqualTo(String value) {
            addCriterion("provinceCode <>", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThan(String value) {
            addCriterion("provinceCode >", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThanOrEqualTo(String value) {
            addCriterion("provinceCode >=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThan(String value) {
            addCriterion("provinceCode <", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThanOrEqualTo(String value) {
            addCriterion("provinceCode <=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLike(String value) {
            addCriterion("provinceCode like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotLike(String value) {
            addCriterion("provinceCode not like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIn(List<String> values) {
            addCriterion("provinceCode in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotIn(List<String> values) {
            addCriterion("provinceCode not in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeBetween(String value1, String value2) {
            addCriterion("provinceCode between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotBetween(String value1, String value2) {
            addCriterion("provinceCode not between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("cityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("cityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("cityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("cityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("cityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("cityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("cityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("cityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("cityCode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("cityCode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("cityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("cityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("cityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("cityCode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIsNull() {
            addCriterion("districtCode is null");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIsNotNull() {
            addCriterion("districtCode is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeEqualTo(String value) {
            addCriterion("districtCode =", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotEqualTo(String value) {
            addCriterion("districtCode <>", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeGreaterThan(String value) {
            addCriterion("districtCode >", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeGreaterThanOrEqualTo(String value) {
            addCriterion("districtCode >=", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLessThan(String value) {
            addCriterion("districtCode <", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLessThanOrEqualTo(String value) {
            addCriterion("districtCode <=", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLike(String value) {
            addCriterion("districtCode like", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotLike(String value) {
            addCriterion("districtCode not like", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIn(List<String> values) {
            addCriterion("districtCode in", values, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotIn(List<String> values) {
            addCriterion("districtCode not in", values, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeBetween(String value1, String value2) {
            addCriterion("districtCode between", value1, value2, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotBetween(String value1, String value2) {
            addCriterion("districtCode not between", value1, value2, "districtcode");
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

        public Criteria andResidencetypeIsNull() {
            addCriterion("residenceType is null");
            return (Criteria) this;
        }

        public Criteria andResidencetypeIsNotNull() {
            addCriterion("residenceType is not null");
            return (Criteria) this;
        }

        public Criteria andResidencetypeEqualTo(String value) {
            addCriterion("residenceType =", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeNotEqualTo(String value) {
            addCriterion("residenceType <>", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeGreaterThan(String value) {
            addCriterion("residenceType >", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeGreaterThanOrEqualTo(String value) {
            addCriterion("residenceType >=", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeLessThan(String value) {
            addCriterion("residenceType <", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeLessThanOrEqualTo(String value) {
            addCriterion("residenceType <=", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeLike(String value) {
            addCriterion("residenceType like", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeNotLike(String value) {
            addCriterion("residenceType not like", value, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeIn(List<String> values) {
            addCriterion("residenceType in", values, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeNotIn(List<String> values) {
            addCriterion("residenceType not in", values, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeBetween(String value1, String value2) {
            addCriterion("residenceType between", value1, value2, "residencetype");
            return (Criteria) this;
        }

        public Criteria andResidencetypeNotBetween(String value1, String value2) {
            addCriterion("residenceType not between", value1, value2, "residencetype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeIsNull() {
            addCriterion("constructionType is null");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeIsNotNull() {
            addCriterion("constructionType is not null");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeEqualTo(String value) {
            addCriterion("constructionType =", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeNotEqualTo(String value) {
            addCriterion("constructionType <>", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeGreaterThan(String value) {
            addCriterion("constructionType >", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("constructionType >=", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeLessThan(String value) {
            addCriterion("constructionType <", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeLessThanOrEqualTo(String value) {
            addCriterion("constructionType <=", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeLike(String value) {
            addCriterion("constructionType like", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeNotLike(String value) {
            addCriterion("constructionType not like", value, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeIn(List<String> values) {
            addCriterion("constructionType in", values, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeNotIn(List<String> values) {
            addCriterion("constructionType not in", values, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeBetween(String value1, String value2) {
            addCriterion("constructionType between", value1, value2, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructiontypeNotBetween(String value1, String value2) {
            addCriterion("constructionType not between", value1, value2, "constructiontype");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureIsNull() {
            addCriterion("constructionStructure is null");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureIsNotNull() {
            addCriterion("constructionStructure is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureEqualTo(String value) {
            addCriterion("constructionStructure =", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureNotEqualTo(String value) {
            addCriterion("constructionStructure <>", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureGreaterThan(String value) {
            addCriterion("constructionStructure >", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureGreaterThanOrEqualTo(String value) {
            addCriterion("constructionStructure >=", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureLessThan(String value) {
            addCriterion("constructionStructure <", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureLessThanOrEqualTo(String value) {
            addCriterion("constructionStructure <=", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureLike(String value) {
            addCriterion("constructionStructure like", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureNotLike(String value) {
            addCriterion("constructionStructure not like", value, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureIn(List<String> values) {
            addCriterion("constructionStructure in", values, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureNotIn(List<String> values) {
            addCriterion("constructionStructure not in", values, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureBetween(String value1, String value2) {
            addCriterion("constructionStructure between", value1, value2, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andConstructionstructureNotBetween(String value1, String value2) {
            addCriterion("constructionStructure not between", value1, value2, "constructionstructure");
            return (Criteria) this;
        }

        public Criteria andIsrefitIsNull() {
            addCriterion("isRefit is null");
            return (Criteria) this;
        }

        public Criteria andIsrefitIsNotNull() {
            addCriterion("isRefit is not null");
            return (Criteria) this;
        }

        public Criteria andIsrefitEqualTo(String value) {
            addCriterion("isRefit =", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitNotEqualTo(String value) {
            addCriterion("isRefit <>", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitGreaterThan(String value) {
            addCriterion("isRefit >", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitGreaterThanOrEqualTo(String value) {
            addCriterion("isRefit >=", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitLessThan(String value) {
            addCriterion("isRefit <", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitLessThanOrEqualTo(String value) {
            addCriterion("isRefit <=", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitLike(String value) {
            addCriterion("isRefit like", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitNotLike(String value) {
            addCriterion("isRefit not like", value, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitIn(List<String> values) {
            addCriterion("isRefit in", values, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitNotIn(List<String> values) {
            addCriterion("isRefit not in", values, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitBetween(String value1, String value2) {
            addCriterion("isRefit between", value1, value2, "isrefit");
            return (Criteria) this;
        }

        public Criteria andIsrefitNotBetween(String value1, String value2) {
            addCriterion("isRefit not between", value1, value2, "isrefit");
            return (Criteria) this;
        }

        public Criteria andClausecodeIsNull() {
            addCriterion("clauseCode is null");
            return (Criteria) this;
        }

        public Criteria andClausecodeIsNotNull() {
            addCriterion("clauseCode is not null");
            return (Criteria) this;
        }

        public Criteria andClausecodeEqualTo(String value) {
            addCriterion("clauseCode =", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeNotEqualTo(String value) {
            addCriterion("clauseCode <>", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeGreaterThan(String value) {
            addCriterion("clauseCode >", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeGreaterThanOrEqualTo(String value) {
            addCriterion("clauseCode >=", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeLessThan(String value) {
            addCriterion("clauseCode <", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeLessThanOrEqualTo(String value) {
            addCriterion("clauseCode <=", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeLike(String value) {
            addCriterion("clauseCode like", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeNotLike(String value) {
            addCriterion("clauseCode not like", value, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeIn(List<String> values) {
            addCriterion("clauseCode in", values, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeNotIn(List<String> values) {
            addCriterion("clauseCode not in", values, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeBetween(String value1, String value2) {
            addCriterion("clauseCode between", value1, value2, "clausecode");
            return (Criteria) this;
        }

        public Criteria andClausecodeNotBetween(String value1, String value2) {
            addCriterion("clauseCode not between", value1, value2, "clausecode");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNull() {
            addCriterion("premium is null");
            return (Criteria) this;
        }

        public Criteria andPremiumIsNotNull() {
            addCriterion("premium is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumEqualTo(BigDecimal value) {
            addCriterion("premium =", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotEqualTo(BigDecimal value) {
            addCriterion("premium <>", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThan(BigDecimal value) {
            addCriterion("premium >", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premium >=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThan(BigDecimal value) {
            addCriterion("premium <", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premium <=", value, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumIn(List<BigDecimal> values) {
            addCriterion("premium in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotIn(List<BigDecimal> values) {
            addCriterion("premium not in", values, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andPremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premium not between", value1, value2, "premium");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNull() {
            addCriterion("sumAmount is null");
            return (Criteria) this;
        }

        public Criteria andSumamountIsNotNull() {
            addCriterion("sumAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSumamountEqualTo(BigDecimal value) {
            addCriterion("sumAmount =", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotEqualTo(BigDecimal value) {
            addCriterion("sumAmount <>", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThan(BigDecimal value) {
            addCriterion("sumAmount >", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sumAmount >=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThan(BigDecimal value) {
            addCriterion("sumAmount <", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sumAmount <=", value, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountIn(List<BigDecimal> values) {
            addCriterion("sumAmount in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotIn(List<BigDecimal> values) {
            addCriterion("sumAmount not in", values, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sumAmount between", value1, value2, "sumamount");
            return (Criteria) this;
        }

        public Criteria andSumamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sumAmount not between", value1, value2, "sumamount");
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