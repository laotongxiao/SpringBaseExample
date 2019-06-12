package com.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.test03")
public class MyConfiguration03 {
    @Bean(initMethod = "onInit", destroyMethod = "onDestroy")
    public Bean03 testBean03(){
        return new Bean03();
    }
}
