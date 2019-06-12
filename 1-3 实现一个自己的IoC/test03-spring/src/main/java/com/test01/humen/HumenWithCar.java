package com.test01.humen;

import com.test01.car.Car;

public abstract class HumenWithCar implements Humen{
    protected Car car;
    public HumenWithCar(Car car){
        this.car = car;
    }

    @Override
    public abstract void goHome();
}
