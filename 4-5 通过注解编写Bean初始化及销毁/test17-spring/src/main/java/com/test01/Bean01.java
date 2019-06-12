package com.test01;

import com.sun.media.jfxmediaimpl.MediaDisposer;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Bean 初始化及销毁第1种方法
 */
@Component
public class Bean01 implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean01 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean01 init");
    }
}
