package com.aaa.lin.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 23:13
 * @Description
 */
@SpringBootApplication
@MapperScan("com.aaa.lin.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class,args);
    }
}
