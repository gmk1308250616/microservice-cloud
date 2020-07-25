package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//会扫描标记了指定包下@FeignClient注解的接口，并生成此接口的代理对象
@EnableFeignClients(basePackages = {"com.mengxuegu.springcloud"})
@EnableDiscoveryClient //标识Eureka客户端
@SpringBootApplication
public class ProductConsumer_80_Fegin {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_Fegin.class,args);
    }
}
