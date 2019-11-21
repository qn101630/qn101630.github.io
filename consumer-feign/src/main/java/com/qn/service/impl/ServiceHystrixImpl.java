package com.qn.service.impl;

import com.qn.entity.User;
import com.qn.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class ServiceHystrixImpl implements UserService {
    @Override
    public User getUser(Long id) {
        return new User(12345l);
    }
}
