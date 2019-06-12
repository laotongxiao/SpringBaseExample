package com.test01;

import com.test02.Bean01_a;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springxml01.xml");
        Bean01 bean01_01 = context.getBean("bean01", Bean01.class);
        Bean01 bean01_02 = context.getBean("bean01", Bean01.class);
        Bean02 bean02_01 = context.getBean("bean02",Bean02.class);
        Bean02 bean02_02 = context.getBean("bean02",Bean02.class);
        //01.bean01,bean02都为单例作用域  bean同一实例(即同一对象)
        System.out.println("bean01_01:" + bean01_01);
        System.out.println("bean01_02:" + bean01_02);
        System.out.println("bean02_01:" + bean02_01);
        System.out.println("bean02_02:" + bean02_02);

        Bean01 bean01_03 = context.getBean("bean01_02", Bean01.class);
        Bean01 bean01_04 = context.getBean("bean01_02", Bean01.class);
        Bean02 bean02_03 = context.getBean("bean02_02",Bean02.class);
        Bean02 bean02_04 = context.getBean("bean02_02",Bean02.class);
        //02.bean01为单例,bean02都为多例作用域  bean01为同一实例,bean02为不同实例
        System.out.println("bean01_03:" + bean01_03);
        System.out.println("bean01_04:" + bean01_04);
        System.out.println("bean02_03:" + bean02_03);
        System.out.println("bean02_04:" + bean02_04);

        Bean01 bean01_05 = context.getBean("bean01_03", Bean01.class);
        Bean01 bean01_06 = context.getBean("bean01_03", Bean01.class);
        Bean02 bean02_05 = context.getBean("bean02_03",Bean02.class);
        Bean02 bean02_06 = context.getBean("bean02_03",Bean02.class);
        //03.bean01为多例,bean02都为单例作用域  bean01为同一实例,bean02为同一实例
        System.out.println("bean01_05:" + bean01_05);
        System.out.println("bean01_06:" + bean01_06);
        System.out.println("bean02_05:" + bean02_05);
        System.out.println("bean02_06:" + bean02_06);

        Bean01 bean01_07 = context.getBean("bean01_04", Bean01.class);
        Bean01 bean01_08 = context.getBean("bean01_04", Bean01.class);
        Bean02 bean02_07 = context.getBean("bean02_04",Bean02.class);
        Bean02 bean02_08 = context.getBean("bean02_04",Bean02.class);
        //04.bean01为多例,bean02都为单例作用域  bean01为不同实例,bean02为不同实例
        System.out.println("bean01_07:" + bean01_07);
        System.out.println("bean01_08:" + bean01_08);
        System.out.println("bean02_07:" + bean02_07);
        System.out.println("bean02_08:" + bean02_08);
        System.out.println("------------------------------");
        ApplicationContext context02 = new ClassPathXmlApplicationContext("springxml02.xml");
        Bean01_a bean01_a = context02.getBean("bean01_a", Bean01_a.class);
        bean01_a.printBean01_b();
        bean01_a.printBean01_b();
        bean01_a.printBean01_b();
        bean01_a.printBean01_b();
    }
}
