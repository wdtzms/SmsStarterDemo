package com.example.startdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!!!";

    }
}
