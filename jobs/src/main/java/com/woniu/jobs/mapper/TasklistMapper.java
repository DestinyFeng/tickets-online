package com.woniu.jobs.mapper;

import com.woniu.jobs.entity.Tasklist;

import java.util.List;

public interface TasklistMapper {
    int updateByPrimaryKey(Tasklist record);
    //查询付款超时任务
    public List<Tasklist> select(String type);
    public void deleteById(String id);
}