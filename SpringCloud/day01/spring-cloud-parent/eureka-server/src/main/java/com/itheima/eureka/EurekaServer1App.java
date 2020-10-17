package com.itheima.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启用EurekaServer
public class EurekaServer1App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1App.class,args);
    }
}
