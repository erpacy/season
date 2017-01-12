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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andHdNameIsNull() {
            addCriterion("HD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHdNameIsNotNull() {
            addCriterion("HD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHdNameEqualTo(String value) {
            addCriterion("HD_NAME =", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotEqualTo(String value) {
            addCriterion("HD_NAME <>", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameGreaterThan(String value) {
            addCriterion("HD_NAME >", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameGreaterThanOrEqualTo(String value) {
            addCriterion("HD_NAME >=", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameLessThan(String value) {
            addCriterion("HD_NAME <", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameLessThanOrEqualTo(String value) {
            addCriterion("HD_NAME <=", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameLike(String value) {
            addCriterion("HD_NAME like", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotLike(String value) {
            addCriterion("HD_NAME not like", value, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameIn(List<String> values) {
            addCriterion("HD_NAME in", values, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotIn(List<String> values) {
            addCriterion("HD_NAME not in", values, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameBetween(String value1, String value2) {
            addCriterion("HD_NAME between", value1, value2, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdNameNotBetween(String value1, String value2) {
            addCriterion("HD_NAME not between", value1, value2, "hdName");
            return (Criteria) this;
        }

        public Criteria andHdCompanyIsNull() {
            addCriterion("HD_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andHdCompanyIsNotNull() {
            addCriterion("HD_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andHdCompanyEqualTo(String value) {
            addCriterion("HD_COMPANY =", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyNotEqualTo(String value) {
            addCriterion("HD_COMPANY <>", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyGreaterThan(String value) {
            addCriterion("HD_COMPANY >", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("HD_COMPANY >=", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyLessThan(String value) {
            addCriterion("HD_COMPANY <", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyLessThanOrEqualTo(String value) {
            addCriterion("HD_COMPANY <=", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyLike(String value) {
            addCriterion("HD_COMPANY like", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyNotLike(String value) {
            addCriterion("HD_COMPANY not like", value, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyIn(List<String> values) {
            addCriterion("HD_COMPANY in", values, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyNotIn(List<String> values) {
            addCriterion("HD_COMPANY not in", values, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyBetween(String value1, String value2) {
            addCriterion("HD_COMPANY between", value1, value2, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdCompanyNotBetween(String value1, String value2) {
            addCriterion("HD_COMPANY not between", value1, value2, "hdCompany");
            return (Criteria) this;
        }

        public Criteria andHdTypeIsNull() {
            addCriterion("HD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHdTypeIsNotNull() {
            addCriterion("HD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHdTypeEqualTo(Integer value) {
            addCriterion("HD_TYPE =", value, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeNotEqualTo(Integer value) {
            addCriterion("HD_TYPE <>", value, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeGreaterThan(Integer value) {
            addCriterion("HD_TYPE >", value, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("HD_TYPE >=", value, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeLessThan(Integer value) {
            addCriterion("HD_TYPE <", value, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("HD_TYPE <=", value, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeIn(List<Integer> values) {
            addCriterion("HD_TYPE in", values, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeNotIn(List<Integer> values) {
            addCriterion("HD_TYPE not in", values, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeBetween(Integer value1, Integer value2) {
            addCriterion("HD_TYPE between", value1, value2, "hdType");
            return (Criteria) this;
        }

        public Criteria andHdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("HD_TYPE not between", value1, value2, "hdType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHdMoneyIsNull() {
            addCriterion("HD_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andHdMoneyIsNotNull() {
            addCriterion("HD_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andHdMoneyEqualTo(Double value) {
            addCriterion("HD_MONEY =", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyNotEqualTo(Double value) {
            addCriterion("HD_MONEY <>", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyGreaterThan(Double value) {
            addCriterion("HD_MONEY >", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("HD_MONEY >=", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyLessThan(Double value) {
            addCriterion("HD_MONEY <", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyLessThanOrEqualTo(Double value) {
            addCriterion("HD_MONEY <=", value, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyIn(List<Double> values) {
            addCriterion("HD_MONEY in", values, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyNotIn(List<Double> values) {
            addCriterion("HD_MONEY not in", values, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyBetween(Double value1, Double value2) {
            addCriterion("HD_MONEY between", value1, value2, "hdMoney");
            return (Criteria) this;
        }

        public Criteria andHdMoneyNotBetween(Double value1, Double value2) {
            addCriterion("HD_MONEY not between", value1, value2, "hdMoney");
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