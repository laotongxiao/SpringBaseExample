package com.test02;

public class ClassA {
    private String attribute01;
    private String attribute02;
    private String attribute03;
    private String attribute04;
    private String attribute05;

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
        return "ClassA{" +
                "attribute01='" + attribute01 + '\'' +
                ", attribute02='" + attribute02 + '\'' +
                ", attribute03='" + attribute03 + '\'' +
                ", attribute04='" + attribute04 + '\'' +
                ", attribute05='" + attribute05 + '\'' +
                '}';
    }
}
