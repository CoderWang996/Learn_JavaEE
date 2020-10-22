package com.itheima.feign;
import com.itheima.consumer.config.FeignLogConfig;
import com.itheima.consumer.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value="eureka-provider",configuration = FeignLogConfig.class)
public interface FeignConsumer {
    @GetMapping("/product/findAll")
    public List<Product> findAllProduct();
}