package com.test01.humen;

import com.test01.car.Car;

public class ZhangSan extends HumenWithCar {
    public ZhangSan(Car car){
        super(car);
    }
    @Override
    public void goHome() {
        car.star();
        car.turnLeft();
        car.turnRight();
        car.star();
    }
}
