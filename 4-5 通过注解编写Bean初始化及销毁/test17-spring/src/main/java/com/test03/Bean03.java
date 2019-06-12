package com.test03;
/**
 * Bean 初始化及销毁第3种方法
 */
public class Bean03 {
    public void onInit(){
        System.out.println("Bean03 Init");
    }
    public void onDestroy(){
        System.out.println("Bean03 Destroy");
    }
}
