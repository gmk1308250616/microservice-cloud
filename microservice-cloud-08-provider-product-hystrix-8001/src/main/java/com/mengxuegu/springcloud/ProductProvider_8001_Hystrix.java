package com.mengxuegu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix  //开启 Hystrix 熔断机制的支持
@SpringBootApplication
//@MapperScan("com.mengxuegu.springcloud.mapper") //扫描包下面所有Mapper接口
@EnableEurekaClient//本服务启动后会自动注册进Eureka服务中
public class ProductProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class,args);
    }
}
