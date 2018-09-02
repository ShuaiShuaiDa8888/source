package com.weishuai.service.impl;

import com.weishuai.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by WS on 2018/9/3.
 */
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async
    public String getStringVal() {
        log.info("2");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }

        log.info("3");
        return "weishuai";
    }
}
