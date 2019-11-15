package com.aaa.lin.spirngcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 22:21
 * @Description
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }
}
