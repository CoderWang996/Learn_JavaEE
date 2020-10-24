package com.itheima.provider.controller;

import com.itheima.provider.domain.Product;
import com.itheima.provider.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Value("${name}")
    private String name;
    @RequestMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }
    @RequestMapping("/findById")
    public Product findById(){
        return productService.findById();
    }
    @RequestMapping("/test")
    public String test(){
        return name;
    }
}
