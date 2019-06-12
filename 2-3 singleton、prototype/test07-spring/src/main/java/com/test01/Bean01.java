package com.test01;

public class Bean01 {
    private Bean02 bean02;

    public Bean02 getBean02() {
        return bean02;
    }

    public void setBean02(Bean02 bean02) {
        this.bean02 = bean02;
    }

    @Override
    public String toString() {
        return "Bean01{" +
                "bean02=" + bean02 +
                '}';
    }
}
