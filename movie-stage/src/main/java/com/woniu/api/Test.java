package com.woniu.api;

import com.woniu.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("select")
    public Result select(){
        return new Result(null,null,null,null);
    }
}
