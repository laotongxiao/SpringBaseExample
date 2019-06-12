package com.test01;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Lazy Bean 懒加载
 */
@Component
@Lazy
public class Bean01 {
    public Bean01() {
        System.out.println("Bean01 init");
    }
}
