package com.woniu.api;

import com.woniu.service.CityService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("city")
public class CityAPI {
    @Resource
    private CityService cityService;

    @GetMapping
    public Result getCitys()throws Exception{
        return new Result("success",null,null,cityService.getCitys());
    }
}
