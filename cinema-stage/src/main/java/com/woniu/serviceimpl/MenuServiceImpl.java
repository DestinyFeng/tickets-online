package com.woniu.serviceimpl;

import com.woniu.entity.Menu;
import com.woniu.mapper.MenuMapper;
import com.woniu.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> selectMenus() {
        List<Menu> menus = menuMapper.selectAll();
        return menus;
    }
}
