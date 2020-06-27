package com.qianfeng.userinfo_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qianfeng")
@MapperScan(basePackages = "com.qianfeng.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class UserinfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserinfoServiceApplication.class, args);
    }

}
