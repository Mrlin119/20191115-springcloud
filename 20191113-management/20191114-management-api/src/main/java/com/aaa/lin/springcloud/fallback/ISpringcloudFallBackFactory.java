package com.aaa.lin.springcloud.fallback;

import com.aaa.lin.springcloud.model.Book;
import com.aaa.lin.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Company
 * @Author Mr.Lin
 * @Data Create in 2019/11/14 22:05
 * @Description
 */
@Component
public class ISpringcloudFallBackFactory implements FallbackFactory<ISpringcloudService> {

    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<Book> selectAllBooks() {
                System.out.println("我是测试熔断的方法，我被访问了，ISpringCloudService接口中的selectAllBooks方法抛出异常！");
                return null;
            }
        };
    }
}
