package com.aaa.lin.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/14 22:11
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.lin.springcloud.mapper")
@EnableCircuitBreaker
public class ApplicationRun8084 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class,args);
    }
}
