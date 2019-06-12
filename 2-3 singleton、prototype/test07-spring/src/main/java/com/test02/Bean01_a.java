package com.test02;

/**
 * 参数是一个方法的型式注入
 */
public abstract class Bean01_a {
    protected abstract Bean01_b creadBean01_b();
    public void printBean01_b(){
        System.out.println("printBean01_b:----" + creadBean01_b());
    }
}
