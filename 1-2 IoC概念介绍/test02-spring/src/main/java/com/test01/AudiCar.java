package com.test01;

public class AudiCar implements Car {

    @Override
    public void star() {
        System.out.println("start");
    }

    @Override
    public void turnLeft() {
        System.out.println("turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println("turnRight");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
