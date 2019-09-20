package com.woniu.service;

import com.woniu.entity.Menu;

import java.util.List;

public interface MenuService {
    //查询所有的套餐
    public List<Menu> selectMenus();
    //根据ID删除一份套餐
    public Integer deleteById(Integer mid);
    //新增一份套餐
    public Integer insert(Menu menu);
    //根据id修改一份套餐
    public Integer updateById(Menu menu);
}
