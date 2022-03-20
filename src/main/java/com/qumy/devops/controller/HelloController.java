package com.qumy.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @since 2022/3/20 20:27
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps!!!";
    }
}
