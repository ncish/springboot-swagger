package com.lxq.springboot.controller;

import com.lxq.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//此注解为返回字符串或者json
@RestController  //@RestController = @Controller + @ResponseBody
public class MVCController {
    @RequestMapping("/boot/getUser")
    public Object getUser(){
        User user = new User();
        user.setId(100);
        user.setName("张三丰");
        return user;
    }

    /**
     * @GetMapping 只支持GET请求 @GetMapping = @RequestMapping + RequestMethod.GET
     * @return
     */
    @GetMapping("/boot/getUser1")
    public Object getUser1(){
        User user = new User();
        user.setId(100);
        user.setName("张三丰1");
        return user;
    }

    /**
     * @PostMapping 只支持POST请求 @PostMapping = @RequestMapping + RequestMethod.POST
     * @return      浏览器无法访问，提示405
     */
    @PostMapping("/boot/getUser2")
    public Object getUser2(){
        User user = new User();
        user.setId(100);
        user.setName("张三丰2");
        return user;
    }
}
