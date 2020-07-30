package com.yxwy.leyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
   用户服务提供者启动类
 */
@SpringBootApplication
@EnableDiscoveryClient //注册和发现服务
public class UserProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApp.class, args);
    }
}
