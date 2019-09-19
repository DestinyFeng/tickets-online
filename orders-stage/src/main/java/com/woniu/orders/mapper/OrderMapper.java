package com.woniu.orders.mapper;

import com.woniu.orders.entity.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectOrder(Map<String, Integer> map);

    int selectCount(int uid);

    int delete(Integer oid);

    Order selectDetail(String oid);
    //更新订单状态
    int updatepay(Map<String, Object> map);

    /**
     *
     * @param oid 订单号
     * @return
     */
    int deleteByOid(String oid);
}