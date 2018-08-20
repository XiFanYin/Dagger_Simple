package com.advertising.administrator.dagger_simple.ThereActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class A03Model {

    public String name;

    public String chepai;


    public A03Model(String name, String chepai) {
        this.name = name;
        this.chepai = chepai;
    }

    @Provides
    public ChinaCar provideChinaCar() {
        return new ChinaCar();
    }

    @Provides
    @Named("name")
    public String provideName() {

        return name;
    }

    @Provides
    @Named("chepai")
    public String provideChepai() {
        return chepai;
    }
}
