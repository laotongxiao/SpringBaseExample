package com.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @Component 用注解方式创建一个Bean
 * @Autowired 用set方法实例化Bean
 */
@Component
public class Bean02 {
    private OtherBean02 otherBean02;

    @Autowired
    public void setOtherBean02(OtherBean02 otherBean02) {
        this.otherBean02 = otherBean02;
    }

    @Override
    public String toString() {
        return "Bean02{" +
                "otherBean02=" + otherBean02 +
                '}';
    }
}
