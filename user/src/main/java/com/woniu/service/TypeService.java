package com.woniu.service;

import com.woniu.entity.Type;

import java.util.List;

public interface TypeService {
    /*查询所有类型信息*/
    List<Type> getTypes()throws Exception;
}
