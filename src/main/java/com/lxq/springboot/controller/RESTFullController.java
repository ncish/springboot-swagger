package com.lxq.springboot.controller;

import com.lxq.springboot.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTFullController {

    //http://localhost:9500/springboot-web/boot/user/106
    @RequestMapping("/boot/user/{id}")
    public Object user(@PathVariable("id") Integer id){

        User user = new User();
        user.setId(id);
        user.setName("张无忌");

        return user;
    }

    //http://localhost:9500/springboot-web/boot/user/106/zhangsan
    @RequestMapping("/boot/user/{id}/{name}")
    public Object user (@PathVariable("id") Integer id,@PathVariable("name") String name){

        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }

    //http://localhost:9500/springboot-web/boot/zhangsan/user/106
    @RequestMapping("/boot/{name}/user/{id}")
    public Object user2 (@PathVariable("id") Integer id,@PathVariable("name") String name){

        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }
}
