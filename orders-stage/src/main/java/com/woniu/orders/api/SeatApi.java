package com.woniu.orders.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.woniu.orders.entity.MovieShowInfo;
import com.woniu.orders.entity.Seat;
import com.woniu.orders.entity.Seatinfo;
import com.woniu.orders.service.SeatInfoService;
import com.woniu.orders.service.SeatService;
import com.woniu.orders.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-20 22:52
 **/
@Controller
public class SeatApi {
    @Resource
    private  SeatInfoService seatInfoService;
    @Resource
    private SeatService seatService;
    @RequestMapping("selectSeat")
    @ResponseBody
    public Result select (Integer msid) throws Exception {
        System.out.println("请求进来了");
        List<Seatinfo> seatinfos = seatInfoService.selectSeat(msid);
        String s = JSON.toJSONString(seatinfos);
        System.out.println(seatinfos);
        System.out.println(s);
        return new Result("200","c",null,seatinfos);
    }
    @RequestMapping("selectCinema")
    @ResponseBody
    public Result selectCinema(Integer msid)throws Exception{
        MovieShowInfo movieShowInfo = seatService.selectMovieShowInfo(msid);
       return new Result("200",null,movieShowInfo,null);
    }
}
