package com.test11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为接口实现类如ApplicationContext
 * @Autowired 用于属性实例化Bean
 */
@Component
public class Bean11 {
    @Autowired
    private ApplicationContext contextBean11;

    public ApplicationContext getContextBean11() {
        return contextBean11;
    }

    public void setContextBean11(ApplicationContext contextBean11) {
        this.contextBean11 = contextBean11;
    }

    @Override
    public String toString() {
        return "Bean11{" +
                "contextBean11=" + contextBean11 +
                '}';
    }
}
