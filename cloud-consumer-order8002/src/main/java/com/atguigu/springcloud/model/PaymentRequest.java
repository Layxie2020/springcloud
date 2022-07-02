package com.atguigu.springcloud.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 谢磊
 * @description PaymentRequest
 * @date 2022/7/2 9:36
 */
@Getter
@Setter
public class PaymentRequest implements Serializable {
    private String serial;
}
