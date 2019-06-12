package com.test01.humen;

import com.test01.car.Car;

public class LiSi extends HumenWithCar {
    public LiSi(Car car){
        super(car);
    }
    @Override
    public void goHome() {
        car.star();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
