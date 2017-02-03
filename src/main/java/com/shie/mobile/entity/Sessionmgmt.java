package com.shie.mobile.entity;

import java.util.Date;

public class Sessionmgmt {
    private Integer sessionmgmtId;

    private String sessionId;

    private Date createtime;

    private Date updatetime;

    private String ipaddress;

    private String mobileno;

    private String verficode;

    private Integer insorderId;

    private String provincecomcode;

    private String branchcomcode;

    private String businesscomcode;

    private String agentcode;

    private String status;

    public Integer getSessionmgmtId() {
        return sessionmgmtId;
    }

    public void setSessionmgmtId(Integer sessionmgmtId) {
        this.sessionmgmtId = sessionmgmtId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
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

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno == null ? null : mobileno.trim();
    }

    public String getVerficode() {
        return verficode;
    }

    public void setVerficode(String verficode) {
        this.verficode = verficode == null ? null : verficode.trim();
    }

    public Integer getInsorderId() {
        return insorderId;
    }

    public void setInsorderId(Integer insorderId) {
        this.insorderId = insorderId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}