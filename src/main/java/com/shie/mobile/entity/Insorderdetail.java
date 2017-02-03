package com.shie.mobile.entity;

import java.math.BigDecimal;

public class Insorderdetail {
    private Integer insorderdetailId;

    private Integer insorderId;

    private String insurantname;

    private String insurantcertitype;

    private String insurantcertino;

    private String insurantsex;

    private String insurantmobile;

    private String insurantemail;

    private String insurantaddr;

    private String provincecode;

    private String citycode;

    private String districtcode;

    private String address;

    private String residencetype;

    private String constructiontype;

    private String constructionstructure;

    private String isrefit;

    private String clausecode;

    private BigDecimal premium;

    private BigDecimal sumamount;

    public Integer getInsorderdetailId() {
        return insorderdetailId;
    }

    public void setInsorderdetailId(Integer insorderdetailId) {
        this.insorderdetailId = insorderdetailId;
    }

    public Integer getInsorderId() {
        return insorderId;
    }

    public void setInsorderId(Integer insorderId) {
        this.insorderId = insorderId;
    }

    public String getInsurantname() {
        return insurantname;
    }

    public void setInsurantname(String insurantname) {
        this.insurantname = insurantname == null ? null : insurantname.trim();
    }

    public String getInsurantcertitype() {
        return insurantcertitype;
    }

    public void setInsurantcertitype(String insurantcertitype) {
        this.insurantcertitype = insurantcertitype == null ? null : insurantcertitype.trim();
    }

    public String getInsurantcertino() {
        return insurantcertino;
    }

    public void setInsurantcertino(String insurantcertino) {
        this.insurantcertino = insurantcertino == null ? null : insurantcertino.trim();
    }

    public String getInsurantsex() {
        return insurantsex;
    }

    public void setInsurantsex(String insurantsex) {
        this.insurantsex = insurantsex == null ? null : insurantsex.trim();
    }

    public String getInsurantmobile() {
        return insurantmobile;
    }

    public void setInsurantmobile(String insurantmobile) {
        this.insurantmobile = insurantmobile == null ? null : insurantmobile.trim();
    }

    public String getInsurantemail() {
        return insurantemail;
    }

    public void setInsurantemail(String insurantemail) {
        this.insurantemail = insurantemail == null ? null : insurantemail.trim();
    }

    public String getInsurantaddr() {
        return insurantaddr;
    }

    public void setInsurantaddr(String insurantaddr) {
        this.insurantaddr = insurantaddr == null ? null : insurantaddr.trim();
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getDistrictcode() {
        return districtcode;
    }

    public void setDistrictcode(String districtcode) {
        this.districtcode = districtcode == null ? null : districtcode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getResidencetype() {
        return residencetype;
    }

    public void setResidencetype(String residencetype) {
        this.residencetype = residencetype == null ? null : residencetype.trim();
    }

    public String getConstructiontype() {
        return constructiontype;
    }

    public void setConstructiontype(String constructiontype) {
        this.constructiontype = constructiontype == null ? null : constructiontype.trim();
    }

    public String getConstructionstructure() {
        return constructionstructure;
    }

    public void setConstructionstructure(String constructionstructure) {
        this.constructionstructure = constructionstructure == null ? null : constructionstructure.trim();
    }

    public String getIsrefit() {
        return isrefit;
    }

    public void setIsrefit(String isrefit) {
        this.isrefit = isrefit == null ? null : isrefit.trim();
    }

    public String getClausecode() {
        return clausecode;
    }

    public void setClausecode(String clausecode) {
        this.clausecode = clausecode == null ? null : clausecode.trim();
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getSumamount() {
        return sumamount;
    }

    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }
}