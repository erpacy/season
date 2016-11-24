package org.seasonteam.season.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andSiIdIsNull() {
            addCriterion("si_id is null");
            return (Criteria) this;
        }

        public Criteria andSiIdIsNotNull() {
            addCriterion("si_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiIdEqualTo(Integer value) {
            addCriterion("si_id =", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotEqualTo(Integer value) {
            addCriterion("si_id <>", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThan(Integer value) {
            addCriterion("si_id >", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("si_id >=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThan(Integer value) {
            addCriterion("si_id <", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThanOrEqualTo(Integer value) {
            addCriterion("si_id <=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdIn(List<Integer> values) {
            addCriterion("si_id in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotIn(List<Integer> values) {
            addCriterion("si_id not in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdBetween(Integer value1, Integer value2) {
            addCriterion("si_id between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("si_id not between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andHdIdIsNull() {
            addCriterion("hd_id is null");
            return (Criteria) this;
        }

        public Criteria andHdIdIsNotNull() {
            addCriterion("hd_id is not null");
            return (Criteria) this;
        }

        public Criteria andHdIdEqualTo(Integer value) {
            addCriterion("hd_id =", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotEqualTo(Integer value) {
            addCriterion("hd_id <>", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdGreaterThan(Integer value) {
            addCriterion("hd_id >", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hd_id >=", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLessThan(Integer value) {
            addCriterion("hd_id <", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLessThanOrEqualTo(Integer value) {
            addCriterion("hd_id <=", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdIn(List<Integer> values) {
            addCriterion("hd_id in", values, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotIn(List<Integer> values) {
            addCriterion("hd_id not in", values, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdBetween(Integer value1, Integer value2) {
            addCriterion("hd_id between", value1, value2, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hd_id not between", value1, value2, "hdId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andSiDesIsNull() {
            addCriterion("si_des is null");
            return (Criteria) this;
        }

        public Criteria andSiDesIsNotNull() {
            addCriterion("si_des is not null");
            return (Criteria) this;
        }

        public Criteria andSiDesEqualTo(String value) {
            addCriterion("si_des =", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotEqualTo(String value) {
            addCriterion("si_des <>", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesGreaterThan(String value) {
            addCriterion("si_des >", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesGreaterThanOrEqualTo(String value) {
            addCriterion("si_des >=", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesLessThan(String value) {
            addCriterion("si_des <", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesLessThanOrEqualTo(String value) {
            addCriterion("si_des <=", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesLike(String value) {
            addCriterion("si_des like", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotLike(String value) {
            addCriterion("si_des not like", value, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesIn(List<String> values) {
            addCriterion("si_des in", values, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotIn(List<String> values) {
            addCriterion("si_des not in", values, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesBetween(String value1, String value2) {
            addCriterion("si_des between", value1, value2, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiDesNotBetween(String value1, String value2) {
            addCriterion("si_des not between", value1, value2, "siDes");
            return (Criteria) this;
        }

        public Criteria andSiTypeIsNull() {
            addCriterion("si_type is null");
            return (Criteria) this;
        }

        public Criteria andSiTypeIsNotNull() {
            addCriterion("si_type is not null");
            return (Criteria) this;
        }

        public Criteria andSiTypeEqualTo(String value) {
            addCriterion("si_type =", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotEqualTo(String value) {
            addCriterion("si_type <>", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeGreaterThan(String value) {
            addCriterion("si_type >", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("si_type >=", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeLessThan(String value) {
            addCriterion("si_type <", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeLessThanOrEqualTo(String value) {
            addCriterion("si_type <=", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeLike(String value) {
            addCriterion("si_type like", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotLike(String value) {
            addCriterion("si_type not like", value, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeIn(List<String> values) {
            addCriterion("si_type in", values, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotIn(List<String> values) {
            addCriterion("si_type not in", values, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeBetween(String value1, String value2) {
            addCriterion("si_type between", value1, value2, "siType");
            return (Criteria) this;
        }

        public Criteria andSiTypeNotBetween(String value1, String value2) {
            addCriterion("si_type not between", value1, value2, "siType");
            return (Criteria) this;
        }

        public Criteria andSiMoneyIsNull() {
            addCriterion("si_money is null");
            return (Criteria) this;
        }

        public Criteria andSiMoneyIsNotNull() {
            addCriterion("si_money is not null");
            return (Criteria) this;
        }

        public Criteria andSiMoneyEqualTo(Double value) {
            addCriterion("si_money =", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyNotEqualTo(Double value) {
            addCriterion("si_money <>", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyGreaterThan(Double value) {
            addCriterion("si_money >", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("si_money >=", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyLessThan(Double value) {
            addCriterion("si_money <", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyLessThanOrEqualTo(Double value) {
            addCriterion("si_money <=", value, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyIn(List<Double> values) {
            addCriterion("si_money in", values, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyNotIn(List<Double> values) {
            addCriterion("si_money not in", values, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyBetween(Double value1, Double value2) {
            addCriterion("si_money between", value1, value2, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiMoneyNotBetween(Double value1, Double value2) {
            addCriterion("si_money not between", value1, value2, "siMoney");
            return (Criteria) this;
        }

        public Criteria andSiDateIsNull() {
            addCriterion("si_date is null");
            return (Criteria) this;
        }

        public Criteria andSiDateIsNotNull() {
            addCriterion("si_date is not null");
            return (Criteria) this;
        }

        public Criteria andSiDateEqualTo(Date value) {
            addCriterionForJDBCDate("si_date =", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("si_date <>", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateGreaterThan(Date value) {
            addCriterionForJDBCDate("si_date >", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("si_date >=", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLessThan(Date value) {
            addCriterionForJDBCDate("si_date <", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("si_date <=", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateIn(List<Date> values) {
            addCriterionForJDBCDate("si_date in", values, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("si_date not in", values, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("si_date between", value1, value2, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("si_date not between", value1, value2, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiTimeIsNull() {
            addCriterion("si_time is null");
            return (Criteria) this;
        }

        public Criteria andSiTimeIsNotNull() {
            addCriterion("si_time is not null");
            return (Criteria) this;
        }

        public Criteria andSiTimeEqualTo(Date value) {
            addCriterionForJDBCTime("si_time =", value, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("si_time <>", value, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("si_time >", value, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("si_time >=", value, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeLessThan(Date value) {
            addCriterionForJDBCTime("si_time <", value, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("si_time <=", value, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeIn(List<Date> values) {
            addCriterionForJDBCTime("si_time in", values, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("si_time not in", values, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("si_time between", value1, value2, "siTime");
            return (Criteria) this;
        }

        public Criteria andSiTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("si_time not between", value1, value2, "siTime");
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