package com.weishuai.test01.service.impl;

import com.weishuai.test01.mapper.Test01Mapper;
import com.weishuai.test01.service.Test01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WS on 2018/9/1.
 */
@Service
public class Test01ServiceImpl implements Test01Service {
    @Autowired
    private Test01Mapper test01Mapper;

    @Override
    public int add01(String name) {
        return test01Mapper.add(name);
    }
}
