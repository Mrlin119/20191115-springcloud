package com.aaa.lin.springcloud.controller;

import com.aaa.lin.springcloud.model.Book;
import com.aaa.lin.springcloud.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/14 22:53
 * @Description
 */
@RestController
public class BookController {
    @Autowired
    private ISpringcloudService springcloudService;
    @RequestMapping("all")
    public List<Book> selectAllBooks(){
        return springcloudService.selectAllBooks();
    }

}
