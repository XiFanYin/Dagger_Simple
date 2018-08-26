package com.advertising.administrator.dagger_simple.ThereActivity;

import android.util.Log;

import javax.inject.Inject;

public class HotCar {

    public String name;


    public HotCar() {

    }

    public HotCar(String name) {
        this.name = name;
    }


    public void logName() {
        Log.e("rrrrrrrrr", "参数构造方法" + name);
    }
}
