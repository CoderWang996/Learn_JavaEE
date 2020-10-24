package com.itheima.provider.service;

import com.itheima.provider.dao.ProductDao;
import com.itheima.provider.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById() {
        return productDao.findById();
    }
}
