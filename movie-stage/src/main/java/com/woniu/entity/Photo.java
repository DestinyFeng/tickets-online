package com.woniu.entity;

import lombok.Data;

@Data
public class Photo {
    /**
    * 图片id
    */
    private Integer id;

    /**
    * 图片的url
    */
    private String url;

    /**
    * 类型：影院设施图片，电影简介图片
    */
    private String type;
}