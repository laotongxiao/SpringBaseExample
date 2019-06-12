package com.test06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为List
 * 用String 去给List付值
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean06 {
    @Autowired
    private List<String> list06;

    public List<String> getList06() {
        return list06;
    }

    public void setList06(List<String> list06) {
        this.list06 = list06;
    }

    @Override
    public String toString() {
        return "Bean06{" +
                "list06=" + list06 +
                '}';
    }
}
