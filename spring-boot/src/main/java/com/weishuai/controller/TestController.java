package com.weishuai.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-boot启动方式 1(打开注释)
 * Created by WS on 2018/8/31.
 */
@RestController
//@EnableAutoConfiguration
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(com.weishuai.controller.TestController.class, args);
//    }
}
