package com.test09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
@ComponentScan(value = "com.test09")
public class MyConfiguration09 {
    @Bean
    public Set<String> testSet09(){
        Set<String> set09 = new HashSet<String>();
        set09.add("aSet");
        set09.add("bSet");
        set09.add("cSet");
        return set09;
    }
}
