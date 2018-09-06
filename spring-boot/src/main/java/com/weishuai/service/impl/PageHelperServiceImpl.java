package com.weishuai.service.impl;

import com.weishuai.mapper.UserMapper;
import com.weishuai.pojo.User;
import com.weishuai.service.PageHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WS on 2018/9/6.
 */
@Service
public class PageHelperServiceImpl implements PageHelperService {
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public PageInfo<User> findUser(int page, int pageSize) {
//        PageHelper.startPage(page, pageSize);
//        List<User> userList = userMapper.findUser();
//        PageInfo<User> userPageInfo = new PageInfo<>(userList);
//        return userPageInfo;
//    }
}
