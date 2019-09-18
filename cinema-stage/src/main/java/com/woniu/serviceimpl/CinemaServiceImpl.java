package com.woniu.serviceimpl;

import com.woniu.entity.Cinema;
import com.woniu.mapper.CinemaMapper;
import com.woniu.service.CinemaService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CinemaServiceImpl implements CinemaService {
    @Resource
    private CinemaMapper cinemaMapper;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Override
    @Cacheable
    public List<Cinema> selectAll(Integer pageIndex, Integer num) {
        Integer start = (pageIndex-1)*num;
        List<Cinema> cinemas = cinemaMapper.selectAll(start,num);
        ValueOperations<String,Object> operations = redisTemplate.opsForValue();
        operations.set("cinemas",cinemas);
        return cinemas;
    }
    @Override
//    @Cacheable
    public Cinema selectById(Integer cid) {
        Cinema cinema = cinemaMapper.selectByPrimaryKey(cid);
        System.out.println(cinema);
        return cinema;
    }

    @Override
    public Integer count() {
        Integer count = cinemaMapper.count();
        return count;
    }

    @Override
    public Integer insert(Cinema cinema) {
        cinemaMapper.insert(cinema);
        return null;
    }

    @Override
    public Integer delete(Integer cid) {
        int row = cinemaMapper.deleteByPrimaryKey(cid);
        return row;
    }

    @Override
    public Integer update(Cinema cinema) {
        int row = cinemaMapper.updateByPrimaryKeySelective(cinema);
        return row;
    }
}
