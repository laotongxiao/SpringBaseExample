package com.test08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(value = "com.test08")
public class MyConfiguration08 {
    @Bean
    public Map<String, Integer> testMap08(){
        Map<String, Integer> map08 = new HashMap<String, Integer>();
        map08.put("key08_01", 8);
        map08.put("key08_02", 88);
        return map08;
    }
}
