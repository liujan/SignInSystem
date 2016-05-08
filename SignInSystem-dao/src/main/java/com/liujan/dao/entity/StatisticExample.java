package com.liujan.dao.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class StatisticExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public StatisticExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
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
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
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

        public Criteria andStatisticIdIsNull() {
            addCriterion("statistic_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticIdIsNotNull() {
            addCriterion("statistic_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticIdEqualTo(Integer value) {
            addCriterion("statistic_id =", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdNotEqualTo(Integer value) {
            addCriterion("statistic_id <>", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdGreaterThan(Integer value) {
            addCriterion("statistic_id >", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("statistic_id >=", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdLessThan(Integer value) {
            addCriterion("statistic_id <", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdLessThanOrEqualTo(Integer value) {
            addCriterion("statistic_id <=", value, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdIn(List<Integer> values) {
            addCriterion("statistic_id in", values, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdNotIn(List<Integer> values) {
            addCriterion("statistic_id not in", values, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdBetween(Integer value1, Integer value2) {
            addCriterion("statistic_id between", value1, value2, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStatisticIdNotBetween(Integer value1, Integer value2) {
            addCriterion("statistic_id not between", value1, value2, "statisticId");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andSiginTimeIsNull() {
            addCriterion("sigin_time is null");
            return (Criteria) this;
        }

        public Criteria andSiginTimeIsNotNull() {
            addCriterion("sigin_time is not null");
            return (Criteria) this;
        }

        public Criteria andSiginTimeEqualTo(Date value) {
            addCriterion("sigin_time =", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeNotEqualTo(Date value) {
            addCriterion("sigin_time <>", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeGreaterThan(Date value) {
            addCriterion("sigin_time >", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sigin_time >=", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeLessThan(Date value) {
            addCriterion("sigin_time <", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeLessThanOrEqualTo(Date value) {
            addCriterion("sigin_time <=", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeLike(Date value) {
            addCriterion("sigin_time like", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeNotLike(Date value) {
            addCriterion("sigin_time not like", value, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeIn(List<Date> values) {
            addCriterion("sigin_time in", values, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeNotIn(List<Date> values) {
            addCriterion("sigin_time not in", values, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeBetween(Date value1, Date value2) {
            addCriterion("sigin_time between", value1, value2, "siginTime");
            return (Criteria) this;
        }

        public Criteria andSiginTimeNotBetween(Date value1, Date value2) {
            addCriterion("sigin_time not between", value1, value2, "siginTime");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(int value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(int value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(int value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(int value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(int value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(int value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(int value1, int value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(int value1, int value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andConfidenceIsNull() {
            addCriterion("confidence is null");
            return (Criteria) this;
        }

        public Criteria andConfidenceIsNotNull() {
            addCriterion("confidence is not null");
            return (Criteria) this;
        }

        public Criteria andConfidenceEqualTo(Double value) {
            addCriterion("confidence =", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotEqualTo(Double value) {
            addCriterion("confidence <>", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThan(Double value) {
            addCriterion("confidence >", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThanOrEqualTo(Double value) {
            addCriterion("confidence >=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThan(Double value) {
            addCriterion("confidence <", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThanOrEqualTo(Double value) {
            addCriterion("confidence <=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceIn(List<Double> values) {
            addCriterion("confidence in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotIn(List<Double> values) {
            addCriterion("confidence not in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceBetween(Double value1, Double value2) {
            addCriterion("confidence between", value1, value2, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotBetween(Double value1, Double value2) {
            addCriterion("confidence not between", value1, value2, "confidence");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table statistic
     *
     * @mbggenerated do_not_delete_during_merge Sat May 07 19:22:23 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
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