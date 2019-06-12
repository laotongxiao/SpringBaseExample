package com.test01;

import com.test02.Bean02;
import com.test02.MyConfiguration02;
import com.test03.Bean03;
import com.test03.MyConfiguration03;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration01.class);
        for (int i = 0; i < 10; i++) {
            Bean01 bean01 = context.getBean("bean01", Bean01.class);
            System.out.println(bean01);
        }
        System.out.println("--------");
        for (int i = 0; i < 10; i++) {
            Bean01_02 bean01_02 = context.getBean("bean01_02", Bean01_02.class);
            System.out.println(bean01_02);
        }
        System.out.println("--------");
        ApplicationContext context02 = new AnnotationConfigApplicationContext(MyConfiguration02.class);
        for (int i = 0; i < 10; i++) {
            Bean02 bean02 = context02.getBean("bean02", Bean02.class);
            System.out.println(bean02);
        }
        System.out.println("--------");
        ApplicationContext context03 = new AnnotationConfigApplicationContext(MyConfiguration03.class);
        for (int i = 0; i < 10; i++) {
            Bean03 bean03 = context03.getBean("bean03", Bean03.class);
            bean03.testPrint();
        }




    }
}
