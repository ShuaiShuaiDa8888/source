package com.weishuai.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by WS on 2028/9/2.
 */
@Configuration   //注册到springboot容器
@MapperScan(basePackages = "com.weishuai.test02", sqlSessionFactoryRef = "secondSqlSessionFactory")
public class DataSource2 {

    /**
     * 配置springboot_datasource2数据库
     */
    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.springbootdatasource2")
    public DataSource test02DataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 配置springboot_datasource2 sql会话工厂
     * @param dataSource
     * @return
     */
    @Bean(name = "secondSqlSessionFactory")
    public SqlSessionFactory test02SqlSessionFactory(@Qualifier("secondDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);

        return bean.getObject();
    }

    /**
     * 配置springboot_datasource2 事务管理
     * @param dataSource
     * @return
     */
    @Bean(name = "secondTransactionManager")
    public DataSourceTransactionManager test02TransactionManager(@Qualifier("secondDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "secondSqlSessionTemplate")
    public SqlSessionTemplate test02SqlSessionTemplate(@Qualifier("secondSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
