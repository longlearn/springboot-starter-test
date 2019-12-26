package com.czl.springbootstartertest.contronller;

import com.czl.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:HelloContronller
 * Package:com.czl.contronller
 * Description:
 *
 * @date:2019-12-25 18:31
 * @autor:18855032359
 */
@Controller
public class HelloContronller {
    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String hello() {
//        return helloService.sayHello("苟鹏哈哈");

        return "hello";
    }
}
