package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDOMapper;
import com.atguigu.springcloud.model.PaymentBO;
import com.atguigu.springcloud.model.PaymentDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 谢磊
 * @description PaymentServiceImpl
 * @date 2022/7/2 9:27
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDOMapper paymentDOMapper;
    @Override
    public Integer createPayment(PaymentBO paymentBO) {
        PaymentDO paymentDO = new PaymentDO();
        BeanUtils.copyProperties(paymentBO,paymentDO);
        return paymentDOMapper.insert(paymentDO);
    }

    @Override
    public PaymentBO queryPaymentById(Long id) {
        PaymentDO paymentDO = paymentDOMapper.selectByPrimaryKey(id);
        PaymentBO paymentBO = new PaymentBO();
        BeanUtils.copyProperties(paymentDO,paymentBO);
        return paymentBO;
    }
}
