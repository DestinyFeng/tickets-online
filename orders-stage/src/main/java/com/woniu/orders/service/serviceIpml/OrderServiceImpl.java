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
        for (Order order : orders) {
            //格式化日期显示到前台，根据当前日期动态变化
            order.setFormatTime(DateUtil.formatDate(order.getPalyTime()) + "\n" + DateUtil.dateToString(order.getPalyTime()));
            String seat = order.getSeat();
            String[] split = seat.split("=");
            List<Seat> list = new ArrayList<>();
            for (int i = 0; i < split.length; i++) {
                Seat seatname = new Seat();
                seatname.setSeatName(split[i]);
                list.add(seatname);

            }
              order.setSeatList(list);

            //将数据库中的code转为字符串信息
            order =this.ostateToString(order);
        }
        return orders;
    }

    //根据传入的时间与当前时间比较，该显示什么，今天，明天，后天，其他则显示周几


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
    public Order selectDatail(String oid) throws ParseException {
        Order order = orderMapper.selectDetail(oid);
        order.setFormatTime(DateUtil.formatDate(order.getPalyTime()) + "\n" + DateUtil.dateToString(order.getPalyTime()));
        List<Seat> list = new ArrayList<>();
        String seat = order.getSeat();
        String[] split = seat.split("=");
        for (int i = 0; i < split.length; i++) {
            Seat seatname = new Seat();
            seatname.setSeatName(split[i]);
            list.add(seatname);
        }
        order.setSeatList(list);
        order = this.ostateToString(order);


        return order;
    }

    @Override
    public void updatebyOid(String oid, Byte ostate, int payinfo_id) {
        Map<String ,Object> map = new HashMap<>();
        map.put("oid" ,oid);
        map.put("ostate",ostate);
        map.put("payinfo_id",payinfo_id);
        orderMapper.updatepay(map);
    }

    @Override
    //根据订单号修改订单状态
    public int updateStateByOid(String oid, Byte ostate) {
        System.out.println("修改订单");
         Map<String ,Object> map = new HashMap<>();
        map.put("oid" ,oid);
        map.put("ostate",ostate);
        System.out.println(map);
        int updatepay = orderMapper.updatepay(map);
        return updatepay;
    }

    @Override
    //删除订单
    public int deleteByOid(String Oid) throws Exception {
       return orderMapper.deleteByOid(Oid);
    }

    //一个工具将订单状态转为字符串信息
    public Order ostateToString (Order order){
         if (order.getOstate() == Constant.OrderStatusEnum.NO_PAY.getCode()) {
            //未付款
            order.setOstateMsg(Constant.OrderStatusEnum.NO_PAY.getValue());
            //给前端传剩余付款时间数
            int time= (int)((order.getcTime().getTime()+15*60*1000-System.currentTimeMillis())/1000);
               order.setLeftPaySecond (time);
        } else if(order.getOstate() == Constant.OrderStatusEnum.PAID.getCode()){
            //已付款
            //电影开场前30分钟支持退款，改签
            if((order.getPalyTime().getTime()-System.currentTimeMillis())>30*1000){
                 order.setOstateMsg(Constant.OrderStatusEnum.PAID.getValue());
            }else {
                 order.setOstateMsg("订单完成");
            }
        }else if (order.getOstate() == Constant.OrderStatusEnum.ORDER_CLOSE.getCode()){
            order.setOstateMsg(Constant.OrderStatusEnum.ORDER_CLOSE.getValue());
        } else if (order.getOstate() == Constant.OrderStatusEnum.ORDER_SUCCESS.getCode()){
            order.setOstateMsg(Constant.OrderStatusEnum.ORDER_SUCCESS.getValue());
        }
         return order;
    }


}