package com.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @Lookup 属性为办法注入
 */
@Component
@Scope(value = "singleton")
public abstract class Bean03 {
    @Lookup
    public abstract OtherBean03 testOtherBean03();
    public void testPrint(){
        System.out.println(testOtherBean03());
    }
}
