package com.woniu.service.impl;

import com.woniu.entity.Type;
import com.woniu.mapper.TypeMapper;
import com.woniu.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;
    /**
     * 查询所有类型信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Type> getTypes() throws Exception {
        return typeMapper.selectByExample(null);
    }
}
