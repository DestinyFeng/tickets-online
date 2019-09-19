package com.woniu.service.impl;

import com.woniu.entity.Type;
import com.woniu.entity.User;
import com.woniu.entity.UserType;
import com.woniu.entity.UserTypeExample;
import com.woniu.mapper.TypeMapper;
import com.woniu.mapper.UserTypeMapper;
import com.woniu.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;
    @Resource
    private UserTypeMapper userTypeMapper;
    /**
     * 查询所有类型信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Type> getTypes() throws Exception {
        return typeMapper.selectByExample(null);
    }

    /**
     *查询电影信息；
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public List<Type> getTypesById(Integer id) throws Exception {
        return typeMapper.getTypesById(id);
    }

    /**
     * 删除电影类型信息（usertype表）；
     * @param uid
     * @throws Exception
     */
    @Override
    public void deleteUserType(Integer uid) throws Exception {
        UserTypeExample ute=new UserTypeExample();
        ute.createCriteria().andUidEqualTo(uid);
        userTypeMapper.deleteByExample(ute);
    }
    /*新增usertype信息*/
    @Override
    public void insertUserType(UserType userType)throws Exception{
        userTypeMapper.insertSelective(userType);
    }

}
