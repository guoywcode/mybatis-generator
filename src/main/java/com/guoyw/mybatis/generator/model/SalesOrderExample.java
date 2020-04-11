package com.guoyw.mybatis.generator.model;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesOrderExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Long value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Long value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Long value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Long value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Long value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Long> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Long> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Long value1, Long value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Long value1, Long value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Long value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Long value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Long value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Long value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Long value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Long> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Long> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Long value1, Long value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Long value1, Long value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNull() {
            addCriterion("actual_pay is null");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNotNull() {
            addCriterion("actual_pay is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayEqualTo(Float value) {
            addCriterion("actual_pay =", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotEqualTo(Float value) {
            addCriterion("actual_pay <>", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThan(Float value) {
            addCriterion("actual_pay >", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThanOrEqualTo(Float value) {
            addCriterion("actual_pay >=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThan(Float value) {
            addCriterion("actual_pay <", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThanOrEqualTo(Float value) {
            addCriterion("actual_pay <=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIn(List<Float> values) {
            addCriterion("actual_pay in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotIn(List<Float> values) {
            addCriterion("actual_pay not in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayBetween(Float value1, Float value2) {
            addCriterion("actual_pay between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotBetween(Float value1, Float value2) {
            addCriterion("actual_pay not between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdIsNull() {
            addCriterion("customer_purchases_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdIsNotNull() {
            addCriterion("customer_purchases_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdEqualTo(String value) {
            addCriterion("customer_purchases_id =", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNotEqualTo(String value) {
            addCriterion("customer_purchases_id <>", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdGreaterThan(String value) {
            addCriterion("customer_purchases_id >", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_purchases_id >=", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdLessThan(String value) {
            addCriterion("customer_purchases_id <", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdLessThanOrEqualTo(String value) {
            addCriterion("customer_purchases_id <=", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdLike(String value) {
            addCriterion("customer_purchases_id like", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNotLike(String value) {
            addCriterion("customer_purchases_id not like", value, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdIn(List<String> values) {
            addCriterion("customer_purchases_id in", values, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNotIn(List<String> values) {
            addCriterion("customer_purchases_id not in", values, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdBetween(String value1, String value2) {
            addCriterion("customer_purchases_id between", value1, value2, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNotBetween(String value1, String value2) {
            addCriterion("customer_purchases_id not between", value1, value2, "customerPurchasesId");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameIsNull() {
            addCriterion("customer_purchases_id_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameIsNotNull() {
            addCriterion("customer_purchases_id_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameEqualTo(Long value) {
            addCriterion("customer_purchases_id_name =", value, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameNotEqualTo(Long value) {
            addCriterion("customer_purchases_id_name <>", value, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameGreaterThan(Long value) {
            addCriterion("customer_purchases_id_name >", value, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_purchases_id_name >=", value, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameLessThan(Long value) {
            addCriterion("customer_purchases_id_name <", value, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameLessThanOrEqualTo(Long value) {
            addCriterion("customer_purchases_id_name <=", value, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameIn(List<Long> values) {
            addCriterion("customer_purchases_id_name in", values, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameNotIn(List<Long> values) {
            addCriterion("customer_purchases_id_name not in", values, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameBetween(Long value1, Long value2) {
            addCriterion("customer_purchases_id_name between", value1, value2, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andCustomerPurchasesIdNameNotBetween(Long value1, Long value2) {
            addCriterion("customer_purchases_id_name not between", value1, value2, "customerPurchasesIdName");
            return (Criteria) this;
        }

        public Criteria andDebtSumIsNull() {
            addCriterion("debt_sum is null");
            return (Criteria) this;
        }

        public Criteria andDebtSumIsNotNull() {
            addCriterion("debt_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDebtSumEqualTo(Float value) {
            addCriterion("debt_sum =", value, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumNotEqualTo(Float value) {
            addCriterion("debt_sum <>", value, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumGreaterThan(Float value) {
            addCriterion("debt_sum >", value, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumGreaterThanOrEqualTo(Float value) {
            addCriterion("debt_sum >=", value, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumLessThan(Float value) {
            addCriterion("debt_sum <", value, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumLessThanOrEqualTo(Float value) {
            addCriterion("debt_sum <=", value, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumIn(List<Float> values) {
            addCriterion("debt_sum in", values, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumNotIn(List<Float> values) {
            addCriterion("debt_sum not in", values, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumBetween(Float value1, Float value2) {
            addCriterion("debt_sum between", value1, value2, "debtSum");
            return (Criteria) this;
        }

        public Criteria andDebtSumNotBetween(Float value1, Float value2) {
            addCriterion("debt_sum not between", value1, value2, "debtSum");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameIsNull() {
            addCriterion("operator_id_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameIsNotNull() {
            addCriterion("operator_id_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameEqualTo(String value) {
            addCriterion("operator_id_name =", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameNotEqualTo(String value) {
            addCriterion("operator_id_name <>", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameGreaterThan(String value) {
            addCriterion("operator_id_name >", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id_name >=", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameLessThan(String value) {
            addCriterion("operator_id_name <", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameLessThanOrEqualTo(String value) {
            addCriterion("operator_id_name <=", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameLike(String value) {
            addCriterion("operator_id_name like", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameNotLike(String value) {
            addCriterion("operator_id_name not like", value, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameIn(List<String> values) {
            addCriterion("operator_id_name in", values, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameNotIn(List<String> values) {
            addCriterion("operator_id_name not in", values, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameBetween(String value1, String value2) {
            addCriterion("operator_id_name between", value1, value2, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNameNotBetween(String value1, String value2) {
            addCriterion("operator_id_name not between", value1, value2, "operatorIdName");
            return (Criteria) this;
        }

        public Criteria andSaleDateIsNull() {
            addCriterion("sale_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleDateIsNotNull() {
            addCriterion("sale_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDateEqualTo(Long value) {
            addCriterion("sale_date =", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotEqualTo(Long value) {
            addCriterion("sale_date <>", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateGreaterThan(Long value) {
            addCriterion("sale_date >", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_date >=", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateLessThan(Long value) {
            addCriterion("sale_date <", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateLessThanOrEqualTo(Long value) {
            addCriterion("sale_date <=", value, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateIn(List<Long> values) {
            addCriterion("sale_date in", values, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotIn(List<Long> values) {
            addCriterion("sale_date not in", values, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateBetween(Long value1, Long value2) {
            addCriterion("sale_date between", value1, value2, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDateNotBetween(Long value1, Long value2) {
            addCriterion("sale_date not between", value1, value2, "saleDate");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountIsNull() {
            addCriterion("sale_discount is null");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountIsNotNull() {
            addCriterion("sale_discount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountEqualTo(Float value) {
            addCriterion("sale_discount =", value, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountNotEqualTo(Float value) {
            addCriterion("sale_discount <>", value, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountGreaterThan(Float value) {
            addCriterion("sale_discount >", value, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("sale_discount >=", value, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountLessThan(Float value) {
            addCriterion("sale_discount <", value, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountLessThanOrEqualTo(Float value) {
            addCriterion("sale_discount <=", value, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountIn(List<Float> values) {
            addCriterion("sale_discount in", values, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountNotIn(List<Float> values) {
            addCriterion("sale_discount not in", values, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountBetween(Float value1, Float value2) {
            addCriterion("sale_discount between", value1, value2, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountNotBetween(Float value1, Float value2) {
            addCriterion("sale_discount not between", value1, value2, "saleDiscount");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumIsNull() {
            addCriterion("sale_discount_sum is null");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumIsNotNull() {
            addCriterion("sale_discount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumEqualTo(Float value) {
            addCriterion("sale_discount_sum =", value, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumNotEqualTo(Float value) {
            addCriterion("sale_discount_sum <>", value, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumGreaterThan(Float value) {
            addCriterion("sale_discount_sum >", value, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumGreaterThanOrEqualTo(Float value) {
            addCriterion("sale_discount_sum >=", value, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumLessThan(Float value) {
            addCriterion("sale_discount_sum <", value, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumLessThanOrEqualTo(Float value) {
            addCriterion("sale_discount_sum <=", value, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumIn(List<Float> values) {
            addCriterion("sale_discount_sum in", values, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumNotIn(List<Float> values) {
            addCriterion("sale_discount_sum not in", values, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumBetween(Float value1, Float value2) {
            addCriterion("sale_discount_sum between", value1, value2, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleDiscountSumNotBetween(Float value1, Float value2) {
            addCriterion("sale_discount_sum not between", value1, value2, "saleDiscountSum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(String value) {
            addCriterion("sale_num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(String value) {
            addCriterion("sale_num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(String value) {
            addCriterion("sale_num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(String value) {
            addCriterion("sale_num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(String value) {
            addCriterion("sale_num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(String value) {
            addCriterion("sale_num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLike(String value) {
            addCriterion("sale_num like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotLike(String value) {
            addCriterion("sale_num not like", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<String> values) {
            addCriterion("sale_num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<String> values) {
            addCriterion("sale_num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(String value1, String value2) {
            addCriterion("sale_num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(String value1, String value2) {
            addCriterion("sale_num not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumIsNull() {
            addCriterion("sale_total_sum is null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumIsNotNull() {
            addCriterion("sale_total_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumEqualTo(Float value) {
            addCriterion("sale_total_sum =", value, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumNotEqualTo(Float value) {
            addCriterion("sale_total_sum <>", value, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumGreaterThan(Float value) {
            addCriterion("sale_total_sum >", value, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumGreaterThanOrEqualTo(Float value) {
            addCriterion("sale_total_sum >=", value, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumLessThan(Float value) {
            addCriterion("sale_total_sum <", value, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumLessThanOrEqualTo(Float value) {
            addCriterion("sale_total_sum <=", value, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumIn(List<Float> values) {
            addCriterion("sale_total_sum in", values, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumNotIn(List<Float> values) {
            addCriterion("sale_total_sum not in", values, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumBetween(Float value1, Float value2) {
            addCriterion("sale_total_sum between", value1, value2, "saleTotalSum");
            return (Criteria) this;
        }

        public Criteria andSaleTotalSumNotBetween(Float value1, Float value2) {
            addCriterion("sale_total_sum not between", value1, value2, "saleTotalSum");
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