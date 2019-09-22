package com.woniu.orders.service.serviceIpml;

import com.woniu.orders.entity.MovieShowInfo;
import com.woniu.orders.mapper.MovieShowtimeMapper;
import com.woniu.orders.service.SeatService;
import com.woniu.orders.util.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-21 16:51
 **/
@Service
public class SeatServiceImpl implements SeatService {
    @Resource
    private MovieShowtimeMapper movieShowtimeMapper;
    @Override
    public MovieShowInfo selectMovieShowInfo(Integer msid) throws Exception {
        MovieShowInfo movieShowInfo = movieShowtimeMapper.selectMovieShowInfo(msid);
        //根据当前时间格式化到前台显示不同的日期
        movieShowInfo.setFormatTime(DateUtil.formatDate( movieShowInfo.getPlayTime()) + "\n" + DateUtil.dateToString( movieShowInfo.getPlayTime()));
       return movieShowInfo;
    }
}
