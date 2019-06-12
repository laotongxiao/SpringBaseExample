package com.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component 用注解方式创建一个Bean
 * @Autowired 用构造方法实例化Bean
 */
@Component
public class Bean01 {
    private OtherBean01 otherBean01;

    public Bean01(OtherBean01 otherBean01) {
        this.otherBean01 = otherBean01;
    }

    @Override
    public String toString() {
        return "Bean01{" +
                "otherBean01=" + otherBean01 +
                '}';
    }
}
