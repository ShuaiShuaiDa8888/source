package com.weishuai.controller;

import com.github.pagehelper.PageInfo;
import com.weishuai.pojo.User;
import com.weishuai.service.PageHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot集成Mybatis分页插件pageHelper
 *
 * Created by WS on 2018/9/6.
 */
@RestController
public class PageHelperController {
    @Autowired
    private PageHelperService pageHelperService;

    /**
     * springboot集成Mybatis分页插件pageHelper(有问题，不能分页)
     *
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/pageHelper")
    public PageInfo<User> findUser(int page, int pageSize){
        PageInfo<User> pageInfoUser =  pageHelperService.findUser(page, pageSize);

        return pageInfoUser;
    }
}
