package com.qn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//启用服务网关
@EnableZuulProxy
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
