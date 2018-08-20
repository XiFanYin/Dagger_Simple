package com.advertising.administrator.dagger_simple.TwoActivity;

import com.advertising.administrator.dagger_simple.OneActivity.Car;

import javax.inject.Inject;

public class HotPerson {

    @Inject
    Car car;

    @Inject
    public HotPerson() {

    }

    public void chumen() {
        car.drive();
    }
}
