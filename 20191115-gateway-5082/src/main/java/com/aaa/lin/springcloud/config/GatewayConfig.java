package com.aaa.lin.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/15 17:15
 * @Description
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("baidu-route",
                        p -> p.path("/baidu").
                                filters(f -> f.addRequestHeader("name", "zhangsan"))
                                .uri("http://www.baidu.com"))
                .route("baidu-route2",
                        p -> p.path("/baidu2").
                                filters(f -> f.addRequestParameter("name", "lisi"))
                                .uri("http://www.jd.com"))
                .route("baidu-route2",
                        p -> p.path("/123").
                                filters(f -> f.rewritePath("/all", "/allBooks"))
                                .uri("http://localhost/127.0.0.1/本机ip都不行:5081")).build();
    }
}
