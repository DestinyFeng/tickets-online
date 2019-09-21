package com.woniu.service.impl;

import com.woniu.entity.City;
import com.woniu.entity.CityExample;
import com.woniu.mapper.CityMapper;
import com.woniu.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;
    @Override
    public List<City> getCitys() throws Exception {
        return cityMapper.getCitys();
    }
}
