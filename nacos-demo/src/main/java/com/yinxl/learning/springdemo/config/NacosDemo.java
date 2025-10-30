package com.yinxl.learning.springdemo.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component
@Slf4j
public class NacosDemo {
    // @Value("${user.name}")
    private String userName;
    // @Value("${user.age}")
    private String userAge;

    @PostConstruct
    public void init() {
        log.info("userName:{},userAge:{}",userName,userAge);
    }
}
