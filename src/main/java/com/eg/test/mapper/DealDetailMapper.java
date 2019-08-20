package com.eg.test.mapper;

import com.eg.test.mapper.entity.DealDetail;
import com.eg.test.mapper.entity.DealDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealDetailMapper {
    long countByExample(DealDetailExample example);

    int deleteByExample(DealDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DealDetail record);

    int insertSelective(DealDetail record);

    List<DealDetail> selectByExample(DealDetailExample example);

    DealDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DealDetail record, @Param("example") DealDetailExample example);

    int updateByExample(@Param("record") DealDetail record, @Param("example") DealDetailExample example);

    int updateByPrimaryKeySelective(DealDetail record);

    int updateByPrimaryKey(DealDetail record);
}