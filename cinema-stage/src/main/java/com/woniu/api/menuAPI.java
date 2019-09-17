package com.woniu.api;

import com.woniu.entity.Menu;
import com.woniu.service.MenuService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("menu")
public class menuAPI {
    @Resource
    private MenuService menuService;
    @GetMapping
    public Result selectMenus(){
        List<Menu> menus = menuService.selectMenus();
        return new Result("success",null,null,menus);
    }
}
