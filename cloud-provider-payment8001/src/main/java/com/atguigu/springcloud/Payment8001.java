package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author 谢磊
 * @description Payment8001
 * @date 2022/7/2 7:44
 */

@SpringBootApplication
@MapperScan(basePackages ={"com.atguigu.springcloud.dao"} )
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class,args);

    }
}
