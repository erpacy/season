package org.seasonteam.season.model;

import java.util.Date;

public class Account {
    private String accountId;

    private String userid;

    private String accountName;

    private String accountDes;

    private Date createTime;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountDes() {
        return accountDes;
    }

    public void setAccountDes(String accountDes) {
        this.accountDes = accountDes == null ? null : accountDes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}