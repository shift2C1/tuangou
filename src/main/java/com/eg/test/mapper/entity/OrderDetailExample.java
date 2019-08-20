package com.eg.test.mapper.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andMerchantSkuEqualTo(Integer value) {
            addCriterion("merchant_sku =", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuNotEqualTo(Integer value) {
            addCriterion("merchant_sku <>", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuGreaterThan(Integer value) {
            addCriterion("merchant_sku >", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_sku >=", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuLessThan(Integer value) {
            addCriterion("merchant_sku <", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_sku <=", value, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuIn(List<Integer> values) {
            addCriterion("merchant_sku in", values, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuNotIn(List<Integer> values) {
            addCriterion("merchant_sku not in", values, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuBetween(Integer value1, Integer value2) {
            addCriterion("merchant_sku between", value1, value2, "merchantSku");
            return (Criteria) this;
        }

        public Criteria andMerchantSkuNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_sku not between", value1, value2, "merchantSku");
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

        public Criteria andDealIdIsNull() {
            addCriterion("deal_id is null");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNotNull() {
            addCriterion("deal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealIdEqualTo(Long value) {
            addCriterion("deal_id =", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotEqualTo(Long value) {
            addCriterion("deal_id <>", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThan(Long value) {
            addCriterion("deal_id >", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deal_id >=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThan(Long value) {
            addCriterion("deal_id <", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThanOrEqualTo(Long value) {
            addCriterion("deal_id <=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdIn(List<Long> values) {
            addCriterion("deal_id in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotIn(List<Long> values) {
            addCriterion("deal_id not in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdBetween(Long value1, Long value2) {
            addCriterion("deal_id between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotBetween(Long value1, Long value2) {
            addCriterion("deal_id not between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdIsNull() {
            addCriterion("deal_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdIsNotNull() {
            addCriterion("deal_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdEqualTo(Long value) {
            addCriterion("deal_sku_id =", value, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdNotEqualTo(Long value) {
            addCriterion("deal_sku_id <>", value, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdGreaterThan(Long value) {
            addCriterion("deal_sku_id >", value, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deal_sku_id >=", value, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdLessThan(Long value) {
            addCriterion("deal_sku_id <", value, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("deal_sku_id <=", value, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdIn(List<Long> values) {
            addCriterion("deal_sku_id in", values, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdNotIn(List<Long> values) {
            addCriterion("deal_sku_id not in", values, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdBetween(Long value1, Long value2) {
            addCriterion("deal_sku_id between", value1, value2, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("deal_sku_id not between", value1, value2, "dealSkuId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdIsNull() {
            addCriterion("deal_img_id is null");
            return (Criteria) this;
        }

        public Criteria andDealImgIdIsNotNull() {
            addCriterion("deal_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealImgIdEqualTo(Long value) {
            addCriterion("deal_img_id =", value, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdNotEqualTo(Long value) {
            addCriterion("deal_img_id <>", value, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdGreaterThan(Long value) {
            addCriterion("deal_img_id >", value, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deal_img_id >=", value, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdLessThan(Long value) {
            addCriterion("deal_img_id <", value, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdLessThanOrEqualTo(Long value) {
            addCriterion("deal_img_id <=", value, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdIn(List<Long> values) {
            addCriterion("deal_img_id in", values, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdNotIn(List<Long> values) {
            addCriterion("deal_img_id not in", values, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdBetween(Long value1, Long value2) {
            addCriterion("deal_img_id between", value1, value2, "dealImgId");
            return (Criteria) this;
        }

        public Criteria andDealImgIdNotBetween(Long value1, Long value2) {
            addCriterion("deal_img_id not between", value1, value2, "dealImgId");
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

        public Criteria andDealCountIsNull() {
            addCriterion("deal_count is null");
            return (Criteria) this;
        }

        public Criteria andDealCountIsNotNull() {
            addCriterion("deal_count is not null");
            return (Criteria) this;
        }

        public Criteria andDealCountEqualTo(Integer value) {
            addCriterion("deal_count =", value, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountNotEqualTo(Integer value) {
            addCriterion("deal_count <>", value, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountGreaterThan(Integer value) {
            addCriterion("deal_count >", value, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_count >=", value, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountLessThan(Integer value) {
            addCriterion("deal_count <", value, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountLessThanOrEqualTo(Integer value) {
            addCriterion("deal_count <=", value, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountIn(List<Integer> values) {
            addCriterion("deal_count in", values, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountNotIn(List<Integer> values) {
            addCriterion("deal_count not in", values, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountBetween(Integer value1, Integer value2) {
            addCriterion("deal_count between", value1, value2, "dealCount");
            return (Criteria) this;
        }

        public Criteria andDealCountNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_count not between", value1, value2, "dealCount");
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

        public Criteria andDealPriceEqualTo(Integer value) {
            addCriterion("deal_price =", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotEqualTo(Integer value) {
            addCriterion("deal_price <>", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThan(Integer value) {
            addCriterion("deal_price >", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_price >=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThan(Integer value) {
            addCriterion("deal_price <", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThanOrEqualTo(Integer value) {
            addCriterion("deal_price <=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceIn(List<Integer> values) {
            addCriterion("deal_price in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotIn(List<Integer> values) {
            addCriterion("deal_price not in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceBetween(Integer value1, Integer value2) {
            addCriterion("deal_price between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_price not between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Integer value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Integer value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Integer value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Integer value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Integer> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Integer> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
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

        public Criteria andSettlementPriceEqualTo(Integer value) {
            addCriterion("settlement_price =", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotEqualTo(Integer value) {
            addCriterion("settlement_price <>", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThan(Integer value) {
            addCriterion("settlement_price >", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_price >=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThan(Integer value) {
            addCriterion("settlement_price <", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_price <=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIn(List<Integer> values) {
            addCriterion("settlement_price in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotIn(List<Integer> values) {
            addCriterion("settlement_price not in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceBetween(Integer value1, Integer value2) {
            addCriterion("settlement_price between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_price not between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceIsNull() {
            addCriterion("total_settlement_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceIsNotNull() {
            addCriterion("total_settlement_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceEqualTo(Integer value) {
            addCriterion("total_settlement_price =", value, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceNotEqualTo(Integer value) {
            addCriterion("total_settlement_price <>", value, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceGreaterThan(Integer value) {
            addCriterion("total_settlement_price >", value, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_settlement_price >=", value, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceLessThan(Integer value) {
            addCriterion("total_settlement_price <", value, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceLessThanOrEqualTo(Integer value) {
            addCriterion("total_settlement_price <=", value, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceIn(List<Integer> values) {
            addCriterion("total_settlement_price in", values, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceNotIn(List<Integer> values) {
            addCriterion("total_settlement_price not in", values, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceBetween(Integer value1, Integer value2) {
            addCriterion("total_settlement_price between", value1, value2, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andTotalSettlementPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_settlement_price not between", value1, value2, "totalSettlementPrice");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNull() {
            addCriterion("detail_status is null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNotNull() {
            addCriterion("detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusEqualTo(Integer value) {
            addCriterion("detail_status =", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotEqualTo(Integer value) {
            addCriterion("detail_status <>", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThan(Integer value) {
            addCriterion("detail_status >", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_status >=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThan(Integer value) {
            addCriterion("detail_status <", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("detail_status <=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIn(List<Integer> values) {
            addCriterion("detail_status in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotIn(List<Integer> values) {
            addCriterion("detail_status not in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusBetween(Integer value1, Integer value2) {
            addCriterion("detail_status between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_status not between", value1, value2, "detailStatus");
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