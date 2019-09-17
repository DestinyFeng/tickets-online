package com.woniu.service.impl;

import com.woniu.entity.Like;
import com.woniu.entity.LikeExample;
import com.woniu.mapper.LikeMapper;
import com.woniu.service.LikeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LikeServiceImpl implements LikeService {
    @Resource
    private LikeMapper likeMapper;

    /**
     * 根据cid查询该评论的点赞总数
     * @param cid
     * @return
     * @throws Exception
     */
    @Override
    public int getCount(Integer cid) throws Exception {
        LikeExample le=new LikeExample();
        le.createCriteria().andCommentIdEqualTo(cid);
        return likeMapper.countByExample(le);
    }

    /**
     * 新增点信息
     * @param like
     * @throws Exception
     */
    @Override
    public void insertList(Like like) throws Exception {
        likeMapper.insertSelective(like);
    }

    /**
     * 删除点赞信息;
     * @param uid
     * @param cid
     * @throws Exception
     */
    @Override
    public void deleteLike(Integer uid, Integer cid) throws Exception {
        likeMapper.deleteLike(uid,cid);
    }
}
