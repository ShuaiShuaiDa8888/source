package com.weishuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 渲染web页面
 * Created by WS on 2018/8/31.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "魏帅");
//        map.put("sex", 0);//0:男，1:女
        map.addAttribute("sex", 0);
        List<String> userList = new ArrayList<>();
        userList.add("张三");
        userList.add("李四");
        userList.add("王五");
        userList.add("马六");
        map.addAttribute("userList", userList);

        return "index";
    }

    /**
     * 是程序产生堆溢出（查看配置文件可知最大堆内存为750m）
     *
     * @param args
     */
//    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            Byte[] bytes = new Byte[1024 * 1024];
//            list.add(bytes);
//        }
//        System.out.println("添加成功。。。");
//    }
}
