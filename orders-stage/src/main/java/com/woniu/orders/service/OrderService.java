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
package com.woniu.orders.service;

import com.woniu.orders.entity.Order;

import java.text.ParseException;
import java.util.List;

public interface OrderService {

    List<Order> selectOrder(int uid, Integer PageIndex) throws Exception;
    int selectCount(int uid)throws Exception;
    int delete(int oid)throws Exception;
    Order selectDatail(String oid) throws Exception;
    void updatebyOid(String oid, Byte ostate, int a_pid)throws Exception;
    int updateStateByOid(String oid, Byte ostate)throws Exception;
    int deleteByOid(String Oid)throws Exception;

}
  
