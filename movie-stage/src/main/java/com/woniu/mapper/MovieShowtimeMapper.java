package com.woniu.mapper;

import com.woniu.entity.MovieShowtime;

public interface MovieShowtimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieShowtime record);

    int insertSelective(MovieShowtime record);

    MovieShowtime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieShowtime record);

    int updateByPrimaryKey(MovieShowtime record);
}