package com.aaa.lin.spirngcloud.controller;

import com.aaa.lin.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 20:40
 * @Description
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/all")
    public List<Book> selectAll(){
        return restTemplate.getForObject("http://localhost:8081/all",List.class);
    }

}
