package com.woniu.serviceimpl;

import com.woniu.entity.Menu;
import com.woniu.mapper.MenuMapper;
import com.woniu.service.MenuService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    @Cacheable
    public List<Menu> selectMenus() {
        List<Menu> menus = menuMapper.selectAll();
        return menus;
    }

    @Override
    public Integer deleteById(Integer mid) {
        int row = menuMapper.deleteByPrimaryKey(mid);
        return row;
    }

    @Override
    public Integer insert(Menu menu) {
        int row = menuMapper.insertSelective(menu);
        return row;
    }

    @Override
    public Integer updateById(Menu menu) {
        int row = menuMapper.updateByPrimaryKeySelective(menu);
        return row;
    }
}
