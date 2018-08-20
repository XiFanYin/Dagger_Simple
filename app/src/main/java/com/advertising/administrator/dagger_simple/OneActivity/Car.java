package com.advertising.administrator.dagger_simple.OneActivity;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    @Inject
    public Car() {

    }

    public void drive() {
        Log.e("rrrrrr", "开汽车出门");
    }
}
