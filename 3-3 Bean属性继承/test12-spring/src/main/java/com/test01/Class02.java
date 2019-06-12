package com.test01;

public class Class02 extends ParentClass {
    private String attribute07;
    private String attribute08;

    public String getAttribute07() {
        return attribute07;
    }

    public void setAttribute07(String attribute07) {
        this.attribute07 = attribute07;
    }

    public String getAttribute08() {
        return attribute08;
    }

    public void setAttribute08(String attribute08) {
        this.attribute08 = attribute08;
    }

    @Override
    public String toString() {
        return "Class02{" +
                "attribute07='" + attribute07 + '\'' +
                ", attribute08='" + attribute08 + '\'' +
                ", attribute01='" + getAttribute01() + '\'' +
                ", attribute02='" + getAttribute02() + '\'' +
                ", attribute03='" + getAttribute03() + '\'' +
                '}';
    }
}
