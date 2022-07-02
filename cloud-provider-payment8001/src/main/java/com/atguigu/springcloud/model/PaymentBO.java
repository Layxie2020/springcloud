package com.atguigu.springcloud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 谢磊
 * @description PaymentBO
 * @date 2022/7/2 9:11
 */

@Getter
@Setter
@ToString
public class PaymentBO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String serial;


}
