package com.test01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml01.xml");
        for(int i =0 ; i < 10; i++){
            Bean01 bean01 = context.getBean("bean01", Bean01.class);
            System.out.println(bean01);
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < 10; i++){
            Bean01 bean02 = context.getBean("bean02", Bean01.class);
            System.out.println(bean02);
        }
        System.out.println("three-------------------");
        for(int i =0 ; i < 10; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Bean01 bean03 = context.getBean("bean02", Bean01.class);
                    System.out.println(bean03);
                }
            }).start();
        }
    }
}
