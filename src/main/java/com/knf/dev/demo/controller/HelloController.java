package com.knf.dev.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getMessage()
    {
        return "Hello World! Rahul Prudhvi Rahul";
    }
}
