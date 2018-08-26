package com.advertising.administrator.dagger_simple.OneActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;
import javax.inject.Named;

public class OneActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        DaggerA01Component.builder().a01Module(new A01Module("李四")).build().inject(this);

        car.drive();

    }
}
