package com.woniu.orders.service.serviceIpml;

import com.woniu.orders.entity.Seatinfo;
import com.woniu.orders.mapper.SeatinfoMapper;
import com.woniu.orders.service.SeatInfoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-21 10:11
 **/
@Service
public class SeatInfoServiceImpl implements SeatInfoService {
    @Resource
    private SeatinfoMapper seatinfoMapper;
    @Override
    public List<Seatinfo> selectSeat(Integer msid ) throws Exception {
           return seatinfoMapper.selectSeat(1);
    }
}
