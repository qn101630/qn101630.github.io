package com.qn.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @GetMapping("/user/{id}")
    public User getUser2(@PathVariable Long id){
        System.out.println("访问的端口："+port);
        return new User(id);
    }
}
