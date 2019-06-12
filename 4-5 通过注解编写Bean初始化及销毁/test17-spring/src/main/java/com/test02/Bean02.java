package com.test02;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/**
 * Bean 初始化及销毁第2种方法
 */
@Component
public class Bean02 {
    @PostConstruct
    public void onInit(){
        System.out.println("Bean02 init");
    }
    @PreDestroy
    public void onDestroy(){
        System.out.println("Bean02 Destroy");
    }
}
