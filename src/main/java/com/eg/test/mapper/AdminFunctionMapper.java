package com.eg.test.mapper;

import com.eg.test.mapper.entity.AdminFunction;
import com.eg.test.mapper.entity.AdminFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminFunctionMapper {
    long countByExample(AdminFunctionExample example);

    int deleteByExample(AdminFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminFunction record);

    int insertSelective(AdminFunction record);

    List<AdminFunction> selectByExample(AdminFunctionExample example);

    AdminFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminFunction record, @Param("example") AdminFunctionExample example);

    int updateByExample(@Param("record") AdminFunction record, @Param("example") AdminFunctionExample example);

    int updateByPrimaryKeySelective(AdminFunction record);

    int updateByPrimaryKey(AdminFunction record);
}