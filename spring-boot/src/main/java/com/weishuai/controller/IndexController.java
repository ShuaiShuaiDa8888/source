package com.weishuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 渲染web页面
 * Created by WS on 2018/8/31.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map){
        map.addAttribute("name", "魏帅");

        return "index";
    }
}
