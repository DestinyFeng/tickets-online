package com.woniu.entity;

import lombok.Data;

@Data
public class Menu {
    /**
    * 套餐id
    */
    private Integer id;

    /**
    * 套餐名字
    */
    private String name;

    /**
    * 套餐资费
    */
    private Double money;

    /**
    * 套餐的使用年限
    */
    private Integer period;
}