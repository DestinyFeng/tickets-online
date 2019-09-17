/**
 * FunName:  函数名
 * Description :   描述这个方法是干嘛的
 * Create Date:
 *
 * @exception Exception   异常没有处理
 * @param 参数名(如果没有删除改行)  参数说明
 * @return 返回值类型, 如没有, 删除该行 返回是否找到
 * @author LIUTAO
 */
package com.woniu.orders.service.serviceIpml;

import com.woniu.orders.constant.Constant;
import com.woniu.orders.entity.Order;
import com.woniu.orders.mapper.OrderMapper;
import com.woniu.orders.service.OrderService;
import com.woniu.orders.util.DateUtil;
import com.woniu.orders.util.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    //分页查询订单
    public List<Order> selectOrder(int uid, Integer PageIndex) throws ParseException {
        //封装查询数据
        Map<String, Integer> map = new HashMap<>();
        map.put("uid", uid);
        int num = 10;
        map.put("start", (PageIndex - 1) * num);
        map.put("num", num);
        List<Order> orders = orderMapper.selectOrder(map);
        //由于座位是存的字符串，以，隔开，在这里拆分放入list集合
        List<Seat> list = new ArrayList<>();
        for (Order order : orders) {
            //格式化日期显示到前台，根据当前日期动态变化
            System.out.println(order.getPalyTime());
            order.setFormatTime(showdate(order.getPalyTime()) + "\n" + DateUtil.dateToString(order.getPalyTime()));
            String seat = order.getSeat();
            String[] split = seat.split(",");
            for (int i = 0; i < split.length; i++) {
                Seat seatname = new Seat();
                seatname.setSeatName(split[i]);
                list.add(seatname);
            }
            order.setSeatList(list);
            //将数据库中的code转为字符串信息
            if (order.getOstate() == Constant.OrderStatusEnum.NO_PAY.getCode()) {
                order.setOstateMsg(Constant.OrderStatusEnum.NO_PAY.getValue());
            } else {
                order.setOstateMsg(Constant.OrderStatusEnum.ORDER_SUCCESS.getValue());
            }
        }
        return orders;
    }

    //根据传入的时间与当前时间比较，该显示什么，今天，明天，后天，其他则显示周几
    private String showdate(Date date) throws ParseException {
        Date datenow = new Date();
        if (date.getTime() - datenow.getTime() <= 24 * 60 * 60 * 1000 && date.getTime() - datenow.getTime() > 0) {
            return "今天";
        } else if (date.getTime() - datenow.getTime() <= 24 * 60 * 60 * 1000 * 2 && date.getTime() - datenow.getTime() > 24 * 60 * 60 * 1000) {
            return "明天";
        } else if (date.getTime() - datenow.getTime() <= 24 * 60 * 60 * 1000 * 3 && date.getTime() - datenow.getTime() > 24 * 60 * 60 * 1000 * 2) {
            return "后天";
        } else {
            return DateUtil.dayForWeek(date);
        }
    }

    @Override
    //查询订单总数
    public int selectCount(int uid) {
        int count = orderMapper.selectCount(uid);
        return count;
    }

    @Override
    //删除订单
    public int delete(int oid) {
        return orderMapper.delete(oid);
    }

    @Override
    public Order selectDatail(Integer oid) throws ParseException {
        Order order = orderMapper.selectDetail(oid);
        order.setFormatTime(showdate(order.getPalyTime()) + "\n" + DateUtil.dateToString(order.getPalyTime()));
        List<Seat> list = new ArrayList<>();
        String seat = order.getSeat();
        String[] split = seat.split(",");
        for (int i = 0; i < split.length; i++) {
            Seat seatname = new Seat();
            seatname.setSeatName(split[i]);
            list.add(seatname);
        }
        order.setSeatList(list);
        if (order.getOstate() == Constant.OrderStatusEnum.NO_PAY.getCode()) {
            order.setOstateMsg(Constant.OrderStatusEnum.NO_PAY.getValue());
        } else {
            order.setOstateMsg(Constant.OrderStatusEnum.ORDER_SUCCESS.getValue());
        }
        return order;
    }

}