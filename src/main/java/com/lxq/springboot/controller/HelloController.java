package com.lxq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/boot/hello")
    //@ResponseBody 如果是对象的时候返回json,如果是字符串返回字符串
    public @ResponseBody
    String hello(){
        return "Hello Spring Boot";

    }
}
