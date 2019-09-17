package com.woniu.service;

import com.woniu.entity.Comment;

import java.util.List;

public interface CommentService {
    //查询所有评论；
    int getCount()throws Exception;
    //查询所有评论
    List<Comment> getComments(Integer pageIndex,Integer num)throws Exception;
    //新增评论信息；
    void insertComment(Comment comment)throws Exception;
}
