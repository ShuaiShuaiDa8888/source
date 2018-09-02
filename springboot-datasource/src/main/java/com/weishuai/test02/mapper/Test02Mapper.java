package com.weishuai.test02.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by WS on 2018/9/1.
 */
public interface Test02Mapper {

    @Insert("INSERT INTO sex (id, sex) VALUE (NULL, #{sex});")
    int add(@Param("sex") Byte sex);
}
