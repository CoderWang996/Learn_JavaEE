package com.itheima.feign;

import com.itheima.consumer.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class FeignConsumerFallback implements FeignConsumer {
    @Override
    public List<Product> findAllProduct() {
        List<Product> list=new ArrayList<>();
        Product product = new Product();
        product.setProductName("基于Feign的降级方法执行了。。。");
        list.add(product);
        return list;
    }
}
