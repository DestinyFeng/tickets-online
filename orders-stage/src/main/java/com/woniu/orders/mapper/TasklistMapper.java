package com.woniu.orders.mapper;

import com.woniu.orders.entity.Tasklist;
import com.woniu.orders.entity.TasklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TasklistMapper {
    long countByExample(TasklistExample example);

    int deleteByExample(TasklistExample example);

    int deleteByPrimaryKey(Integer taskid);

    int insert(Tasklist record);

    int insertSelective(Tasklist record);

    List<Tasklist> selectByExample(TasklistExample example);

    Tasklist selectByPrimaryKey(Integer taskid);

    int updateByExampleSelective(@Param("record") Tasklist record, @Param("example") TasklistExample example);

    int updateByExample(@Param("record") Tasklist record, @Param("example") TasklistExample example);

    int updateByPrimaryKeySelective(Tasklist record);

    int updateByPrimaryKey(Tasklist record);
}