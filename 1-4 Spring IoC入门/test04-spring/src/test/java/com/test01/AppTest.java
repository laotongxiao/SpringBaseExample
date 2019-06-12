package com.test01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("test01BeanXml.xml");
        Test01Bean bean01 = context.getBean("testBean", Test01Bean.class);
        System.out.println(bean01);
    }
}
