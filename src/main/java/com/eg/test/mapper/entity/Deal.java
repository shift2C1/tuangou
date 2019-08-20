package com.eg.test.mapper.entity;

import java.util.Date;

public class Deal {
    private Long id;

    private Long areaId;

    private String areaName;

    private Long skuId;

    private Integer dealClass;

    private Long merchantId;

    private Long merchantSku;

    private String dealTitle;

    private Long dealPrice;

    private Long merchantPrice;

    private Long marketPrice;

    private Long settlementPrice;

    private Long settlementPriceMax;

    private Integer discount;

    private Integer bonusPoints;

    private Integer dealType;

    private Long imageId;

    private Integer dealLevel;

    private Integer maxPurchaseCount;

    private Integer publishStatus;

    private Integer inventoryAmount;

    private Integer vendibilityAmount;

    private Integer oosStatus;

    private Date startTime;

    private Date endTime;

    private Date publishTime;

    private String merchantCode;

    private Date createTime;

    private Date updateTime;

    private Long categoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getDealClass() {
        return dealClass;
    }

    public void setDealClass(Integer dealClass) {
        this.dealClass = dealClass;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getMerchantSku() {
        return merchantSku;
    }

    public void setMerchantSku(Long merchantSku) {
        this.merchantSku = merchantSku;
    }

    public String getDealTitle() {
        return dealTitle;
    }

    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle == null ? null : dealTitle.trim();
    }

    public Long getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Long dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Long getMerchantPrice() {
        return merchantPrice;
    }

    public void setMerchantPrice(Long merchantPrice) {
        this.merchantPrice = merchantPrice;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Long settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public Long getSettlementPriceMax() {
        return settlementPriceMax;
    }

    public void setSettlementPriceMax(Long settlementPriceMax) {
        this.settlementPriceMax = settlementPriceMax;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(Integer bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public Integer getDealType() {
        return dealType;
    }

    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Integer getDealLevel() {
        return dealLevel;
    }

    public void setDealLevel(Integer dealLevel) {
        this.dealLevel = dealLevel;
    }

    public Integer getMaxPurchaseCount() {
        return maxPurchaseCount;
    }

    public void setMaxPurchaseCount(Integer maxPurchaseCount) {
        this.maxPurchaseCount = maxPurchaseCount;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(Integer inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public Integer getVendibilityAmount() {
        return vendibilityAmount;
    }

    public void setVendibilityAmount(Integer vendibilityAmount) {
        this.vendibilityAmount = vendibilityAmount;
    }

    public Integer getOosStatus() {
        return oosStatus;
    }

    public void setOosStatus(Integer oosStatus) {
        this.oosStatus = oosStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}