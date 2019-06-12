package com.test01;

public class Bean01 {
    private OtherBean01 otherBean01;
    private String name;
    //1.用构造方法注入属性一定要定义构造方法
    public Bean01(OtherBean01 otherBean01, String name) {
        this.otherBean01 = otherBean01;
        this.name = name;
    }

    public OtherBean01 getOtherBean01() {

        return otherBean01;
    }

    public void setOtherBean01(OtherBean01 otherBean01) {

        this.otherBean01 = otherBean01;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean01{" +
                "otherBean01=" + otherBean01 +
                ", name='" + name + '\'' +
                '}';
    }
}
