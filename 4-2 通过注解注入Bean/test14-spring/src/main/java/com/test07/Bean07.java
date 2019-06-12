package com.test07;

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
public class Bean07 {
    @Autowired
    @Qualifier(value = "list07")
    private List<String> list07;

    public List<String> getList07() {
        return list07;
    }

    public void setList07(List<String> list07) {
        this.list07 = list07;
    }

    @Override
    public String toString() {
        return "Bean07{" +
                "list07=" + list07 +
                '}';
    }
}
