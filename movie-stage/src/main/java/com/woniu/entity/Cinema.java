package com.woniu.entity;

import lombok.Data;

@Data
public class Cinema {
    /**
    * 影院id
    */
    private Integer id;

    /**
    * 影院名
    */
    private String cName;

    /**
    * 影院地址
    */
    private String cAddress;

    /**
    * 影院logo
    */
    private String logo;

    /**
    * 版权
    */
    private String copyRight;

    /**
    * 影院图片
    */
    private String facility;

    /**
    * 影院的管理员id
    */
    private Integer aid;
}