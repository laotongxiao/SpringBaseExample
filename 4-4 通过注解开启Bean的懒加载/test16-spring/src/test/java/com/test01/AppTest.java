package com.test01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration01.class);
        System.out.println("Context init");
        Bean01 bean01 = context.getBean("bean01", Bean01.class);
        System.out.println(bean01);
    }
}
