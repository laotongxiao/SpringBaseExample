package com.test09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为Set
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean09 {
    @Autowired
    private Set<String> set09;

    public Set<String> getSet09() {
        return set09;
    }

    public void setSet09(Set<String> set09) {
        this.set09 = set09;
    }

    @Override
    public String toString() {
        return "Bean09{" +
                "set09=" + set09 +
                '}';
    }
}
