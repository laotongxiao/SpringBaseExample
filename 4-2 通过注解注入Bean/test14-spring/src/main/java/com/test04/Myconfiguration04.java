package com.test04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(value = "com.test04")
public class Myconfiguration04 {
    @Bean
    public List<String> testList04(){
        List<String> list04 = new ArrayList<String>();
        list04.add("a");
        list04.add("b");
        list04.add("c");
        return list04;
    }
}
