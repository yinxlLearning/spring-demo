package com.yinxl.learning.springdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SpringJob {
    @Scheduled(fixedRate = 1000)
    public void job1(){
        log.info("time=");
    }
}
