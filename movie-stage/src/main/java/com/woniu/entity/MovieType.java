package com.woniu.entity;

import lombok.Data;

@Data
public class MovieType {
    /**
    * 电影类型表id
    */
    private Integer id;

    /**
    * 电影id
    */
    private Integer mid;

    /**
    * 电影类型id
    */
    private Integer tid;
}