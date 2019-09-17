package com.woniu.mapper;

import com.woniu.entity.CinemaRoom;

public interface CinemaRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CinemaRoom record);

    int insertSelective(CinemaRoom record);

    CinemaRoom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CinemaRoom record);

    int updateByPrimaryKey(CinemaRoom record);
}