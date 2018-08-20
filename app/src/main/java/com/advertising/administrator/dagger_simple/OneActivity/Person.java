package com.advertising.administrator.dagger_simple.OneActivity;

import javax.inject.Inject;

public class Person {
    @Inject
    Car car;

    public Person() {
        DaggerA01Component.builder().build().inject(this);
    }

    public void chumen() {
        car.drive();
    }
}

