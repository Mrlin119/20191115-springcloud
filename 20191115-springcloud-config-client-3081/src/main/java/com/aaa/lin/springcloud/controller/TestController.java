package com.aaa.lin.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/15 20:46
 * @Description
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypePackage;

    @RequestMapping("/test")
    public String test() {
        return port + "-----" + driverClassName + "-------" + mybatisTypePackage;
    }
}
