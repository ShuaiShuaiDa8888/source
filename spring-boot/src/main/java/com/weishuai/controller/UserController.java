package com.weishuai.controller;

import com.weishuai.pojo.User;
import com.weishuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot整合JDBC 使用JdbcTemplate
 * springboot整合Mybatis
 * springboot整合事物管理
 * Created by WS on 2018/9/1.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    springboot整合JDBC 使用JdbcTemplate
    @RequestMapping(value = "/createUser")
    public String createUser(){
        userService.createUser();
        return "add success";
    }

//    springboot整合Mybatis
    @RequestMapping(value = "/getUser")
    public User getUser(int id){
        return userService.getUser(id);
    }

//    springboot整合事物管理
    @RequestMapping(value = "/add")
    @Transactional  //此注解集成了事务  有效范围是此方法及所调用的所有下级方法
    public String addUser(String name){
        userService.add(name);
        return "add success";
    }
}
