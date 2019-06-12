package com.test01;

import com.test02.Bean02;
import com.test02.MyConfiguration02;
import com.test03.Bean03;
import com.test03.MyConfiguration03;
import com.test04.Bean04;
import com.test05.Bean05;
import com.test05.MyConfiguration05;
import com.test04.Myconfiguration04;
import com.test06.Bean06;
import com.test06.MyConfiguration06;
import com.test07.Bean07;
import com.test07.MyConfiguration07;
import com.test08.Bean08;
import com.test08.MyConfiguration08;
import com.test09.Bean09;
import com.test09.MyConfiguration09;
import com.test10.Bean10;
import com.test10.MyConfiguration10;
import com.test11.Bean11;
import com.test11.MyConfiguration11;
import com.test11.TestOtherBean11;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context01 = new AnnotationConfigApplicationContext(MyConfiguration01.class);
        Bean01 bean01 = context01.getBean("bean01", Bean01.class);
        System.out.println(bean01);
        System.out.println("----------");
        ApplicationContext context02 = new AnnotationConfigApplicationContext(MyConfiguration02.class);
        Bean02 bean02 = context02.getBean("bean02", Bean02.class);
        System.out.println(bean02);
        System.out.println("----------");
        ApplicationContext context03 = new AnnotationConfigApplicationContext(MyConfiguration03.class);
        Bean03 bean03 = context03.getBean("bean03", Bean03.class);
        System.out.println(bean03);
        System.out.println("----------");
        ApplicationContext context04 = new AnnotationConfigApplicationContext(Myconfiguration04.class);
        Bean04 bean04 = context04.getBean("bean04", Bean04.class);
        System.out.println(bean04);
        for (String s : bean04.getList04()) {
            System.out.println("listS = " + s);
        }
        System.out.println("----------");
        ApplicationContext context05 = new AnnotationConfigApplicationContext(MyConfiguration05.class);
        Bean05 bean05 = context05.getBean("bean05", Bean05.class);
        System.out.println(bean05);
        System.out.println("----------");
        ApplicationContext context06 = new AnnotationConfigApplicationContext(MyConfiguration06.class);
        Bean06 bean06 = context06.getBean("bean06", Bean06.class);
        System.out.println(bean06);
        System.out.println("----------");
        ApplicationContext context07 = new AnnotationConfigApplicationContext(MyConfiguration07.class);
        Bean07 bean07 = context07.getBean("bean07", Bean07.class);
        System.out.println(bean07);
        System.out.println("----------");
        ApplicationContext context08 = new AnnotationConfigApplicationContext(MyConfiguration08.class);
        Bean08 bean08 = context08.getBean("bean08", Bean08.class);
        System.out.println(bean08);
        for (Map.Entry<String, Integer> entry : bean08.getMap08().entrySet()) {
            System.out.println("EntryKey = " + entry.getKey() + " " + "EntryValue = " + entry.getValue());
        }
        System.out.println("----------");
        ApplicationContext context09 = new AnnotationConfigApplicationContext(MyConfiguration09.class);
        Bean09 bean09 = context09.getBean("bean09", Bean09.class);
        System.out.println(bean09);
        for (String s : bean09.getSet09()) {
            System.out.println("Sets = " + s);
        }
        System.out.println("----------");
        ApplicationContext context10 = new AnnotationConfigApplicationContext(MyConfiguration10.class);
        Bean10 bean10 = context10.getBean("bean10", Bean10.class);
        System.out.println(bean10);
        System.out.println("----------");
        ApplicationContext context11 = new AnnotationConfigApplicationContext(MyConfiguration11.class);
        Bean11 bean11 = context11.getBean("bean11", Bean11.class);
        TestOtherBean11 testOtherBean11 = bean11.getContextBean11().getBean("testOtherBean11", TestOtherBean11.class);
        System.out.println(testOtherBean11);
    }
}
