package com.shie.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Insorderpay {
    private Integer insorderpayId;

    private Integer insorderId;

    private Date paytime;

    private String paychannel;

    private BigDecimal amount;

    public Integer getInsorderpayId() {
        return insorderpayId;
    }

    public void setInsorderpayId(Integer insorderpayId) {
        this.insorderpayId = insorderpayId;
    }

    public Integer getInsorderId() {
        return insorderId;
    }

    public void setInsorderId(Integer insorderId) {
        this.insorderId = insorderId;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getPaychannel() {
        return paychannel;
    }

    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel == null ? null : paychannel.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}