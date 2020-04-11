package com.guoyw.mybatis.generator.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Good implements Serializable {
    private String id;

    private Long createdAt;

    private Long updatedAt;

    private Float entryPrice;

    private String goodCategory;

    private String goodName;

    private Long goodNum;

    private String goodUnit;

    private Float salePrice;

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

    public Float getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(Float entryPrice) {
        this.entryPrice = entryPrice;
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

    public Long getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Long goodNum) {
        this.goodNum = goodNum;
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
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
        sb.append(", entryPrice=").append(entryPrice);
        sb.append(", goodCategory=").append(goodCategory);
        sb.append(", goodName=").append(goodName);
        sb.append(", goodNum=").append(goodNum);
        sb.append(", goodUnit=").append(goodUnit);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}