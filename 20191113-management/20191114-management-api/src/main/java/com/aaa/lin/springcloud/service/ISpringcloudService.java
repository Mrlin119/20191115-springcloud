package com.aaa.lin.springcloud.service;

import com.aaa.lin.springcloud.fallback.ISpringcloudFallBackFactory;
import com.aaa.lin.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/14 22:04
 * @Description
 */
@FeignClient(value = "BOOK-PROVIDER",fallbackFactory = ISpringcloudFallBackFactory.class)
public interface ISpringcloudService {
    @RequestMapping("/all")
    List<Book> selectAllBooks();
}
