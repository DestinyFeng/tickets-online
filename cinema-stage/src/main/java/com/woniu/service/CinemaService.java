package com.woniu.service;

import com.woniu.entity.Cinema;

import java.util.List;

public interface CinemaService {
    //查询出所有的影院
    public List<Cinema> selectAll(Integer pageIndex, Integer num);
    //根据影院id查询影院的相应信息
    public Cinema selectById(Integer cid);
    //查询电影表中的总数
    public Integer count();
    //新增一家电影院
    public Integer insert(Cinema cinema);
    //根据id删除一家影院
    public Integer delete(Integer cid);
    //根据id更新一家影院
    public Integer update(Cinema cinema);


}
