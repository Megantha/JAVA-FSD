package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello!!! Welcome to Java World";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello!! This World was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello World .This message is from admin";
    }

}