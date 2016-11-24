package org.seasonteam.season.model;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseTypeExample() {
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

        public Criteria andEtIdIsNull() {
            addCriterion("et_id is null");
            return (Criteria) this;
        }

        public Criteria andEtIdIsNotNull() {
            addCriterion("et_id is not null");
            return (Criteria) this;
        }

        public Criteria andEtIdEqualTo(Integer value) {
            addCriterion("et_id =", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdNotEqualTo(Integer value) {
            addCriterion("et_id <>", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdGreaterThan(Integer value) {
            addCriterion("et_id >", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("et_id >=", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdLessThan(Integer value) {
            addCriterion("et_id <", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdLessThanOrEqualTo(Integer value) {
            addCriterion("et_id <=", value, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdIn(List<Integer> values) {
            addCriterion("et_id in", values, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdNotIn(List<Integer> values) {
            addCriterion("et_id not in", values, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdBetween(Integer value1, Integer value2) {
            addCriterion("et_id between", value1, value2, "etId");
            return (Criteria) this;
        }

        public Criteria andEtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("et_id not between", value1, value2, "etId");
            return (Criteria) this;
        }

        public Criteria andEtNameIsNull() {
            addCriterion("et_name is null");
            return (Criteria) this;
        }

        public Criteria andEtNameIsNotNull() {
            addCriterion("et_name is not null");
            return (Criteria) this;
        }

        public Criteria andEtNameEqualTo(String value) {
            addCriterion("et_name =", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotEqualTo(String value) {
            addCriterion("et_name <>", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameGreaterThan(String value) {
            addCriterion("et_name >", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameGreaterThanOrEqualTo(String value) {
            addCriterion("et_name >=", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameLessThan(String value) {
            addCriterion("et_name <", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameLessThanOrEqualTo(String value) {
            addCriterion("et_name <=", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameLike(String value) {
            addCriterion("et_name like", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotLike(String value) {
            addCriterion("et_name not like", value, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameIn(List<String> values) {
            addCriterion("et_name in", values, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotIn(List<String> values) {
            addCriterion("et_name not in", values, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameBetween(String value1, String value2) {
            addCriterion("et_name between", value1, value2, "etName");
            return (Criteria) this;
        }

        public Criteria andEtNameNotBetween(String value1, String value2) {
            addCriterion("et_name not between", value1, value2, "etName");
            return (Criteria) this;
        }

        public Criteria andEtDesIsNull() {
            addCriterion("et_des is null");
            return (Criteria) this;
        }

        public Criteria andEtDesIsNotNull() {
            addCriterion("et_des is not null");
            return (Criteria) this;
        }

        public Criteria andEtDesEqualTo(String value) {
            addCriterion("et_des =", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesNotEqualTo(String value) {
            addCriterion("et_des <>", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesGreaterThan(String value) {
            addCriterion("et_des >", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesGreaterThanOrEqualTo(String value) {
            addCriterion("et_des >=", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesLessThan(String value) {
            addCriterion("et_des <", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesLessThanOrEqualTo(String value) {
            addCriterion("et_des <=", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesLike(String value) {
            addCriterion("et_des like", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesNotLike(String value) {
            addCriterion("et_des not like", value, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesIn(List<String> values) {
            addCriterion("et_des in", values, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesNotIn(List<String> values) {
            addCriterion("et_des not in", values, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesBetween(String value1, String value2) {
            addCriterion("et_des between", value1, value2, "etDes");
            return (Criteria) this;
        }

        public Criteria andEtDesNotBetween(String value1, String value2) {
            addCriterion("et_des not between", value1, value2, "etDes");
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