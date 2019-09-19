package com.woniu.service;

import com.woniu.entity.User;

public interface UserService {
    /*根据用户id查询用户信息；*/
    User getUser(Integer Uid)throws Exception;
    /*更新用户信息*/
    void updateUser(User user)throws Exception;
    /*删除用户信息*/
    void deleteUser(Integer uid)throws Exception;
    /*新增用户信息*/
    void insertUser(User user)throws Exception;

}
