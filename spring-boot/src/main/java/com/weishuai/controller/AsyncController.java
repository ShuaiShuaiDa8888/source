package com.weishuai.controller;

import com.weishuai.service.AsyncService;
import com.weishuai.service.impl.AsyncServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * async异步执行方法
 * Created by WS on 2018/9/3.
 */
@RestController
@Slf4j
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping(value = "/async")
    public String async() {
        log.info("1");
        String val = asyncService.getStringVal();
        log.info("4");
        return val;
    }
}
