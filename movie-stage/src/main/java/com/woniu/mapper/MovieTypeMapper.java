package com.woniu.mapper;

import com.woniu.entity.MovieType;

public interface MovieTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieType record);

    int insertSelective(MovieType record);

    MovieType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieType record);

    int updateByPrimaryKey(MovieType record);
}