package com.yxwy.leyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
    注册中心启动类
 */
@SpringBootApplication
@EnableEurekaServer //标记这是一个Eureka的注册中心
public class EurekaServerApp {
    public static void main(String[] args) {
        System.out.println("8101");
        SpringApplication.run(EurekaServerApp.class, args);
    }
}
