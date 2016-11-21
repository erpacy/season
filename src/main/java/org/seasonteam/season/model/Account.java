package org.seasonteam.season.model;

import java.util.Date;

public class Account {
    private Integer accountId;

    private Integer userid;

    private String accountName;

    private String accountDes;

    private Date createTime;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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