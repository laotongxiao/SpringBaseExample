package com.test08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为Map
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean08 {
    @Autowired
    private Map<String, Integer> map08;

    public Map<String, Integer> getMap08() {
        return map08;
    }

    public void setMap08(Map<String, Integer> map08) {
        this.map08 = map08;
    }

    @Override
    public String toString() {
        return "Bean08{" +
                "map08=" + map08 +
                '}';
    }
}
