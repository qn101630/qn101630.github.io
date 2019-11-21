package com.qn.controller;

import com.qn.entity.User;
import com.qn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private UserService userService;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        return userService.getUser2(id);
    }
}
