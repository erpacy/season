package org.seasonteam.season.model;

import java.util.Date;

public class Checkbookhd {
    private String hdId;

    private Integer userid;

    private String hdName;

    private Date createTime;

    private Double hdMoney;

    public String getHdId() {
        return hdId;
    }

    public void setHdId(String hdId) {
        this.hdId = hdId == null ? null : hdId.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getHdName() {
        return hdName;
    }

    public void setHdName(String hdName) {
        this.hdName = hdName == null ? null : hdName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getHdMoney() {
        return hdMoney;
    }

    public void setHdMoney(Double hdMoney) {
        this.hdMoney = hdMoney;
    }
}