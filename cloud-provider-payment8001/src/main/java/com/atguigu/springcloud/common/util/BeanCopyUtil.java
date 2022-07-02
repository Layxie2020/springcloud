package com.atguigu.springcloud.common.util;

import org.springframework.beans.BeanUtils;

/**
 * @author 谢磊
 * @description BeanCopyUtil
 * @date 2022/7/2 9:38
 */
public class BeanCopyUtil {
    private BeanCopyUtil(){};

    public static <T,U> U copyProperties(T source,U target){
        BeanUtils.copyProperties(source,target);
        return target;
    }
}
