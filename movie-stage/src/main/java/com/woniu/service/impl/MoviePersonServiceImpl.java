package com.woniu.service.impl;

import com.woniu.entity.MoviePerson;
import com.woniu.mapper.MoviePersonMapper;
import com.woniu.service.MoviePersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MoviePersonServiceImpl implements MoviePersonService {
    @Resource
    private MoviePersonMapper moviePersonMapper;
    @Override
    public MoviePerson selectByMid(Integer mid) throws Exception {
        MoviePerson moviePerson = moviePersonMapper.selectByMid(mid);
        return moviePerson;
    }
}
