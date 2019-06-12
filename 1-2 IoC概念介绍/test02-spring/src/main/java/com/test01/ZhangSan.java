package com.test01;

public class ZhangSan {
    private Car car;

    public ZhangSan(Car car){
        this.car = car;
    }
    public void goHome(){
        car.star();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
    public void goShop(){
        car.star();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
