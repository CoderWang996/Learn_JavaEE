package com.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//处理mybatis核心配置类
public class MybatisConfig {
    //创建一个SqlSessionFactoryBean对象并存入IOC容器中
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Qualifier("dataSource")DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
       //注入数据源
        bean.setDataSource(dataSource);
        //起别名
        bean.setTypeAliasesPackage("com/domain");
        return bean;
    }
    //创建一个方法获取MapperScannerConfigurer对象并将方法获取的对象存入IOC容器
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        //指定需要创建Mapper代理对象的接口的基础包
        configurer.setBasePackage("com/mapper");
        return configurer;
    }

}
