package com.test07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(value = "com.test07")
public class MyConfiguration07 {
    @Bean(value = "list07")
    public List<String> testlist07(){
        List<String> list07 = new ArrayList<String>();
        list07.add("a07");
        list07.add("b07");
        list07.add("c07");
        return list07;
    }
    @Bean
    public String testString01(){
        return "String07";
    }
    @Bean
    public String testString02(){
        return "String08";
    }
}
