package com.ankers.config;

import com.ankers.interceptor.MyInterceptor01;
import com.ankers.interceptor.MyInterceptor02;
import com.ankers.interceptor.MyInterceptor03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class SpringWebSupport implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor01 myInterceptor01;

    @Autowired
    private MyInterceptor02 myInterceptor02;

    @Autowired
    private MyInterceptor03 myInterceptor03;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/");
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }

    // 配置拦截器

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor01).addPathPatterns("/books");

        registry.addInterceptor(myInterceptor02).addPathPatterns("/books");

        registry.addInterceptor(myInterceptor03).addPathPatterns("/books");
    }
}
