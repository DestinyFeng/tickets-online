package com.woniu.api;

import com.woniu.entity.Menu;
import com.woniu.service.MenuService;
import com.woniu.util.Result;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public Result deleteMenuById(String[] checkID){
        System.out.println("id数组:"+checkID);
        if(checkID.length==0){
            return new Result(null,"请选择你要删除的内容",null,null);
        }
        for (String mid:checkID) {
            Integer id = Integer.parseInt(mid);
            Integer row = menuService.deleteById(id);
            System.out.println(row);
        }
        return new Result("success",null,null,null);
    }
    @PostMapping
    public Result insertMenu(String name, Double money, Integer period){
        List<Menu> menus = menuService.selectMenus();
        int maxLength = 8;
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher((CharSequence) name);
        boolean flag = matcher.matches();
        if(name==null||"".equals(name)||flag==true||name.length()>maxLength||money==null
                ||money<0||period==null||period<1){
            return new Result(null,"传入的数据不合法！！！",null,null);
        }
        Menu menu = new Menu();
        menu.setName(name);
        menu.setMoney(money);
        menu.setPeriod(period);
        for(int i=0;i<menus.size();i++){
            if(money==menus.get(i).getMoney()&&period==menus.get(i).getPeriod()){
                return new Result(null,"已存在该套餐！",null,null);
            }
            if(menus.get(i).getName().equals(name)){
                return new Result(null,"已有此套餐名！",null,null);
            }
        }
        Integer row = menuService.insert(menu);
        return new Result("success",null,null,null);
    }
    @PutMapping
    public Result update(Integer id, String name, Double money, Integer period){
        System.out.println("请求进入----"+name+"----"+money+"----"+period);
        Menu menu = new Menu();
        menu.setId(id);
        menu.setName(name);
        menu.setMoney(money);
        menu.setPeriod(period);
        Integer row = menuService.updateById(menu);
        System.out.println("row---"+row);
        return new Result("success",null,null,null);
    }
}
