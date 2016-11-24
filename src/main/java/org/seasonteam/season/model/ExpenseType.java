package org.seasonteam.season.model;

public class ExpenseType {
    private Integer etId;

    private String etName;

    private String etDes;

    public Integer getEtId() {
        return etId;
    }

    public void setEtId(Integer etId) {
        this.etId = etId;
    }

    public String getEtName() {
        return etName;
    }

    public void setEtName(String etName) {
        this.etName = etName == null ? null : etName.trim();
    }

    public String getEtDes() {
        return etDes;
    }

    public void setEtDes(String etDes) {
        this.etDes = etDes == null ? null : etDes.trim();
    }
}