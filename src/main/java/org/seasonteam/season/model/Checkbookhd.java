package org.seasonteam.season.model;

import java.util.Date;

public class Checkbookhd {
    private String hdId;

    private String userid;

    private String hdName;

    private String hdCompany;

    private Integer hdType;

    private Date createTime;

    private Double hdMoney;

    public String getHdId() {
        return hdId;
    }

    public void setHdId(String hdId) {
        this.hdId = hdId == null ? null : hdId.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getHdName() {
        return hdName;
    }

    public void setHdName(String hdName) {
        this.hdName = hdName == null ? null : hdName.trim();
    }

    public String getHdCompany() {
        return hdCompany;
    }

    public void setHdCompany(String hdCompany) {
        this.hdCompany = hdCompany == null ? null : hdCompany.trim();
    }

    public Integer getHdType() {
        return hdType;
    }

    public void setHdType(Integer hdType) {
        this.hdType = hdType;
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