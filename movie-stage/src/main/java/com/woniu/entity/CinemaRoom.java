package com.woniu.entity;

import lombok.Data;

@Data
public class CinemaRoom {
    /**
    * 影厅id
    */
    private Integer id;

    /**
    * 电影院id
    */
    private Integer cid;

    /**
    * 影厅座位
    */
    private String coordinate;

    /**
    * 影厅名字
    */
    private String name;

    /**
    * 影厅的类型（2D,3D,4D）
    */
    private String type;
}