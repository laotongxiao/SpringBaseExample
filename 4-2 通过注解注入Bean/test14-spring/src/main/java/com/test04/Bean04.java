package com.test04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为List
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean04 {
    @Autowired
    private List<String> list04;

    public List<String> getList04() {
        return list04;
    }

    public void setList04(List<String> list04) {
        this.list04 = list04;
    }

    @Override
    public String toString() {
        return "Bean04{" +
                "list04=" + list04 +
                '}';
    }
}
