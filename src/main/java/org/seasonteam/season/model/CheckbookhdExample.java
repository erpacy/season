package org.seasonteam.season.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckbookhdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckbookhdExample() {
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

        public Criteria andHdIdIsNull() {
            addCriterion("hd_id is null");
            return (Criteria) this;
        }

        public Criteria andHdIdIsNotNull() {
            addCriterion("hd_id is not null");
            return (Criteria) this;
        }

        public Criteria andHdIdEqualTo(String value) {
            addCriterion("hd_id =", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotEqualTo(String value) {
            addCriterion("hd_id <>", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdGreaterThan(String value) {
            addCriterion("hd_id >", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdGreaterThanOrEqualTo(String value) {
            addCriterion("hd_id >=", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLessThan(String value) {
            addCriterion("hd_id <", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLessThanOrEqualTo(String value) {
            addCriterion("hd_id <=", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdLike(String value) {
            addCriterion("hd_id like", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotLike(String value) {
            addCriterion("hd_id not like", value, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdIn(List<String> values) {
            addCriterion("hd_id in", values, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotIn(List<String> values) {
            addCriterion("hd_id not in", values, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdBetween(String value1, String value2) {
            addCriterion("hd_id between", value1, value2, "hdId");
            return (Criteria) this;
        }

        public Criteria andHdIdNotBetween(String value1, String value2) {
            addCriterion("hd_id not between", value1, value2, "hdId");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andHdNameIsNull() {
            addCriterion("hd_name is null");
            return (Criteria) this;
        }

        public Criteria andHdNameIsNotNull() {
            addCriterion("hd_name is not null");
            return (Criteria) this;
        }

        public Criteria andHdNameEqualTo(String value) {
            addCriterion("hd_name =", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotEqualTo(String value) {
            addCriterion("hd_name <>", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameGreaterThan(String value) {
            addCriterion("hd_name >", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameGreaterThanOrEqualTo(String value) {
            addCriterion("hd_name >=", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameLessThan(String value) {
            addCriterion("hd_name <", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameLessThanOrEqualTo(String value) {
            addCriterion("hd_name <=", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameLike(String value) {
            addCriterion("hd_name like", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotLike(String value) {
            addCriterion("hd_name not like", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameIn(List<String> values) {
            addCriterion("hd_name in", values, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotIn(List<String> values) {
            addCriterion("hd_name not in", values, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameBetween(String value1, String value2) {
            addCriterion("hd_name between", value1, value2, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotBetween(String value1, String value2) {
            addCriterion("hd_name not between", value1, value2, "hdName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHdMoneyIsNull() {
            addCriterion("hd_money is null");
            return (Criteria) this;
        }

        public Criteria andHdMoneyIsNotNull() {
            addCriterion("hd_money is not null");
            return (Criteria) this;
        }

        public Criteria andHdMoneyEqualTo(Double value) {
            addCriterion("hd_money =", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyNotEqualTo(Double value) {
            addCriterion("hd_money <>", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyGreaterThan(Double value) {
            addCriterion("hd_money >", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("hd_money >=", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyLessThan(Double value) {
            addCriterion("hd_money <", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyLessThanOrEqualTo(Double value) {
            addCriterion("hd_money <=", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyIn(List<Double> values) {
            addCriterion("hd_money in", values, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyNotIn(List<Double> values) {
            addCriterion("hd_money not in", values, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyBetween(Double value1, Double value2) {
            addCriterion("hd_money between", value1, value2, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyNotBetween(Double value1, Double value2) {
            addCriterion("hd_money not between", value1, value2, "hdMoney");
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