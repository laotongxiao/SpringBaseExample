package com.test01;

import com.test02.Bean02;
import com.test03.Bean03;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void test(){
        ApplicationContext context01 = new ClassPathXmlApplicationContext("springxml01.xml");
        ApplicationContext context02 = new ClassPathXmlApplicationContext("springxml02.xml");
        ApplicationContext context03 = new ClassPathXmlApplicationContext("springxml01simple.xml");
        ApplicationContext context04 = new ClassPathXmlApplicationContext("springxml02simple.xml");
        ApplicationContext context05 = new ClassPathXmlApplicationContext("springxmlListMapSetProperties.xml");
        Bean01 bean01 = context01.getBean("bean01", Bean01.class);
        System.out.println("Bean01:" + bean01);
        Bean02 bean02 = context02.getBean("bean02", Bean02.class);
        System.out.println("Bean02:" + bean02);
        Bean01 bean03 = context03.getBean("bean01", Bean01.class);
        System.out.println("Bean01simpe" + bean03);
        Bean02 bean04 = context04.getBean("bean02", Bean02.class);
        System.out.println("Bean02simpe" + bean04);
        System.out.println("List_Map_Set_Properties----------------------");
        Bean03 bean05 = context05.getBean("bean03",Bean03.class);
        System.out.println("List----");
        System.out.println("Bean03List:" + bean05.getOtherBean03List());
        System.out.println("Bean03List:" + bean05.getNam3List());
        System.out.println("Map----");
        System.out.println("Bean03List:" + bean05.getOtherBean03Map());
        System.out.println("Bean03List:" + bean05.getName3Map());
        System.out.println("Set----");
        System.out.println("Bean03List:" + bean05.getOtherBean03Set());
        System.out.println("Bean03List:" + bean05.getName3Set());
        System.out.println("Properties----");
        System.out.println("Bean03List:" + bean05.getOtherBean03Properties());
        System.out.println("Bean03List:" + bean05.getName3Properties());
        System.out.println("OtherBean03Null----");
        System.out.println("OtherBean03Null:" + bean05.getOtherBean03null());
    }

}
