package com.mengxuegu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
//@MapperScan("com.mengxuegu.springcloud")
public class ProductProvider_Config_8052 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8052.class,args);
    }
}
