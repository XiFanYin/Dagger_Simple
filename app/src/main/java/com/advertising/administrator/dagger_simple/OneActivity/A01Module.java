package com.advertising.administrator.dagger_simple.OneActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class A01Module {

    private String name;

    public A01Module(String name) {
        this.name = name;
    }

    @Provides
    public String provideName() {
        return name;
    }


}
