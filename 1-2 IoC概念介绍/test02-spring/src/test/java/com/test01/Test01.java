package com.test01;

import org.junit.Test;

public class Test01 {
    @Test
    public void test(){
        BuickCar buickCar = new BuickCar();
        ZhangSan zhangSan = new ZhangSan(buickCar);
        zhangSan.goHome();
    }
}
