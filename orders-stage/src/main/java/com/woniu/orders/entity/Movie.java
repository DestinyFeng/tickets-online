package com.woniu.orders.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Movie{
    /**
    * 电影id
    */
    private Integer id;

    /**
    * 电影名
    */
    private String mname;

    /**
    * 票房
    */
    private Double tickets;

    /**
    * 国家
    */
    private String comntry;

    /**
    * 上映时间
    */
    private Date uptime;

    /**
    * 评分
    */
    private String score;

    /**
    * 简介
    */
    private String shortStory;

    /**
    * 预告片
    */
    private String preMovie;

    /**
    * 电影时长
    */
    private String longtime;
}