package com.lxq.springboot.controller;

import com.lxq.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 读取自定义配置
 */
@Controller
public class ConfigInfoController {

    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/config")
    public @ResponseBody
    String config(){

        return name + "^_^"+location +"------"+ configInfo.getName()+configInfo.getLocation();
    }
}
