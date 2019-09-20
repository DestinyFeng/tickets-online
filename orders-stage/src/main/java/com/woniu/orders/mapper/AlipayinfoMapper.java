package com.woniu.orders.mapper;

import com.woniu.orders.entity.Alipayinfo;
import com.woniu.orders.entity.AlipayinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayinfoMapper {
    long countByExample(AlipayinfoExample example);

    int deleteByExample(AlipayinfoExample example);

    int deleteByPrimaryKey(Integer clubOrderId);

    int insert(Alipayinfo record);

    int insertSelective(Alipayinfo record);

    List<Alipayinfo> selectByExample(AlipayinfoExample example);

    Alipayinfo selectByPrimaryKey(Integer clubOrderId);

    int updateByExampleSelective(@Param("record") Alipayinfo record, @Param("example") AlipayinfoExample example);

    int updateByExample(@Param("record") Alipayinfo record, @Param("example") AlipayinfoExample example);

    int updateByPrimaryKeySelective(Alipayinfo record);

    int updateByPrimaryKey(Alipayinfo record);
}