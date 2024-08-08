package com.ankers.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.ankers.dao", "com.ankers.service", "com.ankers.exception", "com.ankers.interceptor"})
// 扫描所有，排除 Controller 这个
//@ComponentScan(value = "com.ankers", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
@PropertySource("classpath:jdbc.properties")
@Import({ JdbcConfig.class, MybatisConfig.class })
@EnableTransactionManagement // 开启事务
public class SpringConfig {


}
