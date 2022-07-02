package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.model.PaymentDO;
import com.atguigu.springcloud.model.PaymentDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaymentDOMapper {
    long countByExample(PaymentDOExample example);

    int deleteByExample(PaymentDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PaymentDO record);

    int insertSelective(PaymentDO record);

    List<PaymentDO> selectByExample(PaymentDOExample example);

    PaymentDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PaymentDO record, @Param("example") PaymentDOExample example);

    int updateByExample(@Param("record") PaymentDO record, @Param("example") PaymentDOExample example);

    int updateByPrimaryKeySelective(PaymentDO record);

    int updateByPrimaryKey(PaymentDO record);
}