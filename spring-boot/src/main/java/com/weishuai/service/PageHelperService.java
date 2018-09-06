package com.weishuai.service;

import com.github.pagehelper.PageInfo;
import com.weishuai.pojo.User;

/**
 * Created by WS on 2018/9/6.
 */
public interface PageHelperService {

    PageInfo<User> findUser(int page, int pageSize);
}
