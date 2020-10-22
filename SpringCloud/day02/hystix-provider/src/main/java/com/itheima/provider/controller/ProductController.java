package com.itheima.provider.controller;

import com.itheima.provider.domain.Product;
import com.itheima.provider.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll")
    @HystrixCommand(fallbackMethod = "fallback_TEST",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public List<Product> findAll(){
        int i=3/0;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return productService.findAll();
    }
    @RequestMapping("/findById")
    public Product findById(){
        return productService.findById();
    }

    //定义降级方法
    public List<Product> fallback_TEST(){
        List<Product> list = new ArrayList<>();
        Product product = new Product();
        product.setProductName("出错了，降级了!!!!");
        list.add(product);
        return list;
    }
}
