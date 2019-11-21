package com.qn.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/*@SpringBootConfiguration*/
public class RibbonConfigration {
    /**
     * 设置负载均衡策略为 随机，默认是轮训
     *
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
