package com.woniu.service;

import com.woniu.entity.Menu;

import java.util.List;

public interface MenuService {
    //查询所有的套餐
    public List<Menu> selectMenus();
}
