package com.aaa.lin.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 20:25
 * @Description
 */
@SpringBootApplication
@MapperScan("com.aaa.lin.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class,args);
    }
}
