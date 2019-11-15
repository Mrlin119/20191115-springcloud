package com.aaa.lin.spirngcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 20:39
 * @Description
 */
@Configuration
public class RestFulTemplates {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
