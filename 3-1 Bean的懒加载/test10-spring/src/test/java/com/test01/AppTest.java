package com.test01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml01.xml");
        System.out.println("context被加载了");
        Bean01 bean01 = context.getBean("bean01", Bean01.class);
    }
}
