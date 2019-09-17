package com.woniu.mapper;

import com.woniu.entity.MoviePhoto;

public interface MoviePhotoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoviePhoto record);

    int insertSelective(MoviePhoto record);

    MoviePhoto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoviePhoto record);

    int updateByPrimaryKey(MoviePhoto record);
}