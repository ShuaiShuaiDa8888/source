package com.weishuai.mapper;

import com.weishuai.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by WS on 2018/9/1.
 */
public interface UserMapper {

    @Select("select * from `user` where id = #{id}")
    User getUser(@Param("id") int id);
}
