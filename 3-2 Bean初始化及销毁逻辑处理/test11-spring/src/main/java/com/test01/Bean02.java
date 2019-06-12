package com.test01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean02 implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean onDestroy!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean onInit!");
    }
}
