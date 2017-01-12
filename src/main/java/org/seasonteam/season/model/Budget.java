package org.seasonteam.season.model;

public class Budget {
    private String budgetId;

    private String uid;

    private String bdatetime;

    private Double money;

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId == null ? null : budgetId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getBdatetime() {
        return bdatetime;
    }

    public void setBdatetime(String bdatetime) {
        this.bdatetime = bdatetime == null ? null : bdatetime.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}