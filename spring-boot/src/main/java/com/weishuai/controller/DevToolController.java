package com.weishuai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 热部署（无效）
 * Created by WS on 2018/9/7.
 */
@RestController
public class DevToolController {

    @GetMapping(value = "/devTool")
    public String devIndex(){
        return "first";
    }

    @GetMapping(value = "/devToolIndex")
    public String devToolIndex(){
        return "second";
    }
}
