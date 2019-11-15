package com.aaa.lin.springcloud;

import com.aaa.lin.ribbon.RibbonRuleMine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 22:57
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
// @RibbonClient(name = "BOOK-PROVIDER",configuration = RibbonRuleMine.class)
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}
