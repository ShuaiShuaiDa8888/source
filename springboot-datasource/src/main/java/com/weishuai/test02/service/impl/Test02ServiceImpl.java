package com.weishuai.test02.service.impl;

import com.weishuai.test02.mapper.Test02Mapper;
import com.weishuai.test02.service.Test02Service;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by WS on 2018/9/1.
 */
@Service
@MapperScan(basePackages = "com.weishuai.test02.mapper")
public class Test02ServiceImpl implements Test02Service {
    @Autowired
    private Test02Mapper test02Mapper;

    @Override
    public int add02(Byte sex) {
        return test02Mapper.add(sex);
    }
}
