package com.eg.test.mapper.entity;

import java.util.Date;

public class AdminRoleFunction {
    private Long id;

    private Integer adminRoleId;

    private Integer adminFuncId;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public Integer getAdminFuncId() {
        return adminFuncId;
    }

    public void setAdminFuncId(Integer adminFuncId) {
        this.adminFuncId = adminFuncId;
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
}