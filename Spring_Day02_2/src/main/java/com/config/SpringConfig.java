package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
@ComponentScan("com")
@Import({DatabaseConfig.class,MybatisConfig.class})
public class SpringConfig {

}
