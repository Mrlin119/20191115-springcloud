package com.aaa.lin.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/15 18:46
 * @Description
 */
@RestController
public class BookController {
    @RequestMapping("/all")
    public ArrayList<Object> selectAllString(){
        ArrayList<Object> list = new ArrayList<>();
        String str = "123456";
        list.add(str);
        return list;
    }
}
