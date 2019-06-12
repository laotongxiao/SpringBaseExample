package com.test01;

import com.test02.Bean02;
import com.test02.MyConfiguration02;
import com.test03.Bean03;
import com.test03.MyConfiguration03;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppTest {
    @Test
    public void test(){
        AbstractApplicationContext context01 = new AnnotationConfigApplicationContext(MyConfiguration01.class);
        Bean01 bean01 = context01.getBean("bean01", Bean01.class);
        System.out.println(bean01);
        context01.close();
        System.out.println("--------");
        AbstractApplicationContext context02 = new AnnotationConfigApplicationContext(MyConfiguration02.class);
        Bean02 bean02 = context02.getBean("bean02", Bean02.class);
        System.out.println(bean02);
        context02.close();
        System.out.println("--------");
        AbstractApplicationContext context03 = new AnnotationConfigApplicationContext(MyConfiguration03.class);
        Bean03 bean03 = context03.getBean("testBean03", Bean03.class);
        System.out.println(bean03);
        context03.close();
    }
}
