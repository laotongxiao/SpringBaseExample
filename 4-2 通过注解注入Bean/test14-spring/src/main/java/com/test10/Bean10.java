package com.test10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * @Component 用注解方式创建一个Bean
 * 属性为String Integer 基本数据类型
 * @Value 用于直接付值Set方法实例化Bean
 */
@Component
public class Bean10 {
    private String string10;
    private Integer integer10;

    public String getString10() {
        return string10;
    }
    @Value("stringvalue10")
    public void setString10(String string10) {
        this.string10 = string10;
    }

    public Integer getInteger10() {
        return integer10;
    }
    @Value("10")
    public void setInteger10(Integer integer10) {
        this.integer10 = integer10;
    }

    @Override
    public String toString() {
        return "Bean10{" +
                "string10='" + string10 + '\'' +
                ", integer10=" + integer10 +
                '}';
    }
}
