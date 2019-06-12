package com.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 第1种注解--单个注解
 */
@Configuration
public class MyConfiguration {
    @Bean(value = "beanId01")
    public Bean01 test01(){
        return new Bean01();
    }
}
