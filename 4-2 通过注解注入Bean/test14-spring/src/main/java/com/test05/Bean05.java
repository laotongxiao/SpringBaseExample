package com.test05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为List
 * @Qualifier 加上bean id
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean05 {
    @Autowired
    @Qualifier(value = "list05")
    private List<String> list05;

    public List<String> getList05() {
        return list05;
    }

    public void setList05(List<String> list05) {
        this.list05 = list05;
    }

    @Override
    public String toString() {
        return "Bean05{" +
                "list05=" + list05 +
                '}';
    }
}
