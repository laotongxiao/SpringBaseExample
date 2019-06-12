package com.test01;

import com.test02.ClassA;
import com.test02.ClassB;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml01.xml");
        Class01 class01 = context.getBean("class01", Class01.class);
        Class02 class02 = context.getBean("class02", Class02.class);
        System.out.println(class01);
        System.out.println(class02);
        System.out.println("------------------------------");
        ClassA classA = context.getBean("classA", ClassA.class);
        ClassB classB = context.getBean("classB", ClassB.class);
        System.out.println(classA);
        System.out.println(classB);
    }
}
