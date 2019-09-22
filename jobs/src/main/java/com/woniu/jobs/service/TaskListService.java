package com.woniu.jobs.service;

import com.woniu.jobs.entity.Tasklist;


import java.util.List;

public interface TaskListService {
    public List<Tasklist> select(String type) throws Exception;
    public void deleteById(String id) throws Exception;
}
