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
    ChinaCar car;

    @Inject
    @Named("name")
    String name;
    @Inject
    @Named("chepai")
    String chepai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        DaggerA03Component.builder().a03Model(new A03Model("张三", "予A8888")).build().zhuru(this);

        Log.e("rrrrrrrrrrr", name);
        Log.e("rrrrrrrrrrr", chepai);

        car.drive();

    }
}
