package com.xd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.config
 */
@SpringBootApplication
@EnableConfigServer  //开启配置服务器的功能
@EnableEurekaClient //表示该服务是属于一个服务提供者 @EnableDiscoveryClient 表示是一个服务消费者
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
