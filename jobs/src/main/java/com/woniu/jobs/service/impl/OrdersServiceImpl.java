package com.woniu.jobs.service.impl;

import com.woniu.jobs.entity.Orders;
import com.woniu.jobs.entity.OrdersExample;
import com.woniu.jobs.mapper.OrdersMapper;
import com.woniu.jobs.service.OrderService;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-20 20:21
 **/
@Component
public class OrdersServiceImpl implements OrderService {
    @Resource
    private OrdersMapper ordersMapper ;

    @Override
    public int updateOstate(String oid) throws Exception{
        Orders orders =new Orders();
        orders.setOstate((byte) 0);
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andOrderIdEqualTo(oid);
        criteria.andOstateEqualTo((byte)10);
       return ordersMapper.updateByExampleSelective(orders,ordersExample);

    }
}
