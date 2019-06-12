package com.test02;

public class ClassB {
    private String attribute01;
    private String attribute02;
    private String attribute03;
    private String attribute07;
    private String attribute08;

    public String getAttribute01() {
        return attribute01;
    }

    public void setAttribute01(String attribute01) {
        this.attribute01 = attribute01;
    }

    public String getAttribute02() {
        return attribute02;
    }

    public void setAttribute02(String attribute02) {
        this.attribute02 = attribute02;
    }

    public String getAttribute03() {
        return attribute03;
    }

    public void setAttribute03(String attribute03) {
        this.attribute03 = attribute03;
    }

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
        return "ClassB{" +
                "attribute01='" + attribute01 + '\'' +
                ", attribute02='" + attribute02 + '\'' +
                ", attribute03='" + attribute03 + '\'' +
                ", attribute07='" + attribute07 + '\'' +
                ", attribute08='" + attribute08 + '\'' +
                '}';
    }
}
