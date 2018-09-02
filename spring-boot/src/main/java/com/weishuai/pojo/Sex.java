package com.weishuai.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Spring Boot集成lombok让代码更简洁
 * Created by WS on 2018/9/2.
 */
@Slf4j
@Data
public class Sex {

    private Integer id;
    private String sex;

    @Override
    public String toString() {
        return "Sex [id=" + id + ", sex=" + sex + "]";
    }

    public static void main(String[] args) {
        Sex sex = new Sex();
        sex.setId(20);
        sex.setSex("男");
        log.info(sex.toString());
    }
}
