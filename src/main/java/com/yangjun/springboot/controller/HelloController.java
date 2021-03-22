package com.yangjun.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjun6
 * @date 2021-03-22 23:30
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
