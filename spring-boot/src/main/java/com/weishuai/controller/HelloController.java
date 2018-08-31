package com.weishuai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WS on 2018/8/31.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello2")
    public String hello2(){
        return "hello2";
    }
}
