package com.qn.service.impl;

import com.qn.entity.User;
import com.qn.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class ServiceHystrixImpl implements UserService {
    @Override
    public User getUser2(Long id) {
        return new User(12345l);
    }
}
