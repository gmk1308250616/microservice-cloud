package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
@Mapper
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
