package com.atguigu.springcloud.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 谢磊
 * @description PaymentDTO
 * @date 2022/7/2 9:54
 */
@Getter
@Setter
public class PaymentDTO implements Serializable {

    private static final long serialVersionUID = -7630557492116713082L;

    private String serial;
}
