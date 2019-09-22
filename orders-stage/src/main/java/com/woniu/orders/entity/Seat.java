package com.woniu.orders.entity;

import lombok.Data;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-20 23:11
 */
@Data
public class Seat {
    private String row;
    private String column;
    private String state;
}
