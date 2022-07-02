package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.common.util.BeanCopyUtil;
import com.atguigu.springcloud.enums.ResponseEnum;
import com.atguigu.springcloud.model.CommonResult;
import com.atguigu.springcloud.model.PaymentBO;
import com.atguigu.springcloud.model.dto.PaymentDTO;
import com.atguigu.springcloud.model.request.PaymentRequest;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谢磊
 * @description PaymentController
 * @date 2022/7/2 9:33
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<PaymentBO> createPayment(@RequestBody PaymentRequest request) {

        Integer result = paymentService.createPayment(BeanCopyUtil.copyProperties(request, new PaymentBO()));
        log.info("******插入结果：{}", result);

        if (result > 0) {
            return CommonResult.success(ResponseEnum.SUCCESS.getCode(), result);
        } else {
            return CommonResult.fail(ResponseEnum.FAIL.getCode(), "插入数据库失败");
        }
    }

    @GetMapping("/payment/query")
    public CommonResult<Long> queryPayment(Long id) {
        try {
            PaymentBO paymentBO = paymentService.queryPaymentById(id);
            log.info("******插入结果：{}", paymentBO.toString());
            return CommonResult.success(ResponseEnum.SUCCESS.getCode(), BeanCopyUtil.copyProperties(paymentBO, new PaymentDTO()));
        } catch (Exception e) {
            return CommonResult.fail(ResponseEnum.FAIL.getCode(), e.getMessage());
        }

    }
}
