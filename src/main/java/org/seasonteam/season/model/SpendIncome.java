package org.seasonteam.season.model;

import java.util.Date;

public class SpendIncome {
    private String siId;

    private String hdId;

    private String accountId;

    private String siDes;

    private String siType;

    private Double siMoney;

    private Date siDate;

    public String getSiId() {
        return siId;
    }

    public void setSiId(String siId) {
        this.siId = siId == null ? null : siId.trim();
    }

    public String getHdId() {
        return hdId;
    }

    public void setHdId(String hdId) {
        this.hdId = hdId == null ? null : hdId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
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
}