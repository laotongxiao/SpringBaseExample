package com.test02;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.test02")
public class MyConfiguration02 {
    @Bean
    public static CustomScopeConfigurer testCustomScopeConfigurer(){
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.addScope("myScope01", new MyScope01());
        return customScopeConfigurer;
    }


}
