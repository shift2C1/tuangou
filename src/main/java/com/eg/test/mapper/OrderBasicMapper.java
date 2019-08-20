package com.eg.test.mapper;

import com.eg.test.mapper.entity.OrderBasic;
import com.eg.test.mapper.entity.OrderBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderBasicMapper {
    long countByExample(OrderBasicExample example);

    int deleteByExample(OrderBasicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderBasic record);

    int insertSelective(OrderBasic record);

    List<OrderBasic> selectByExampleWithBLOBs(OrderBasicExample example);

    List<OrderBasic> selectByExample(OrderBasicExample example);

    OrderBasic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderBasic record, @Param("example") OrderBasicExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderBasic record, @Param("example") OrderBasicExample example);

    int updateByExample(@Param("record") OrderBasic record, @Param("example") OrderBasicExample example);

    int updateByPrimaryKeySelective(OrderBasic record);

    int updateByPrimaryKeyWithBLOBs(OrderBasic record);

    int updateByPrimaryKey(OrderBasic record);
}