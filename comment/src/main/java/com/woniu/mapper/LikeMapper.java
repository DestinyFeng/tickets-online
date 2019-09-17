package com.woniu.mapper;

import com.woniu.entity.Like;
import com.woniu.entity.LikeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LikeMapper {
    int countByExample(LikeExample example);

    int deleteByExample(LikeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Like record);

    int insertSelective(Like record);

    List<Like> selectByExample(LikeExample example);

    Like selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Like record, @Param("example") LikeExample example);

    int updateByExample(@Param("record") Like record, @Param("example") LikeExample example);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);

    void deleteLike(@Param("uid") Integer uid, @Param("cid") Integer cid);
}