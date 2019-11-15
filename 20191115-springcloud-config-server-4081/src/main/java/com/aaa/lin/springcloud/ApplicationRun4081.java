package com.aaa.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/15 19:57
 * @Description
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun4081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun4081.class,args);
    }
}
