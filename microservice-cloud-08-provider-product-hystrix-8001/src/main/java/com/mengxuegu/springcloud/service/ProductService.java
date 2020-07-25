package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductService {

    Product get(Long id);
}
