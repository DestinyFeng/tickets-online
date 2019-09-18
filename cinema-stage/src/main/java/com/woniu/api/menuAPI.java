package com.woniu.api;

import com.woniu.entity.Menu;
import com.woniu.service.MenuService;
import com.woniu.util.Result;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("menu")
public class menuAPI {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Resource
    private MenuService menuService;
    @GetMapping
    public Result selectMenus(){
        List<Menu> menus = menuService.selectMenus();
        System.out.println("menus----"+menus);
        return new Result("success",null,null,menus);
    }
    @DeleteMapping
    public Result deleteMenuById(Integer mid){
        Integer row = menuService.deleteById(mid);
        System.out.println(row);
        return new Result("success",null,null,null);
    }
    @PostMapping
    public Result insertMenu(String name, Double money, Integer period){
        if(name==null||"".equals(name)||money==null||money<0||period==null||period<1){
            return new Result(null,"传入的数据不合法！！！",null,null);
        }
        Menu menu = new Menu();
        menu.setName(name);
        menu.setMoney(money);
        menu.setPeriod(period);
        Integer row = menuService.insert(menu);
        return new Result("success",null,null,null);
    }
    @PutMapping
    public Result update(List list){
        return null;
    }
}
