package com.atguigu.springcloud.enums;

import lombok.Getter;

/**
 * @author 谢磊
 * @description ResponseEnum
 * @date 2022/7/2 9:45
 */
@Getter
public enum ResponseEnum {
    SUCCESS(200,"success"),
    FAIL(404,"fail");

    private Integer code;

    private String msg;

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
