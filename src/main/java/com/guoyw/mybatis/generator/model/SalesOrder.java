package com.guoyw.mybatis.generator.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SalesOrder implements Serializable {
    private String id;

    private Long createdAt;

    private Long updatedAt;

    private Float actualPay;

    private String customerPurchasesId;

    private Long customerPurchasesIdName;

    private Float debtSum;

    private String notes;

    private String operatorId;

    private String operatorIdName;

    private Long saleDate;

    private Float saleDiscount;

    private Float saleDiscountSum;

    private String saleNum;

    private Float saleTotalSum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Float getActualPay() {
        return actualPay;
    }

    public void setActualPay(Float actualPay) {
        this.actualPay = actualPay;
    }

    public String getCustomerPurchasesId() {
        return customerPurchasesId;
    }

    public void setCustomerPurchasesId(String customerPurchasesId) {
        this.customerPurchasesId = customerPurchasesId;
    }

    public Long getCustomerPurchasesIdName() {
        return customerPurchasesIdName;
    }

    public void setCustomerPurchasesIdName(Long customerPurchasesIdName) {
        this.customerPurchasesIdName = customerPurchasesIdName;
    }

    public Float getDebtSum() {
        return debtSum;
    }

    public void setDebtSum(Float debtSum) {
        this.debtSum = debtSum;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorIdName() {
        return operatorIdName;
    }

    public void setOperatorIdName(String operatorIdName) {
        this.operatorIdName = operatorIdName;
    }

    public Long getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Long saleDate) {
        this.saleDate = saleDate;
    }

    public Float getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(Float saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public Float getSaleDiscountSum() {
        return saleDiscountSum;
    }

    public void setSaleDiscountSum(Float saleDiscountSum) {
        this.saleDiscountSum = saleDiscountSum;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }

    public Float getSaleTotalSum() {
        return saleTotalSum;
    }

    public void setSaleTotalSum(Float saleTotalSum) {
        this.saleTotalSum = saleTotalSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", actualPay=").append(actualPay);
        sb.append(", customerPurchasesId=").append(customerPurchasesId);
        sb.append(", customerPurchasesIdName=").append(customerPurchasesIdName);
        sb.append(", debtSum=").append(debtSum);
        sb.append(", notes=").append(notes);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operatorIdName=").append(operatorIdName);
        sb.append(", saleDate=").append(saleDate);
        sb.append(", saleDiscount=").append(saleDiscount);
        sb.append(", saleDiscountSum=").append(saleDiscountSum);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", saleTotalSum=").append(saleTotalSum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}