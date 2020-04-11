package com.guoyw.mybatis.generator.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class EntryOrderToGood implements Serializable {
    private String entryOrderId;

    private String goodId;

    private Long createdAt;

    private Long updatedAt;

    private String entryPrice;

    private Long entryVolume;

    private String goodCategory;

    private String goodName;

    private String goodUnit;

    private String supplierId;

    private static final long serialVersionUID = 1L;

    public String getEntryOrderId() {
        return entryOrderId;
    }

    public void setEntryOrderId(String entryOrderId) {
        this.entryOrderId = entryOrderId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
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

    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public Long getEntryVolume() {
        return entryVolume;
    }

    public void setEntryVolume(Long entryVolume) {
        this.entryVolume = entryVolume;
    }

    public String getGoodCategory() {
        return goodCategory;
    }

    public void setGoodCategory(String goodCategory) {
        this.goodCategory = goodCategory;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", entryOrderId=").append(entryOrderId);
        sb.append(", goodId=").append(goodId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", entryPrice=").append(entryPrice);
        sb.append(", entryVolume=").append(entryVolume);
        sb.append(", goodCategory=").append(goodCategory);
        sb.append(", goodName=").append(goodName);
        sb.append(", goodUnit=").append(goodUnit);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}