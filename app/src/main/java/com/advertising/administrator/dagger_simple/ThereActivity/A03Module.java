package com.advertising.administrator.dagger_simple.ThereActivity;

import com.advertising.administrator.dagger_simple.OneActivity.Car;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class A03Module {

    @Provides
    public String provideName() {
        return "eee";
    }

    @Provides
    @noParm
    public HotCar provideNullParm() {
        return new HotCar();
    }

    @Provides
    @hasParm
    public HotCar providehasParm(String name) {

        return new HotCar(name);
    }

}
