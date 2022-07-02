package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.model.CommonResult;
import com.atguigu.springcloud.model.PaymentDTO;
import com.atguigu.springcloud.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 谢
 * @description OrderControllerRest
 * @date 2022/7/2 20:46
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Long> create(PaymentRequest payment) {
       return restTemplate.postForObject("http://localhost:8001/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get")
    public CommonResult<PaymentDTO> query(Long id) {
//        return CommonResult.success(200,new PaymentDTO());
        return restTemplate.getForObject("http://localhost:8001/payment/query?id="+id, CommonResult.class);
    }

}
