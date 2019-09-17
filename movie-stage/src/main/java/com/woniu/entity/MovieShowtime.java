package com.woniu.entity;

import java.util.Date;
import lombok.Data;

@Data
public class MovieShowtime {
    /**
    * 电影放映表id
    */
    private Integer id;

    /**
    * 影院id
    */
    private Integer cid;

    /**
    * 电影id
    */
    private Integer mid;

    /**
    * 放映时间
    */
    private Date playtime;

    /**
    * 影厅id
    */
    private Integer roomId;

    /**
    * 票价
    */
    private Double money;

    private CinemaRoom cinemaRoom;
}