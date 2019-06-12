package com.test01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml.xml");

        //1.通过默认构造方法实例化Bean
        //正常用java代码写法
        //Bean01 bean011 = new Bean01();
        Bean01 bean01 = context.getBean("test01Bean", Bean01.class);
        System.out.println("Bean01:" + bean01);

        //2.通过默认构造方法实例化Bean
        //正常用java代码写法
        //Bean02 bean02 = Bean02Factory02.getBean02();
        Bean02 bean02 = context.getBean("test02Bean", Bean02.class);
        System.out.println("Bean02:" + bean02);

        //3.通过实例工厂方法实例化Bean
        //正常用java代码写法
        //Bean03Factory03 factory03 = new Bean03Factory03();
        //Bean03 bean03 = factory03.getBean03();
        Bean03 bean03 = context.getBean("test03Bean", Bean03.class);
        System.out.println("Bean03:" + bean03);

        //4.Bean的别名
        //正常用java代码写法
        //Bean04 bean04 = new Bean04();
        Bean04 bean04_1 = context.getBean("beanA1", Bean04.class);
        System.out.println("Bean04:" + bean04_1);
        Bean04 bean04_2 = context.getBean("beanA2", Bean04.class);
        System.out.println("Bean04:" + bean04_2);
        Bean04 bean04_3 = context.getBean("beanA3", Bean04.class);
        System.out.println("Bean04:" + bean04_3);

    }
}
