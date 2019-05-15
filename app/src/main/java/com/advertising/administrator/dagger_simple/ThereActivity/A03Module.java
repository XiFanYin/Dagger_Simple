package com.advertising.administrator.dagger_simple.ThereActivity;

import com.advertising.administrator.dagger_simple.OneActivity.Car;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class A03Module {

    @Provides
    @Named("name")
    public String provideNameee() {
        return "eee";
    }

    @Provides

    public String provideNamee() {
        return "eee";
    }
    @Provides
    @noParm
    public HotCar provideNullParm() {
        return new HotCar();
    }

    @Provides
    @hasParm
    public HotCar providehasParm(@Named("name") String name) {

        return new HotCar(name);
    }

}
