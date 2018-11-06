package com.kaorou.spring2;

import org.springframework.stereotype.Service;

@Service("service")
public class ServiceTest {

    //@PostConstruct
    public void init() {
        System.out.println("service初始化...");
    }

    public void service() {
        System.out.println("service服务中...");
    }

    //@PreDestroy
    public void destory() {
        System.out.println("service销毁了...");
    }
}
