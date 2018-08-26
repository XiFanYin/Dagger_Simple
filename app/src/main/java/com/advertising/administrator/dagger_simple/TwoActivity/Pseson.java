package com.advertising.administrator.dagger_simple.TwoActivity;

import com.advertising.administrator.dagger_simple.OneActivity.Car;

public class Pseson {

    private Car car;

    public Pseson(Car car) {
        this.car = car;
    }

    public void drive() {
        car.drive();

    }
}
