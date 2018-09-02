package com.weishuai.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * spring-boot启动方式 2
 * Created by WS on 2018/8/31.
 */
@ComponentScan(basePackages = "com.weishuai")
@MapperScan(basePackages = "com.weishuai.mapper")
@SpringBootApplication
@EnableAsync //开启异步调用
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
