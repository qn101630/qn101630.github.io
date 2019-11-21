package com.qn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka server
public class Eureka {
    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }
}
