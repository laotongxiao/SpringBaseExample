package com.test01;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springxml01.xml");
        Bean01 bean01 = context.getBean("bean01", Bean01.class);
        System.out.println(bean01);
        Bean02 bean02 = context.getBean("bean02", Bean02.class);
        System.out.println(bean02);
        context.close();
    }
}
