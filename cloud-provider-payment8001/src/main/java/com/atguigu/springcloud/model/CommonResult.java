package com.atguigu.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author 谢磊
 * @description CommonResult
 * @date 2022/7/2 8:55
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;

    private String msg;

    private T data;

    public static<T> CommonResult success(Integer code,T data){
        return new CommonResult<T>(code,null,data);
    }
    public static<T> CommonResult fail(Integer code,String msg){
        return new CommonResult<T>(code,msg,null);
    }
}

