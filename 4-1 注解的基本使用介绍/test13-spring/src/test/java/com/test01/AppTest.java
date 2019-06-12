package com.test01;

import com.test02.Bean02;
import com.test02.MyConfiguration02;
import com.test03.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Bean01 bean01 = context.getBean("beanId01", Bean01.class);
        System.out.println(bean01);

        ApplicationContext context02 = new AnnotationConfigApplicationContext(MyConfiguration02.class);
        Bean02 bean02 = context02.getBean("beanId02", Bean02.class);
        System.out.println(bean02);

        ApplicationContext context03 = new AnnotationConfigApplicationContext(MyConfigurationAll.class);
        BeanComponent beanComponent = context03.getBean("beanComponent", BeanComponent.class);
        BeanController beanController = context03.getBean("beanController", BeanController.class);
        BeanService beanService = context03.getBean("beanService", BeanService.class);
        BeanRepository beanRepository = context03.getBean("beanRepository", BeanRepository.class);
        System.out.println(beanComponent);
        System.out.println(beanController);
        System.out.println(beanService);
        System.out.println(beanRepository);
    }
}
