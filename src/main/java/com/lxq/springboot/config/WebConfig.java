package com.lxq.springboot.config;

import com.lxq.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //需要拦截的路径
        String[] addPathPatterns = {
                "/boot/**"
        };

        //不拦截的路径
        String[] excludePathPatterns={
                "/boot/hello",
                "/boot/index"
        };
        //注册登录拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);

        //如果注册多个拦截器就添加多行 比如权限连接器
        //registry.addInterceptor(new QuanXian()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);

    }

}
