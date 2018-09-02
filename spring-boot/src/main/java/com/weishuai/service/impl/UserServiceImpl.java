package com.weishuai.service.impl;

import com.weishuai.mapper.UserMapper;
import com.weishuai.pojo.User;
import com.weishuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by WS on 2018/9/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(){
        System.out.println("==========");
        jdbcTemplate.update("INSERT INTO `user` (id, NAME ) VALUE (null, ?)", "zhanglong");
    }

    @Override
    public void add(String name) {
        userMapper.addUser(name);
        int i = 1 / 0;
    }

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }
}
