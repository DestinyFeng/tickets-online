package com.woniu.orders.service;

import com.woniu.orders.entity.MovieShowInfo;

public interface SeatService {
    MovieShowInfo selectMovieShowInfo(Integer msid)throws Exception;
}
