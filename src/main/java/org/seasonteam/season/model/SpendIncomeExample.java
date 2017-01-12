package org.seasonteam.season.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpendIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpendIncomeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSiIdIsNull() {
            addCriterion("SI_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiIdIsNotNull() {
            addCriterion("SI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiIdEqualTo(String value) {
            addCriterion("SI_ID =", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotEqualTo(String value) {
            addCriterion("SI_ID <>", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThan(String value) {
            addCriterion("SI_ID >", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThanOrEqualTo(String value) {
            addCriterion("SI_ID >=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThan(String value) {
            addCriterion("SI_ID <", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThanOrEqualTo(String value) {
            addCriterion("SI_ID <=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLike(String value) {
            addCriterion("SI_ID like", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotLike(String value) {
            addCriterion("SI_ID not like", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdIn(List<String> values) {
            addCriterion("SI_ID in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotIn(List<String> values) {
            addCriterion("SI_ID not in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdBetween(String value1, String value2) {
            addCriterion("SI_ID between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotBetween(String value1, String value2) {
            addCriterion("SI_ID not between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andHdIdIsNull() {
            addCriterion("HD_ID is null");
            return (Criteria) this;
        }

        public Criteria andHdIdIsNotNull() {
            addCriterion("HD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHdIdEqualTo(String value) {
            addCriterion("HD_ID =", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotEqualTo(String value) {
            addCriterion("HD_ID <>", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdGreaterThan(String value) {
            addCriterion("HD_ID >", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdGreaterThanOrEqualTo(String value) {
            addCriterion("HD_ID >=", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLessThan(String value) {
            addCriterion("HD_ID <", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLessThanOrEqualTo(String value) {
            addCriterion("HD_ID <=", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLike(String value) {
            addCriterion("HD_ID like", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotLike(String value) {
            addCriterion("HD_ID not like", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdIn(List<String> values) {
            addCriterion("HD_ID in", values, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotIn(List<String> values) {
            addCriterion("HD_ID not in", values, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdBetween(String value1, String value2) {
            addCriterion("HD_ID between", value1, value2, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotBetween(String value1, String value2) {
            addCriterion("HD_ID not between", value1, value2, "hdId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("ACCOUNT_ID like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("ACCOUNT_ID not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andSiDesIsNull() {
            addCriterion("SI_DES is null");
            return (Criteria) this;
        }

        public Criteria andSiDesIsNotNull() {
            addCriterion("SI_DES is not null");
            return (Criteria) this;
        }

        public Criteria andSiDesEqualTo(String value) {
            addCriterion("SI_DES =", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotEqualTo(String value) {
            addCriterion("SI_DES <>", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesGreaterThan(String value) {
            addCriterion("SI_DES >", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesGreaterThanOrEqualTo(String value) {
            addCriterion("SI_DES >=", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesLessThan(String value) {
            addCriterion("SI_DES <", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesLessThanOrEqualTo(String value) {
            addCriterion("SI_DES <=", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesLike(String value) {
            addCriterion("SI_DES like", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotLike(String value) {
            addCriterion("SI_DES not like", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesIn(List<String> values) {
            addCriterion("SI_DES in", values, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotIn(List<String> values) {
            addCriterion("SI_DES not in", values, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesBetween(String value1, String value2) {
            addCriterion("SI_DES between", value1, value2, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotBetween(String value1, String value2) {
            addCriterion("SI_DES not between", value1, value2, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiTypeIsNull() {
            addCriterion("SI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSiTypeIsNotNull() {
            addCriterion("SI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSiTypeEqualTo(String value) {
            addCriterion("SI_TYPE =", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotEqualTo(String value) {
            addCriterion("SI_TYPE <>", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeGreaterThan(String value) {
            addCriterion("SI_TYPE >", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SI_TYPE >=", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeLessThan(String value) {
            addCriterion("SI_TYPE <", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeLessThanOrEqualTo(String value) {
            addCriterion("SI_TYPE <=", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeLike(String value) {
            addCriterion("SI_TYPE like", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotLike(String value) {
            addCriterion("SI_TYPE not like", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeIn(List<String> values) {
            addCriterion("SI_TYPE in", values, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotIn(List<String> values) {
            addCriterion("SI_TYPE not in", values, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeBetween(String value1, String value2) {
            addCriterion("SI_TYPE between", value1, value2, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotBetween(String value1, String value2) {
            addCriterion("SI_TYPE not between", value1, value2, "siType");
            return (Criteria) this;
        }

        public Criteria andSiMoneyIsNull() {
            addCriterion("SI_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andSiMoneyIsNotNull() {
            addCriterion("SI_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSiMoneyEqualTo(Double value) {
            addCriterion("SI_MONEY =", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyNotEqualTo(Double value) {
            addCriterion("SI_MONEY <>", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyGreaterThan(Double value) {
            addCriterion("SI_MONEY >", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("SI_MONEY >=", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyLessThan(Double value) {
            addCriterion("SI_MONEY <", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyLessThanOrEqualTo(Double value) {
            addCriterion("SI_MONEY <=", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyIn(List<Double> values) {
            addCriterion("SI_MONEY in", values, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyNotIn(List<Double> values) {
            addCriterion("SI_MONEY not in", values, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyBetween(Double value1, Double value2) {
            addCriterion("SI_MONEY between", value1, value2, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyNotBetween(Double value1, Double value2) {
            addCriterion("SI_MONEY not between", value1, value2, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiDateIsNull() {
            addCriterion("SI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSiDateIsNotNull() {
            addCriterion("SI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSiDateEqualTo(Date value) {
            addCriterion("SI_DATE =", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotEqualTo(Date value) {
            addCriterion("SI_DATE <>", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateGreaterThan(Date value) {
            addCriterion("SI_DATE >", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SI_DATE >=", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLessThan(Date value) {
            addCriterion("SI_DATE <", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLessThanOrEqualTo(Date value) {
            addCriterion("SI_DATE <=", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateIn(List<Date> values) {
            addCriterion("SI_DATE in", values, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotIn(List<Date> values) {
            addCriterion("SI_DATE not in", values, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateBetween(Date value1, Date value2) {
            addCriterion("SI_DATE between", value1, value2, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotBetween(Date value1, Date value2) {
            addCriterion("SI_DATE not between", value1, value2, "siDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}