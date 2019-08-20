package com.eg.test.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andDealClassIsNull() {
            addCriterion("deal_class is null");
            return (Criteria) this;
        }

        public Criteria andDealClassIsNotNull() {
            addCriterion("deal_class is not null");
            return (Criteria) this;
        }

        public Criteria andDealClassEqualTo(Integer value) {
            addCriterion("deal_class =", value, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassNotEqualTo(Integer value) {
            addCriterion("deal_class <>", value, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassGreaterThan(Integer value) {
            addCriterion("deal_class >", value, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_class >=", value, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassLessThan(Integer value) {
            addCriterion("deal_class <", value, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassLessThanOrEqualTo(Integer value) {
            addCriterion("deal_class <=", value, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassIn(List<Integer> values) {
            addCriterion("deal_class in", values, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassNotIn(List<Integer> values) {
            addCriterion("deal_class not in", values, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassBetween(Integer value1, Integer value2) {
            addCriterion("deal_class between", value1, value2, "dealClass");
            return (Criteria) this;
        }

        public Criteria andDealClassNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_class not between", value1, value2, "dealClass");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Long value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Long value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Long value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Long value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Long value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Long> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Long> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Long value1, Long value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Long value1, Long value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuIsNull() {
            addCriterion("merchant_sku is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuIsNotNull() {
            addCriterion("merchant_sku is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuEqualTo(Long value) {
            addCriterion("merchant_sku =", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuNotEqualTo(Long value) {
            addCriterion("merchant_sku <>", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuGreaterThan(Long value) {
            addCriterion("merchant_sku >", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_sku >=", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuLessThan(Long value) {
            addCriterion("merchant_sku <", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuLessThanOrEqualTo(Long value) {
            addCriterion("merchant_sku <=", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuIn(List<Long> values) {
            addCriterion("merchant_sku in", values, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuNotIn(List<Long> values) {
            addCriterion("merchant_sku not in", values, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuBetween(Long value1, Long value2) {
            addCriterion("merchant_sku between", value1, value2, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuNotBetween(Long value1, Long value2) {
            addCriterion("merchant_sku not between", value1, value2, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andDealTitleIsNull() {
            addCriterion("deal_title is null");
            return (Criteria) this;
        }

        public Criteria andDealTitleIsNotNull() {
            addCriterion("deal_title is not null");
            return (Criteria) this;
        }

        public Criteria andDealTitleEqualTo(String value) {
            addCriterion("deal_title =", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleNotEqualTo(String value) {
            addCriterion("deal_title <>", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleGreaterThan(String value) {
            addCriterion("deal_title >", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleGreaterThanOrEqualTo(String value) {
            addCriterion("deal_title >=", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleLessThan(String value) {
            addCriterion("deal_title <", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleLessThanOrEqualTo(String value) {
            addCriterion("deal_title <=", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleLike(String value) {
            addCriterion("deal_title like", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleNotLike(String value) {
            addCriterion("deal_title not like", value, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleIn(List<String> values) {
            addCriterion("deal_title in", values, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleNotIn(List<String> values) {
            addCriterion("deal_title not in", values, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleBetween(String value1, String value2) {
            addCriterion("deal_title between", value1, value2, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealTitleNotBetween(String value1, String value2) {
            addCriterion("deal_title not between", value1, value2, "dealTitle");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNull() {
            addCriterion("deal_price is null");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNotNull() {
            addCriterion("deal_price is not null");
            return (Criteria) this;
        }

        public Criteria andDealPriceEqualTo(Long value) {
            addCriterion("deal_price =", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotEqualTo(Long value) {
            addCriterion("deal_price <>", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThan(Long value) {
            addCriterion("deal_price >", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("deal_price >=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThan(Long value) {
            addCriterion("deal_price <", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThanOrEqualTo(Long value) {
            addCriterion("deal_price <=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceIn(List<Long> values) {
            addCriterion("deal_price in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotIn(List<Long> values) {
            addCriterion("deal_price not in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceBetween(Long value1, Long value2) {
            addCriterion("deal_price between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotBetween(Long value1, Long value2) {
            addCriterion("deal_price not between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceIsNull() {
            addCriterion("merchant_price is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceIsNotNull() {
            addCriterion("merchant_price is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceEqualTo(Long value) {
            addCriterion("merchant_price =", value, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceNotEqualTo(Long value) {
            addCriterion("merchant_price <>", value, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceGreaterThan(Long value) {
            addCriterion("merchant_price >", value, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_price >=", value, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceLessThan(Long value) {
            addCriterion("merchant_price <", value, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceLessThanOrEqualTo(Long value) {
            addCriterion("merchant_price <=", value, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceIn(List<Long> values) {
            addCriterion("merchant_price in", values, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceNotIn(List<Long> values) {
            addCriterion("merchant_price not in", values, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceBetween(Long value1, Long value2) {
            addCriterion("merchant_price between", value1, value2, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMerchantPriceNotBetween(Long value1, Long value2) {
            addCriterion("merchant_price not between", value1, value2, "merchantPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Long value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Long value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Long value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Long value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Long value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Long> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Long> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Long value1, Long value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Long value1, Long value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNull() {
            addCriterion("settlement_price is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNotNull() {
            addCriterion("settlement_price is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceEqualTo(Long value) {
            addCriterion("settlement_price =", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotEqualTo(Long value) {
            addCriterion("settlement_price <>", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThan(Long value) {
            addCriterion("settlement_price >", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("settlement_price >=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThan(Long value) {
            addCriterion("settlement_price <", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThanOrEqualTo(Long value) {
            addCriterion("settlement_price <=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIn(List<Long> values) {
            addCriterion("settlement_price in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotIn(List<Long> values) {
            addCriterion("settlement_price not in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceBetween(Long value1, Long value2) {
            addCriterion("settlement_price between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotBetween(Long value1, Long value2) {
            addCriterion("settlement_price not between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxIsNull() {
            addCriterion("settlement_price_max is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxIsNotNull() {
            addCriterion("settlement_price_max is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxEqualTo(Long value) {
            addCriterion("settlement_price_max =", value, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxNotEqualTo(Long value) {
            addCriterion("settlement_price_max <>", value, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxGreaterThan(Long value) {
            addCriterion("settlement_price_max >", value, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxGreaterThanOrEqualTo(Long value) {
            addCriterion("settlement_price_max >=", value, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxLessThan(Long value) {
            addCriterion("settlement_price_max <", value, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxLessThanOrEqualTo(Long value) {
            addCriterion("settlement_price_max <=", value, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxIn(List<Long> values) {
            addCriterion("settlement_price_max in", values, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxNotIn(List<Long> values) {
            addCriterion("settlement_price_max not in", values, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxBetween(Long value1, Long value2) {
            addCriterion("settlement_price_max between", value1, value2, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceMaxNotBetween(Long value1, Long value2) {
            addCriterion("settlement_price_max not between", value1, value2, "settlementPriceMax");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andBonusPointsIsNull() {
            addCriterion("bonus_points is null");
            return (Criteria) this;
        }

        public Criteria andBonusPointsIsNotNull() {
            addCriterion("bonus_points is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPointsEqualTo(Integer value) {
            addCriterion("bonus_points =", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotEqualTo(Integer value) {
            addCriterion("bonus_points <>", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsGreaterThan(Integer value) {
            addCriterion("bonus_points >", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_points >=", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsLessThan(Integer value) {
            addCriterion("bonus_points <", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_points <=", value, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsIn(List<Integer> values) {
            addCriterion("bonus_points in", values, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotIn(List<Integer> values) {
            addCriterion("bonus_points not in", values, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsBetween(Integer value1, Integer value2) {
            addCriterion("bonus_points between", value1, value2, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andBonusPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_points not between", value1, value2, "bonusPoints");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNull() {
            addCriterion("deal_type is null");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNotNull() {
            addCriterion("deal_type is not null");
            return (Criteria) this;
        }

        public Criteria andDealTypeEqualTo(Integer value) {
            addCriterion("deal_type =", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotEqualTo(Integer value) {
            addCriterion("deal_type <>", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThan(Integer value) {
            addCriterion("deal_type >", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_type >=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThan(Integer value) {
            addCriterion("deal_type <", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThanOrEqualTo(Integer value) {
            addCriterion("deal_type <=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeIn(List<Integer> values) {
            addCriterion("deal_type in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotIn(List<Integer> values) {
            addCriterion("deal_type not in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeBetween(Integer value1, Integer value2) {
            addCriterion("deal_type between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_type not between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Long value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Long value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Long value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Long value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Long value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Long> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Long> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Long value1, Long value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Long value1, Long value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andDealLevelIsNull() {
            addCriterion("deal_level is null");
            return (Criteria) this;
        }

        public Criteria andDealLevelIsNotNull() {
            addCriterion("deal_level is not null");
            return (Criteria) this;
        }

        public Criteria andDealLevelEqualTo(Integer value) {
            addCriterion("deal_level =", value, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelNotEqualTo(Integer value) {
            addCriterion("deal_level <>", value, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelGreaterThan(Integer value) {
            addCriterion("deal_level >", value, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_level >=", value, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelLessThan(Integer value) {
            addCriterion("deal_level <", value, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelLessThanOrEqualTo(Integer value) {
            addCriterion("deal_level <=", value, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelIn(List<Integer> values) {
            addCriterion("deal_level in", values, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelNotIn(List<Integer> values) {
            addCriterion("deal_level not in", values, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelBetween(Integer value1, Integer value2) {
            addCriterion("deal_level between", value1, value2, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andDealLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_level not between", value1, value2, "dealLevel");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountIsNull() {
            addCriterion("max_purchase_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountIsNotNull() {
            addCriterion("max_purchase_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountEqualTo(Integer value) {
            addCriterion("max_purchase_count =", value, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountNotEqualTo(Integer value) {
            addCriterion("max_purchase_count <>", value, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountGreaterThan(Integer value) {
            addCriterion("max_purchase_count >", value, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_purchase_count >=", value, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountLessThan(Integer value) {
            addCriterion("max_purchase_count <", value, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_purchase_count <=", value, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountIn(List<Integer> values) {
            addCriterion("max_purchase_count in", values, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountNotIn(List<Integer> values) {
            addCriterion("max_purchase_count not in", values, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountBetween(Integer value1, Integer value2) {
            addCriterion("max_purchase_count between", value1, value2, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andMaxPurchaseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_purchase_count not between", value1, value2, "maxPurchaseCount");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(Integer value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(Integer value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(Integer value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(Integer value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<Integer> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<Integer> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(Integer value1, Integer value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIsNull() {
            addCriterion("inventory_amount is null");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIsNotNull() {
            addCriterion("inventory_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountEqualTo(Integer value) {
            addCriterion("inventory_amount =", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotEqualTo(Integer value) {
            addCriterion("inventory_amount <>", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountGreaterThan(Integer value) {
            addCriterion("inventory_amount >", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_amount >=", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountLessThan(Integer value) {
            addCriterion("inventory_amount <", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_amount <=", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIn(List<Integer> values) {
            addCriterion("inventory_amount in", values, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotIn(List<Integer> values) {
            addCriterion("inventory_amount not in", values, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountBetween(Integer value1, Integer value2) {
            addCriterion("inventory_amount between", value1, value2, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_amount not between", value1, value2, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountIsNull() {
            addCriterion("vendibility_amount is null");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountIsNotNull() {
            addCriterion("vendibility_amount is not null");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountEqualTo(Integer value) {
            addCriterion("vendibility_amount =", value, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountNotEqualTo(Integer value) {
            addCriterion("vendibility_amount <>", value, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountGreaterThan(Integer value) {
            addCriterion("vendibility_amount >", value, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("vendibility_amount >=", value, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountLessThan(Integer value) {
            addCriterion("vendibility_amount <", value, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountLessThanOrEqualTo(Integer value) {
            addCriterion("vendibility_amount <=", value, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountIn(List<Integer> values) {
            addCriterion("vendibility_amount in", values, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountNotIn(List<Integer> values) {
            addCriterion("vendibility_amount not in", values, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountBetween(Integer value1, Integer value2) {
            addCriterion("vendibility_amount between", value1, value2, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andVendibilityAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("vendibility_amount not between", value1, value2, "vendibilityAmount");
            return (Criteria) this;
        }

        public Criteria andOosStatusIsNull() {
            addCriterion("oos_status is null");
            return (Criteria) this;
        }

        public Criteria andOosStatusIsNotNull() {
            addCriterion("oos_status is not null");
            return (Criteria) this;
        }

        public Criteria andOosStatusEqualTo(Integer value) {
            addCriterion("oos_status =", value, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusNotEqualTo(Integer value) {
            addCriterion("oos_status <>", value, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusGreaterThan(Integer value) {
            addCriterion("oos_status >", value, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oos_status >=", value, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusLessThan(Integer value) {
            addCriterion("oos_status <", value, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oos_status <=", value, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusIn(List<Integer> values) {
            addCriterion("oos_status in", values, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusNotIn(List<Integer> values) {
            addCriterion("oos_status not in", values, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusBetween(Integer value1, Integer value2) {
            addCriterion("oos_status between", value1, value2, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andOosStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oos_status not between", value1, value2, "oosStatus");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNull() {
            addCriterion("merchant_code is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNotNull() {
            addCriterion("merchant_code is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeEqualTo(String value) {
            addCriterion("merchant_code =", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotEqualTo(String value) {
            addCriterion("merchant_code <>", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThan(String value) {
            addCriterion("merchant_code >", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_code >=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThan(String value) {
            addCriterion("merchant_code <", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThanOrEqualTo(String value) {
            addCriterion("merchant_code <=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLike(String value) {
            addCriterion("merchant_code like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotLike(String value) {
            addCriterion("merchant_code not like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIn(List<String> values) {
            addCriterion("merchant_code in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotIn(List<String> values) {
            addCriterion("merchant_code not in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeBetween(String value1, String value2) {
            addCriterion("merchant_code between", value1, value2, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotBetween(String value1, String value2) {
            addCriterion("merchant_code not between", value1, value2, "merchantCode");
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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