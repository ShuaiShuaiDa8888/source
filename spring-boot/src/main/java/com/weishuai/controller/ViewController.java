package com.weishuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用JSP渲染Web视图(失败)
 * Created by WS on 2018/9/1.
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/view")
    public String toView(){
        return "view";
    }
}
