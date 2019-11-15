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
 * @Data Create in 2019/11/14 22:13
 * @Description
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllBooksFallBack")
    public List<Book> selectAllBooks() throws Exception {
        List<Book> bookList = bookService.selectAll();
        if(bookList.size() > 0) {
            throw new Exception("模拟异常，测试熔断处理！");
        }
        return bookList;
    }

    /*public List<Book> selectAllBooksFallBack() {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book();
        book.setId(100000000L);
        book.setBookName("测试熔断-->图书名称");
        book.setBookPrice(123.23);
        bookList.add(book);
        return bookList;
    }*/
}
