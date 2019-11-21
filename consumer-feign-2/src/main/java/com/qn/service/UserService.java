package com.qn.service;

import com.qn.entity.User;
import com.qn.service.impl.ServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 **/
@FeignClient(value ="PROVIDER-USER-2",fallback = ServiceHystrixImpl.class)
public interface UserService {
    @GetMapping("/user/{id}")
    User getUser2(@PathVariable Long id);
}
