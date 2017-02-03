package com.shie.mobile.entity;

import java.util.Date;

public class Insorder {
    private Integer insorderId;

    private String sessionId;

    private String productcode;

    private Date applydate;

    private Date startdate;

    private Date enddate;

    private String provincecomcode;

    private String branchcomcode;

    private String businesscomcode;

    private String agentcode;

    private String holdertype;

    private String holdername;

    private String holdercertitype;

    private String holdercertino;

    private String holdersex;

    private String holdermobile;

    private String holderemail;

    private String holderrelatoinsured;

    private String holderaddr;

    private Date createtime;

    private Date updatetime;

    private String status;

    private String orderId;

    public Integer getInsorderId() {
        return insorderId;
    }

    public void setInsorderId(Integer insorderId) {
        this.insorderId = insorderId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getProvincecomcode() {
        return provincecomcode;
    }

    public void setProvincecomcode(String provincecomcode) {
        this.provincecomcode = provincecomcode == null ? null : provincecomcode.trim();
    }

    public String getBranchcomcode() {
        return branchcomcode;
    }

    public void setBranchcomcode(String branchcomcode) {
        this.branchcomcode = branchcomcode == null ? null : branchcomcode.trim();
    }

    public String getBusinesscomcode() {
        return businesscomcode;
    }

    public void setBusinesscomcode(String businesscomcode) {
        this.businesscomcode = businesscomcode == null ? null : businesscomcode.trim();
    }

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode == null ? null : agentcode.trim();
    }

    public String getHoldertype() {
        return holdertype;
    }

    public void setHoldertype(String holdertype) {
        this.holdertype = holdertype == null ? null : holdertype.trim();
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername == null ? null : holdername.trim();
    }

    public String getHoldercertitype() {
        return holdercertitype;
    }

    public void setHoldercertitype(String holdercertitype) {
        this.holdercertitype = holdercertitype == null ? null : holdercertitype.trim();
    }

    public String getHoldercertino() {
        return holdercertino;
    }

    public void setHoldercertino(String holdercertino) {
        this.holdercertino = holdercertino == null ? null : holdercertino.trim();
    }

    public String getHoldersex() {
        return holdersex;
    }

    public void setHoldersex(String holdersex) {
        this.holdersex = holdersex == null ? null : holdersex.trim();
    }

    public String getHoldermobile() {
        return holdermobile;
    }

    public void setHoldermobile(String holdermobile) {
        this.holdermobile = holdermobile == null ? null : holdermobile.trim();
    }

    public String getHolderemail() {
        return holderemail;
    }

    public void setHolderemail(String holderemail) {
        this.holderemail = holderemail == null ? null : holderemail.trim();
    }

    public String getHolderrelatoinsured() {
        return holderrelatoinsured;
    }

    public void setHolderrelatoinsured(String holderrelatoinsured) {
        this.holderrelatoinsured = holderrelatoinsured == null ? null : holderrelatoinsured.trim();
    }

    public String getHolderaddr() {
        return holderaddr;
    }

    public void setHolderaddr(String holderaddr) {
        this.holderaddr = holderaddr == null ? null : holderaddr.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}