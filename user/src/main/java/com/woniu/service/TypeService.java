package com.woniu.service;

import com.woniu.entity.Type;
import com.woniu.entity.User;
import com.woniu.entity.UserType;

import java.util.List;

public interface TypeService {
    /*查询所有类型信息*/
    List<Type> getTypes()throws Exception;
    /*根据id查询类型信息*/
    List<Type> getTypesById(Integer uid)throws Exception;
    /*删除用户喜欢的电影类型信息*/
    void deleteUserType(Integer uid)throws Exception;
    /*新增类型信息*/
    void insertUserType(UserType userType)throws Exception;
}
