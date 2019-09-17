package com.woniu.orders.entity;

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
    * 营业执照
    */
    private String idCard;

    /**
    * 影院logo
    */
    private String logo;

    /**
    * 版权
    */
    private String copyRight;

    /**
    * 设施图片
    */
    private String facility;

    private String phone;
}