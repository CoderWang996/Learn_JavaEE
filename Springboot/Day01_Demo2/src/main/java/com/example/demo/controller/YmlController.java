package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlController {
    //获取普通配置
    @Value("${name}")
    private String name;
    //获取对象属性
    @Value("${person2.name}")
    private String name2;
    //获取数组
    @Value("${address1[1]}")
    private String address1;
    //获取纯量
    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;
    @RequestMapping("/yml")
    public String ymlDemo(){
        return "name="+name2+",address="+address1+",msg1="+msg1+",msg2="+msg2;
    }
}
