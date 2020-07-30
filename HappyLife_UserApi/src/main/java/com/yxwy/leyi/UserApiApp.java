package com.yxwy.leyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
    用户服务消费者启动类
 */
@SpringBootApplication
@EnableDiscoveryClient //发现服务
@EnableFeignClients //启用Feign
public class UserApiApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApiApp.class, args);
    }
}
