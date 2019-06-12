package com.test06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(value = "com.test06")
public class MyConfiguration06 {
    @Bean
    @Order(66)
    public String testString01(){
        return "string01";
    }

    @Bean
    @Order(33)
    public String testString02(){
        return "string02";
    }
}
