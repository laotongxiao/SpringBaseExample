package com.test05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(value = "com.test05")
public class MyConfiguration05 {
    @Bean(value = "list05")
    public List<String> testlist05(){
        List<String> list05 = new ArrayList<String>();
        list05.add("a05");
        list05.add("b05");
        list05.add("c05");
        return list05;
    }
}
