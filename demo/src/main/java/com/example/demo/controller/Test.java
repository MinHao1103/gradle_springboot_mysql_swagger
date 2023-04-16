package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    // 使用 SpringBoot 直接啟動的路徑：http://localhost:8080/test
    @GetMapping("/test")
    public String sayHello() {
        return "Hello, World!";
    }
}
