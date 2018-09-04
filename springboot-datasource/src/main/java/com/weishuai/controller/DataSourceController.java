package com.weishuai.controller;

import com.weishuai.test01.service.Test01Service;
import com.weishuai.test01.service.impl.Test01ServiceImpl;
import com.weishuai.test02.service.Test02Service;
import com.weishuai.test02.service.impl.Test02ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot整合多数据源（失败）
 * Created by WS on 2018/9/1.
 */
@RestController
@ComponentScan(basePackages = {"com.weishuai.test01.service.impl", "com.weishuai.test02.service.impl"})
public class DataSourceController {
    @Autowired
    private Test01ServiceImpl test01Service;
    @Autowired
    private Test02ServiceImpl test02Service;

    @RequestMapping("/addDataSource01")
    public String add01(){
        test01Service.add01("赵四");

        return "add01 success";
    }

    @RequestMapping("/addDataSource02")
    public String add02(){
        test02Service.add02((byte) 1);

        return "add02 success";
    }
}
