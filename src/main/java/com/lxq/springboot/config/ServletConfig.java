package com.lxq.springboot.config;

import com.lxq.springboot.filter.HeFilter;
import com.lxq.springboot.servlet.HeServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * springboot没有xml，@Configuration 可以表示一个spring的xml配置文件
 * 比如：applicationContext.xml
 */
@Configuration
public class ServletConfig {
    /**
     * 相当于
     * <bean id="heServletRegistrationBean" class="org.springframework.boot.web.servlet.ServletRegistrationBean">
     *
     * </bean>
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean heServletRegistrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HeServlet(),"/heServlet");
        return registrationBean;
    }

    /**
     * 相当于
     * <bean id="heFilterRegistration" class="org.springframework.boot.web.servlet.FilterRegistrationBean">
     *
     * </bean>
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean heFilterRegistration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new HeFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    /**
     * 字符编码
     * 相当于 web.xml 配置CharacterEncodingFilter
     * @return
     */
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//
//        characterEncodingFilter.setForceEncoding(true); //true为强制编码
//        characterEncodingFilter.setEncoding("UTF-8");
//
//        registrationBean.setFilter(characterEncodingFilter);
//        registrationBean.addUrlPatterns("/*"); //拦截所有路径
//
//        return registrationBean;
//    }
}
