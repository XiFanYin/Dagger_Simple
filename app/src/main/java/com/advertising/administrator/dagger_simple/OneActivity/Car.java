package com.advertising.administrator.dagger_simple.OneActivity;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Car {
    private String name;

    @Inject
    public Car(String name) {
        this.name = name;

    }

    public void drive() {
        Log.e("rrrrrr", name + "开汽车出门");
    }
}
