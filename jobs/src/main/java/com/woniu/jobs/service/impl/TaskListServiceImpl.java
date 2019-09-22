package com.woniu.jobs.service.impl;

import com.woniu.jobs.entity.Tasklist;
import com.woniu.jobs.mapper.TasklistMapper;
import com.woniu.jobs.service.TaskListService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-20 20:31
 **/

@Component
public class TaskListServiceImpl implements TaskListService {
    @Resource
    private TasklistMapper tasklistMapper;
    @Override
    public List<Tasklist> select(String type) throws Exception {
       return tasklistMapper.select(type);
    }

    @Override
    public void deleteById(String id) throws Exception {
        tasklistMapper.deleteById(id);
    }
}
