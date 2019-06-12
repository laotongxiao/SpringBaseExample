package com.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @Component 用注解方式创建一个Bean
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean03 {
    @Autowired
    private OtherBean03 otherBean03;
    @Autowired
    private OtherBean03_02 otherBean03_02;

    @Override
    public String toString() {
        return "Bean03{" +
                "otherBean03=" + otherBean03 +
                ", otherBean03_02=" + otherBean03_02 +
                '}';
    }
}
