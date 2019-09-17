package com.woniu.service.impl;

import com.woniu.entity.Comment;
import com.woniu.entity.CommentExample;
import com.woniu.mapper.CommentMapper;
import com.woniu.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;
    /**
     * 查询评论总数
     * @return
     * @throws Exception
     */
    @Override
    public int getCount() throws Exception {
        return commentMapper.countByExample(null);
    }

    /**
     * 分页查询评论信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Comment> getComments(Integer pageIndex,Integer num) throws Exception {
        return commentMapper.getComments((pageIndex-1)*num,num);
    }

    /**
     * 新增评论信息
     * @param comment
     * @throws Exception
     */
    @Override
    public void insertComment(Comment comment)throws Exception{
        commentMapper.insertSelective(comment);
    }
}
