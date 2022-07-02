package com.atguigu.springcloud.service;


import com.atguigu.springcloud.model.PaymentBO;

/**
 * @author 谢磊
 * @description PaymentService
 * @date 2022/7/2 9:01
 */
public interface PaymentService {
    /**
     * 创建支付
     * @param paymentBO
     * @return
     */
    Integer createPayment(PaymentBO paymentBO);
    /**
     * 根据id查询
     * @param id
     * @return
     */
    PaymentBO queryPaymentById(Long id);
}
