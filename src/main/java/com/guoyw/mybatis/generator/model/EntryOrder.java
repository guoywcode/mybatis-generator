package com.guoyw.mybatis.generator.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class EntryOrder implements Serializable {
    private String id;

    private Long createdAt;

    private Long updatedAt;

    private Float actualPay;

    private Long entryDate;

    private String entryNum;

    private String notes;

    private Long operatorId;

    private String operatorIdName;

    private Long supplierId;

    private Long supplierIdName;

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

    public Long getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Long entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(String entryNum) {
        this.entryNum = entryNum;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorIdName() {
        return operatorIdName;
    }

    public void setOperatorIdName(String operatorIdName) {
        this.operatorIdName = operatorIdName;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSupplierIdName() {
        return supplierIdName;
    }

    public void setSupplierIdName(Long supplierIdName) {
        this.supplierIdName = supplierIdName;
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
        sb.append(", entryDate=").append(entryDate);
        sb.append(", entryNum=").append(entryNum);
        sb.append(", notes=").append(notes);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operatorIdName=").append(operatorIdName);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierIdName=").append(supplierIdName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}