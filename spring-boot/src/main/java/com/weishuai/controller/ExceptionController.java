package com.weishuai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产生异常类
 * Created by WS on 2018/8/31.
 */
@RestController
public class ExceptionController {

    @RequestMapping(value = "/exception")
    public String exception(){
        int i = 1 / 0;
        return String.valueOf(i);
    }
}
