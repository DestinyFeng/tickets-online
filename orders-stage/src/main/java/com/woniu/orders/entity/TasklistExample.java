package com.woniu.orders.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TasklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TasklistExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskdescIsNull() {
            addCriterion("taskdesc is null");
            return (Criteria) this;
        }

        public Criteria andTaskdescIsNotNull() {
            addCriterion("taskdesc is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdescEqualTo(String value) {
            addCriterion("taskdesc =", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescNotEqualTo(String value) {
            addCriterion("taskdesc <>", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescGreaterThan(String value) {
            addCriterion("taskdesc >", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescGreaterThanOrEqualTo(String value) {
            addCriterion("taskdesc >=", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescLessThan(String value) {
            addCriterion("taskdesc <", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescLessThanOrEqualTo(String value) {
            addCriterion("taskdesc <=", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescLike(String value) {
            addCriterion("taskdesc like", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescNotLike(String value) {
            addCriterion("taskdesc not like", value, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescIn(List<String> values) {
            addCriterion("taskdesc in", values, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescNotIn(List<String> values) {
            addCriterion("taskdesc not in", values, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescBetween(String value1, String value2) {
            addCriterion("taskdesc between", value1, value2, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskdescNotBetween(String value1, String value2) {
            addCriterion("taskdesc not between", value1, value2, "taskdesc");
            return (Criteria) this;
        }

        public Criteria andTaskmessageIsNull() {
            addCriterion("taskmessage is null");
            return (Criteria) this;
        }

        public Criteria andTaskmessageIsNotNull() {
            addCriterion("taskmessage is not null");
            return (Criteria) this;
        }

        public Criteria andTaskmessageEqualTo(String value) {
            addCriterion("taskmessage =", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageNotEqualTo(String value) {
            addCriterion("taskmessage <>", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageGreaterThan(String value) {
            addCriterion("taskmessage >", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageGreaterThanOrEqualTo(String value) {
            addCriterion("taskmessage >=", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageLessThan(String value) {
            addCriterion("taskmessage <", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageLessThanOrEqualTo(String value) {
            addCriterion("taskmessage <=", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageLike(String value) {
            addCriterion("taskmessage like", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageNotLike(String value) {
            addCriterion("taskmessage not like", value, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageIn(List<String> values) {
            addCriterion("taskmessage in", values, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageNotIn(List<String> values) {
            addCriterion("taskmessage not in", values, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageBetween(String value1, String value2) {
            addCriterion("taskmessage between", value1, value2, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskmessageNotBetween(String value1, String value2) {
            addCriterion("taskmessage not between", value1, value2, "taskmessage");
            return (Criteria) this;
        }

        public Criteria andTaskdataidIsNull() {
            addCriterion("taskdataid is null");
            return (Criteria) this;
        }

        public Criteria andTaskdataidIsNotNull() {
            addCriterion("taskdataid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdataidEqualTo(Integer value) {
            addCriterion("taskdataid =", value, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidNotEqualTo(Integer value) {
            addCriterion("taskdataid <>", value, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidGreaterThan(Integer value) {
            addCriterion("taskdataid >", value, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskdataid >=", value, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidLessThan(Integer value) {
            addCriterion("taskdataid <", value, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidLessThanOrEqualTo(Integer value) {
            addCriterion("taskdataid <=", value, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidIn(List<Integer> values) {
            addCriterion("taskdataid in", values, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidNotIn(List<Integer> values) {
            addCriterion("taskdataid not in", values, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidBetween(Integer value1, Integer value2) {
            addCriterion("taskdataid between", value1, value2, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTaskdataidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskdataid not between", value1, value2, "taskdataid");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNull() {
            addCriterion("tasktime is null");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNotNull() {
            addCriterion("tasktime is not null");
            return (Criteria) this;
        }

        public Criteria andTasktimeEqualTo(Date value) {
            addCriterion("tasktime =", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotEqualTo(Date value) {
            addCriterion("tasktime <>", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThan(Date value) {
            addCriterion("tasktime >", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tasktime >=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThan(Date value) {
            addCriterion("tasktime <", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThanOrEqualTo(Date value) {
            addCriterion("tasktime <=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeIn(List<Date> values) {
            addCriterion("tasktime in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotIn(List<Date> values) {
            addCriterion("tasktime not in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeBetween(Date value1, Date value2) {
            addCriterion("tasktime between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotBetween(Date value1, Date value2) {
            addCriterion("tasktime not between", value1, value2, "tasktime");
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