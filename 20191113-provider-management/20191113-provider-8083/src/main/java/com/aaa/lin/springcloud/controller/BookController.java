package com.aaa.lin.springcloud.controller;

import com.aaa.lin.springcloud.model.Book;
import com.aaa.lin.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 20:27
 * @Description
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAll(){
        System.out.println("8083");
        return bookService.selectAll();
    }

}
