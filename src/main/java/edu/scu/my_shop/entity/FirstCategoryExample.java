package edu.scu.my_shop.entity;

import java.util.ArrayList;
import java.util.List;

public class FirstCategoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public FirstCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
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

        public Criteria andFirstCategoryIdIsNull() {
            addCriterion("first_category_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdIsNotNull() {
            addCriterion("first_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdEqualTo(String value) {
            addCriterion("first_category_id =", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdNotEqualTo(String value) {
            addCriterion("first_category_id <>", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdGreaterThan(String value) {
            addCriterion("first_category_id >", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_category_id >=", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdLessThan(String value) {
            addCriterion("first_category_id <", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("first_category_id <=", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdLike(String value) {
            addCriterion("first_category_id like", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdNotLike(String value) {
            addCriterion("first_category_id not like", value, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdIn(List<String> values) {
            addCriterion("first_category_id in", values, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdNotIn(List<String> values) {
            addCriterion("first_category_id not in", values, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdBetween(String value1, String value2) {
            addCriterion("first_category_id between", value1, value2, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIdNotBetween(String value1, String value2) {
            addCriterion("first_category_id not between", value1, value2, "firstCategoryId");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameIsNull() {
            addCriterion("first_category_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameIsNotNull() {
            addCriterion("first_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameEqualTo(String value) {
            addCriterion("first_category_name =", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameNotEqualTo(String value) {
            addCriterion("first_category_name <>", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameGreaterThan(String value) {
            addCriterion("first_category_name >", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_category_name >=", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameLessThan(String value) {
            addCriterion("first_category_name <", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("first_category_name <=", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameLike(String value) {
            addCriterion("first_category_name like", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameNotLike(String value) {
            addCriterion("first_category_name not like", value, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameIn(List<String> values) {
            addCriterion("first_category_name in", values, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameNotIn(List<String> values) {
            addCriterion("first_category_name not in", values, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameBetween(String value1, String value2) {
            addCriterion("first_category_name between", value1, value2, "firstCategoryName");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNameNotBetween(String value1, String value2) {
            addCriterion("first_category_name not between", value1, value2, "firstCategoryName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table first_category
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 17 10:46:26 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table first_category
     *
     * @mbg.generated Sat Mar 17 10:46:26 CST 2018
     */
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