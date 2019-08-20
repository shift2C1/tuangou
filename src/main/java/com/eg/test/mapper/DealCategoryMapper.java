package com.eg.test.mapper;

import com.eg.test.mapper.entity.DealCategory;
import com.eg.test.mapper.entity.DealCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealCategoryMapper {
    long countByExample(DealCategoryExample example);

    int deleteByExample(DealCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DealCategory record);

    int insertSelective(DealCategory record);

    List<DealCategory> selectByExample(DealCategoryExample example);

    DealCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DealCategory record, @Param("example") DealCategoryExample example);

    int updateByExample(@Param("record") DealCategory record, @Param("example") DealCategoryExample example);

    int updateByPrimaryKeySelective(DealCategory record);

    int updateByPrimaryKey(DealCategory record);
}