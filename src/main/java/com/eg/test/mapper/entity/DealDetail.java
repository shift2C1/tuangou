package com.eg.test.mapper.entity;

public class DealDetail {
    private Long id;

    private Long dealId;

    private String dealDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDealId() {
        return dealId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public String getDealDetail() {
        return dealDetail;
    }

    public void setDealDetail(String dealDetail) {
        this.dealDetail = dealDetail == null ? null : dealDetail.trim();
    }
}