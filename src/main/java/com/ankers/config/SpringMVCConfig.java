package com.ankers.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.ankers.controller")
@EnableWebMvc
@Import(SpringWebSupport.class)
public class SpringMVCConfig {

}
