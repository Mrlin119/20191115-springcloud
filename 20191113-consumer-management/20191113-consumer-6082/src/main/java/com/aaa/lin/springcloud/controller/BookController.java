package com.aaa.lin.springcloud.controller;

import com.aaa.lin.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 23:04
 * @Description
 */
@RestController
public class BookController {

    private static final String URL = "http://BOOK-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/all")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject(URL +"all",List.class);
    }

    @RequestMapping("/allBook")
    public List<Book> selectAll(){
        //通过loadBalancerClient对象获取到所有的服务提供者的信息
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");
        // 获取server的ip地址
        String host = serviceInstance.getHost();
        // 获取server的端口号
        int port = serviceInstance.getPort();
        System.out.println(host);
        System.out.println(port);
        // ip + port + requestMapping的路径
        return restTemplate.getForObject("http://"+host + ":" + port + "/all",List.class);

    }

}
