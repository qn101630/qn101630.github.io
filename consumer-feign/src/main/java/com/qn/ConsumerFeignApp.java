package com.qn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
@EnableEurekaClient
//开启Feign的功能
@EnableFeignClients
@EnableHystrixDashboard
//注解开启Hystrix
@EnableCircuitBreaker
public class ConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApp.class,args);
    }
}
