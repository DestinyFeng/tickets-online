package com.woniu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema implements Serializable {
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
     * 影院管理人id
     */
    private int aid;

    /**
     * 影院设施图片集合
     */
    private List<Picture> pics;
}