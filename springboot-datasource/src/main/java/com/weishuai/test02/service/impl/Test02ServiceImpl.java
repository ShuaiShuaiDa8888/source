package com.weishuai.test02.service.impl;

import com.weishuai.test02.mapper.Test02Mapper;
import com.weishuai.test02.service.Test02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WS on 2018/9/1.
 */
@Service
public class Test02ServiceImpl implements Test02Service {
    @Autowired
    private Test02Mapper test02Mapper;

    @Override
    public int add02(Byte sex) {
        return test02Mapper.add(sex);
    }
}
