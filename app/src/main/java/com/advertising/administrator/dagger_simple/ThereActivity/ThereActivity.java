package com.advertising.administrator.dagger_simple.ThereActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;
import javax.inject.Named;

public class ThereActivity extends AppCompatActivity {

    @Inject
    @hasParm
    HotCar hotCar1;

    @Inject
    @noParm
    HotCar hotCar2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        DaggerA03Component.builder().build().inject(this);
        hotCar1.logName();

        hotCar2.logName();
    }
}
