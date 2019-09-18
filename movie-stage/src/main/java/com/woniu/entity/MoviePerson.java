package com.woniu.entity;

import lombok.Data;

@Data
public class MoviePerson {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 导演
     */
    private String director;

    /**
     * 编剧
     */
    private String screenwriter;

    /**
     * 主演
     */
    private String tostar;

    /**
     * 电影id
     */
    private Integer mid;
}