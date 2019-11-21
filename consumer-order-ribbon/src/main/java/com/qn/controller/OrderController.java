package com.qn.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        User user = restTemplate.getForObject("http://PROVIDER-USER/user/"+ id, User.class);
        return user;
    }
}
