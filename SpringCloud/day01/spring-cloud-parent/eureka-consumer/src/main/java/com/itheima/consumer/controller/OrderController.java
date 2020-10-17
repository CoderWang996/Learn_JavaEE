package com.itheima.consumer.controller;

import com.itheima.consumer.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    private DiscoveryClient discoveryClient;

    @GetMapping("/findProductById")
    public Product findProductById() {
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");
        if (instances == null || instances.size() == 0) {
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String ip = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String url = "http://" + ip + ":" + port + "/product/findById";
        Product product = restTemplate.getForObject(url, Product.class);
        return product;
    }

    @GetMapping("/findAllProduct")
    public List<Product> findAllProduct() {
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");
        if (instances == null || instances.size() == 0) {
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String ip = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String url = "http://" + ip + ":" + port + "/product/findAll";
        List<Product> products = restTemplate.getForObject(url, List.class);
        return products;
    }
}