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
 * springboot整合多数据源
 * Created by WS on 2018/9/1.
 */
@Configuration   //注册到springboot容器
@MapperScan(basePackages = "com.weishuai.test01", sqlSessionFactoryRef = "firstSqlSessionFactory")
public class DataSource1 {

    /**
     * 配置springbootDatasource1数据库
     */
    @Bean(name = "firstDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.springbootdatasource1")
    public DataSource test01DataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 配置springbootDatasource1 sql会话工厂
     * @param dataSource
     * @return
     */
    @Bean(name = "firstSqlSessionFactory")
    public SqlSessionFactory test01SqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);

        return bean.getObject();
    }

    /**
     * 配置springbootDatasource1 事务管理
     * @param dataSource
     * @return
     */
    @Bean(name = "firstTransactionManager")
    public DataSourceTransactionManager test01TransactionManager(@Qualifier("firstDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "firstSqlSessionTemplate")
    public SqlSessionTemplate test01SqlSessionTemplate(@Qualifier("firstSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
