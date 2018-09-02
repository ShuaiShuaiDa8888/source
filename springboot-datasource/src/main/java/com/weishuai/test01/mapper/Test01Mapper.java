package com.weishuai.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by WS on 2018/9/1.
 */
public interface Test01Mapper {

    @Insert("INSERT INTO `user` (id, NAME) VALUE (NULL, #{name});")
    int add(@Param("name") String name);
}
