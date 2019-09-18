package com.woniu.mapper;

import com.woniu.entity.MoviePerson;

public interface MoviePersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoviePerson record);

    int insertSelective(MoviePerson record);

    MoviePerson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoviePerson record);

    int updateByPrimaryKey(MoviePerson record);
    MoviePerson selectByMid(Integer mid);
}