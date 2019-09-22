package com.woniu.orders.service;

import com.woniu.orders.entity.Seat;
import com.woniu.orders.entity.Seatinfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-21 10:08
 **/
public interface SeatInfoService {
    List<Seatinfo> selectSeat(Integer msid ) throws  Exception;
}
