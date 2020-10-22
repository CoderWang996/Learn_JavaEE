package com.itheima.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.beans.Transient;

@Configuration
public class RestTemplateConfig {
    @Transient
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
