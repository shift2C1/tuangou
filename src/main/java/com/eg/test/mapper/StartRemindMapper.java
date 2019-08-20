package com.eg.test.mapper;

import com.eg.test.mapper.entity.StartRemind;
import com.eg.test.mapper.entity.StartRemindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StartRemindMapper {
    long countByExample(StartRemindExample example);

    int deleteByExample(StartRemindExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StartRemind record);

    int insertSelective(StartRemind record);

    List<StartRemind> selectByExample(StartRemindExample example);

    StartRemind selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StartRemind record, @Param("example") StartRemindExample example);

    int updateByExample(@Param("record") StartRemind record, @Param("example") StartRemindExample example);

    int updateByPrimaryKeySelective(StartRemind record);

    int updateByPrimaryKey(StartRemind record);
}