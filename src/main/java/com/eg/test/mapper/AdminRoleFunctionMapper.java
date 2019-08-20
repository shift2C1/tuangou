package com.eg.test.mapper;

import com.eg.test.mapper.entity.AdminRoleFunction;
import com.eg.test.mapper.entity.AdminRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleFunctionMapper {
    long countByExample(AdminRoleFunctionExample example);

    int deleteByExample(AdminRoleFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRoleFunction record);

    int insertSelective(AdminRoleFunction record);

    List<AdminRoleFunction> selectByExample(AdminRoleFunctionExample example);

    AdminRoleFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminRoleFunction record, @Param("example") AdminRoleFunctionExample example);

    int updateByExample(@Param("record") AdminRoleFunction record, @Param("example") AdminRoleFunctionExample example);

    int updateByPrimaryKeySelective(AdminRoleFunction record);

    int updateByPrimaryKey(AdminRoleFunction record);
}