package com.aaa.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/14 22:00
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.aaa.lin.springcloud")
public class ApplicationRun6083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6083.class,args);
    }
}
