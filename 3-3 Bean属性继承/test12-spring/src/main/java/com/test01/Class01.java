package com.test01;

public class Class01 extends ParentClass{
    private String attribute04;
    private String attribute05;

    public String getAttribute04() {
        return attribute04;
    }

    public void setAttribute04(String attribute04) {
        this.attribute04 = attribute04;
    }

    public String getAttribute05() {
        return attribute05;
    }

    public void setAttribute05(String attribute05) {
        this.attribute05 = attribute05;
    }

    @Override
    public String toString() {
        return "Class01{" +
                "attribute04='" + attribute04 + '\'' +
                ", attribute05='" + attribute05 + '\'' +
                ", attribute01='" + getAttribute01() + '\'' +
                ", attribute02='" + getAttribute02() + '\'' +
                ", attribute03='" + getAttribute03() + '\'' +
                '}';
    }
}
