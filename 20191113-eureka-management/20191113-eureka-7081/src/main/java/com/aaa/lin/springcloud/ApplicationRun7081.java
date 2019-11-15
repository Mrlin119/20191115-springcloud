package com.aaa.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 20:45
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7081.class,args);
    }
}
