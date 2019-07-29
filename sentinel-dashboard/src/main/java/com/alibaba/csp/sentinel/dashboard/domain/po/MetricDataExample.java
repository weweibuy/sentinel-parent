package com.alibaba.csp.sentinel.dashboard.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MetricDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetricDataExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("resource_id like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("resource_id not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andPassQpsIsNull() {
            addCriterion("pass_qps is null");
            return (Criteria) this;
        }

        public Criteria andPassQpsIsNotNull() {
            addCriterion("pass_qps is not null");
            return (Criteria) this;
        }

        public Criteria andPassQpsEqualTo(Long value) {
            addCriterion("pass_qps =", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsNotEqualTo(Long value) {
            addCriterion("pass_qps <>", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsGreaterThan(Long value) {
            addCriterion("pass_qps >", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsGreaterThanOrEqualTo(Long value) {
            addCriterion("pass_qps >=", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsLessThan(Long value) {
            addCriterion("pass_qps <", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsLessThanOrEqualTo(Long value) {
            addCriterion("pass_qps <=", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsIn(List<Long> values) {
            addCriterion("pass_qps in", values, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsNotIn(List<Long> values) {
            addCriterion("pass_qps not in", values, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsBetween(Long value1, Long value2) {
            addCriterion("pass_qps between", value1, value2, "passQps");
            return (Criteria) this;
        }

        public Criteria andPassQpsNotBetween(Long value1, Long value2) {
            addCriterion("pass_qps not between", value1, value2, "passQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsIsNull() {
            addCriterion("success_qps is null");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsIsNotNull() {
            addCriterion("success_qps is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsEqualTo(Long value) {
            addCriterion("success_qps =", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsNotEqualTo(Long value) {
            addCriterion("success_qps <>", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsGreaterThan(Long value) {
            addCriterion("success_qps >", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsGreaterThanOrEqualTo(Long value) {
            addCriterion("success_qps >=", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsLessThan(Long value) {
            addCriterion("success_qps <", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsLessThanOrEqualTo(Long value) {
            addCriterion("success_qps <=", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsIn(List<Long> values) {
            addCriterion("success_qps in", values, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsNotIn(List<Long> values) {
            addCriterion("success_qps not in", values, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsBetween(Long value1, Long value2) {
            addCriterion("success_qps between", value1, value2, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsNotBetween(Long value1, Long value2) {
            addCriterion("success_qps not between", value1, value2, "successQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsIsNull() {
            addCriterion("block_qps is null");
            return (Criteria) this;
        }

        public Criteria andBlockQpsIsNotNull() {
            addCriterion("block_qps is not null");
            return (Criteria) this;
        }

        public Criteria andBlockQpsEqualTo(Long value) {
            addCriterion("block_qps =", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsNotEqualTo(Long value) {
            addCriterion("block_qps <>", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsGreaterThan(Long value) {
            addCriterion("block_qps >", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsGreaterThanOrEqualTo(Long value) {
            addCriterion("block_qps >=", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsLessThan(Long value) {
            addCriterion("block_qps <", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsLessThanOrEqualTo(Long value) {
            addCriterion("block_qps <=", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsIn(List<Long> values) {
            addCriterion("block_qps in", values, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsNotIn(List<Long> values) {
            addCriterion("block_qps not in", values, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsBetween(Long value1, Long value2) {
            addCriterion("block_qps between", value1, value2, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsNotBetween(Long value1, Long value2) {
            addCriterion("block_qps not between", value1, value2, "blockQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsIsNull() {
            addCriterion("exception_qps is null");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsIsNotNull() {
            addCriterion("exception_qps is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsEqualTo(Long value) {
            addCriterion("exception_qps =", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsNotEqualTo(Long value) {
            addCriterion("exception_qps <>", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsGreaterThan(Long value) {
            addCriterion("exception_qps >", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsGreaterThanOrEqualTo(Long value) {
            addCriterion("exception_qps >=", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsLessThan(Long value) {
            addCriterion("exception_qps <", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsLessThanOrEqualTo(Long value) {
            addCriterion("exception_qps <=", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsIn(List<Long> values) {
            addCriterion("exception_qps in", values, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsNotIn(List<Long> values) {
            addCriterion("exception_qps not in", values, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsBetween(Long value1, Long value2) {
            addCriterion("exception_qps between", value1, value2, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsNotBetween(Long value1, Long value2) {
            addCriterion("exception_qps not between", value1, value2, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNull() {
            addCriterion("response_time is null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNotNull() {
            addCriterion("response_time is not null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeEqualTo(Double value) {
            addCriterion("response_time =", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotEqualTo(Double value) {
            addCriterion("response_time <>", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThan(Double value) {
            addCriterion("response_time >", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("response_time >=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThan(Double value) {
            addCriterion("response_time <", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThanOrEqualTo(Double value) {
            addCriterion("response_time <=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIn(List<Double> values) {
            addCriterion("response_time in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotIn(List<Double> values) {
            addCriterion("response_time not in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeBetween(Double value1, Double value2) {
            addCriterion("response_time between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotBetween(Double value1, Double value2) {
            addCriterion("response_time not between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeIsNull() {
            addCriterion("get_metric_time is null");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeIsNotNull() {
            addCriterion("get_metric_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeEqualTo(Date value) {
            addCriterion("get_metric_time =", value, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeNotEqualTo(Date value) {
            addCriterion("get_metric_time <>", value, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeGreaterThan(Date value) {
            addCriterion("get_metric_time >", value, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("get_metric_time >=", value, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeLessThan(Date value) {
            addCriterion("get_metric_time <", value, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeLessThanOrEqualTo(Date value) {
            addCriterion("get_metric_time <=", value, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeIn(List<Date> values) {
            addCriterion("get_metric_time in", values, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeNotIn(List<Date> values) {
            addCriterion("get_metric_time not in", values, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeBetween(Date value1, Date value2) {
            addCriterion("get_metric_time between", value1, value2, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andGetMetricTimeNotBetween(Date value1, Date value2) {
            addCriterion("get_metric_time not between", value1, value2, "getMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeIsNull() {
            addCriterion("client_metric_time is null");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeIsNotNull() {
            addCriterion("client_metric_time is not null");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeEqualTo(Date value) {
            addCriterion("client_metric_time =", value, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeNotEqualTo(Date value) {
            addCriterion("client_metric_time <>", value, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeGreaterThan(Date value) {
            addCriterion("client_metric_time >", value, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("client_metric_time >=", value, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeLessThan(Date value) {
            addCriterion("client_metric_time <", value, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeLessThanOrEqualTo(Date value) {
            addCriterion("client_metric_time <=", value, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeIn(List<Date> values) {
            addCriterion("client_metric_time in", values, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeNotIn(List<Date> values) {
            addCriterion("client_metric_time not in", values, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeBetween(Date value1, Date value2) {
            addCriterion("client_metric_time between", value1, value2, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andClientMetricTimeNotBetween(Date value1, Date value2) {
            addCriterion("client_metric_time not between", value1, value2, "clientMetricTime");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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