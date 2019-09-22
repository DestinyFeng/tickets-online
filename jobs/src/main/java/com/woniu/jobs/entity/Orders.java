package com.woniu.jobs.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Orders {
    /**
     * 订单id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 订单创建时间
     */
    private Date cTime;

    /**
     * 订单金额
     */
    private Double money;

    /**
     * 订单状态，(0,"超时未支付"),(10,"未支付"),(20,"已付款"),(30,"交易结束，不可退款"，40，全额退款，50，改签
     */
    private Byte ostate;

    /**
     * 支付状态,待支付，已支付，退款，
     */
    private Byte payState;

    /**
     * 支付方式
     */
    private Byte payway;

    /**
     * 二维码
     */
    private String code;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 放映表id
     */
    private Integer movieShowtimeId;

    /**
     * 支付表id
     */
    private Integer payinfoId;

    /**
     * 座位信息
     */
    private String seat;

    /**
     * 1代表用户删除，(物理不删除，方便商家统计数据）
     */
    private Byte isdel;
}