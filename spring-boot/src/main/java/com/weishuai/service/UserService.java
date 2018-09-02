package com.weishuai.service;

import com.weishuai.pojo.User;

/**
 * Created by WS on 2018/9/1.
 */
public interface UserService {
    void createUser();

    void add(String name);

    User getUser(int id);
}
