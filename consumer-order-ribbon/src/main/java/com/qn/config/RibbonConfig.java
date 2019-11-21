package com.qn.config;

import com.qn.ribbon.RibbonConfigration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;

/*@RibbonClient(name = "PROVIDER-USER", configuration = RibbonConfigration.class)
@Component*/
public class RibbonConfig {
}
