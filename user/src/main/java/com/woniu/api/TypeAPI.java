package com.woniu.api;

import com.woniu.service.TypeService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("type")
public class TypeAPI {
    @Resource
    private TypeService typeService;

    /**
     * 查询所有类型信息
     * @return
     * @throws Exception
     */
    @RequestMapping
    public Result selectTypes()throws Exception{
        return new Result("success",null,null,typeService.getTypes());
    }
}
