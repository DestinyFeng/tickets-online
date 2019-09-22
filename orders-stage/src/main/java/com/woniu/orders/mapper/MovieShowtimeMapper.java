package com.woniu.orders.mapper;

import com.woniu.orders.entity.MovieShowInfo;

public interface MovieShowtimeMapper {
    //根据id查询票价
    Double selectPrice(Integer msid);

    MovieShowInfo selectMovieShowInfo(Integer msid);
}