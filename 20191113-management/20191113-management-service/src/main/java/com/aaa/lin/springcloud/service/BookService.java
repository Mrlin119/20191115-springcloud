package com.aaa.lin.springcloud.service;

import com.aaa.lin.springcloud.mapper.BookMapper;
import com.aaa.lin.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/13 20:18
 * @Description
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有的书籍信息
     * @return
     */
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }

}
