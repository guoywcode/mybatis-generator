package com.guoyw.mybatis.generator.model;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderToGoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesOrderToGoodExample() {
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

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(String value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(String value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(String value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(String value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(String value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(String value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLike(String value) {
            addCriterion("good_id like", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotLike(String value) {
            addCriterion("good_id not like", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<String> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<String> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(String value1, String value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(String value1, String value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdIsNull() {
            addCriterion("sales_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdIsNotNull() {
            addCriterion("sales_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdEqualTo(String value) {
            addCriterion("sales_order_id =", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotEqualTo(String value) {
            addCriterion("sales_order_id <>", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdGreaterThan(String value) {
            addCriterion("sales_order_id >", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sales_order_id >=", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdLessThan(String value) {
            addCriterion("sales_order_id <", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sales_order_id <=", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdLike(String value) {
            addCriterion("sales_order_id like", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotLike(String value) {
            addCriterion("sales_order_id not like", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdIn(List<String> values) {
            addCriterion("sales_order_id in", values, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotIn(List<String> values) {
            addCriterion("sales_order_id not in", values, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdBetween(String value1, String value2) {
            addCriterion("sales_order_id between", value1, value2, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotBetween(String value1, String value2) {
            addCriterion("sales_order_id not between", value1, value2, "salesOrderId");
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

        public Criteria andGoodCategoryIsNull() {
            addCriterion("good_category is null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIsNotNull() {
            addCriterion("good_category is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryEqualTo(String value) {
            addCriterion("good_category =", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotEqualTo(String value) {
            addCriterion("good_category <>", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryGreaterThan(String value) {
            addCriterion("good_category >", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("good_category >=", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryLessThan(String value) {
            addCriterion("good_category <", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryLessThanOrEqualTo(String value) {
            addCriterion("good_category <=", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryLike(String value) {
            addCriterion("good_category like", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotLike(String value) {
            addCriterion("good_category not like", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIn(List<String> values) {
            addCriterion("good_category in", values, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotIn(List<String> values) {
            addCriterion("good_category not in", values, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryBetween(String value1, String value2) {
            addCriterion("good_category between", value1, value2, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotBetween(String value1, String value2) {
            addCriterion("good_category not between", value1, value2, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIsNull() {
            addCriterion("good_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIsNotNull() {
            addCriterion("good_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUnitEqualTo(String value) {
            addCriterion("good_unit =", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotEqualTo(String value) {
            addCriterion("good_unit <>", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitGreaterThan(String value) {
            addCriterion("good_unit >", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitGreaterThanOrEqualTo(String value) {
            addCriterion("good_unit >=", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLessThan(String value) {
            addCriterion("good_unit <", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLessThanOrEqualTo(String value) {
            addCriterion("good_unit <=", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitLike(String value) {
            addCriterion("good_unit like", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotLike(String value) {
            addCriterion("good_unit not like", value, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitIn(List<String> values) {
            addCriterion("good_unit in", values, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotIn(List<String> values) {
            addCriterion("good_unit not in", values, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitBetween(String value1, String value2) {
            addCriterion("good_unit between", value1, value2, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andGoodUnitNotBetween(String value1, String value2) {
            addCriterion("good_unit not between", value1, value2, "goodUnit");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(String value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(String value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(String value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(String value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(String value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(String value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLike(String value) {
            addCriterion("sale_price like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotLike(String value) {
            addCriterion("sale_price not like", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<String> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<String> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(String value1, String value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(String value1, String value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Long value) {
            addCriterion("sales_volume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Long value) {
            addCriterion("sales_volume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Long value) {
            addCriterion("sales_volume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_volume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Long value) {
            addCriterion("sales_volume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Long value) {
            addCriterion("sales_volume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Long> values) {
            addCriterion("sales_volume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Long> values) {
            addCriterion("sales_volume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Long value1, Long value2) {
            addCriterion("sales_volume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Long value1, Long value2) {
            addCriterion("sales_volume not between", value1, value2, "salesVolume");
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