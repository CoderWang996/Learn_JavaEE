package com.itheima.consumer.controller;

import com.itheima.consumer.domain.Product;
import com.itheima.feign.FeignConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FeignConsumer feignConsumer;


    @GetMapping("/findAllProduct")
    public List<Product> findAllProduct() {
        List<Product> products = feignConsumer.findAllProduct();
        return products;
    }
}