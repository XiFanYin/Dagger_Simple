package com.advertising.administrator.dagger_simple.TwoActivity;

import com.advertising.administrator.dagger_simple.OneActivity.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class A02Module {

    @Provides
    public Pseson providePerson(Car car) {
        return new Pseson(car);
    }

    @Provides
    public Car provideCar() {

        return new Car("王五");
    }
}
