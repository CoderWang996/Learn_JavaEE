package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//数据源相关配置
//读取数据源文件
@PropertySource("classpath:dataSource.properties")
public class DatabaseConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    //配置数据源
    @Bean("dataSource")
    public DataSource getDataSource(){
        //创建德鲁伊连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        //数据库连接四大基本特征
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        //返回数据源
        return dataSource;
    }
}
