package com.weishuai.controller;

import com.weishuai.test01.service.Test01Service;
import com.weishuai.test01.service.impl.Test01ServiceImpl;
import com.weishuai.test02.service.Test02Service;
import com.weishuai.test02.service.impl.Test02ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot整合多数据源（失败）
 * Created by WS on 2018/9/1.
 */
@RestController
public class DataSourceController {
    @Autowired
    private Test01ServiceImpl test01Service;
    @Autowired
    private Test02ServiceImpl test02Service;

    @RequestMapping("/addDataSource")
    public String add(){
        test01Service.add01("赵四");
        test02Service.add02((byte) 1);

        return "add success";
    }
}
