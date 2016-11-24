package org.seasonteam.season.model;

import java.util.Date;

public class SpendIncome {
    private Integer siId;

    private Integer hdId;

    private Integer accountId;

    private String siDes;

    private String siType;

    private Double siMoney;

    private Date siDate;

    private Date siTime;

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public Integer getHdId() {
        return hdId;
    }

    public void setHdId(Integer hdId) {
        this.hdId = hdId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getSiDes() {
        return siDes;
    }

    public void setSiDes(String siDes) {
        this.siDes = siDes == null ? null : siDes.trim();
    }

    public String getSiType() {
        return siType;
    }

    public void setSiType(String siType) {
        this.siType = siType == null ? null : siType.trim();
    }

    public Double getSiMoney() {
        return siMoney;
    }

    public void setSiMoney(Double siMoney) {
        this.siMoney = siMoney;
    }

    public Date getSiDate() {
        return siDate;
    }

    public void setSiDate(Date siDate) {
        this.siDate = siDate;
    }

    public Date getSiTime() {
        return siTime;
    }

    public void setSiTime(Date siTime) {
        this.siTime = siTime;
    }
}