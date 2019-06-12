package com.test02;

public class Bean02 {
    private OtherBean02 otherBean02;
    private String name2;
    //2.用set方法注入属性不用定义构造方法
    public OtherBean02 getOtherBean02() {

        return otherBean02;
    }

    public void setOtherBean02(OtherBean02 otherBean02) {

        this.otherBean02 = otherBean02;
    }

    public String getName2() {

        return name2;
    }

    public void setName2(String name2) {

        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Bean02{" +
                "otherBean02=" + otherBean02 +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
