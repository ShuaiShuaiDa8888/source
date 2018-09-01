package com.weishuai.controller;

import com.weishuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot整合JDBC 使用JdbcTemplate
 * Created by WS on 2018/9/1.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/createUser")
    public String createUser(){
        userService.createUser();
        return "add success";
    }
}
