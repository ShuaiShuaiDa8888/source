package com.weishuai.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常
 * Created by WS on 2018/8/31.
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandle(){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 500);
        resultMap.put("msg", "亲，淘宝错误。。。");

        return resultMap;
    }
}
