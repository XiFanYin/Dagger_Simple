package com.advertising.administrator.dagger_simple.SixActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;

public class SixActivity extends AppCompatActivity {
    @Inject
    Noodle noodle;
    @Inject
    Melon melon;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        DaggerFoodComponent.builder().build().getSnack().inject(this);

        Log.e("rrrrrrrrrrr", noodle.toString());
        Log.e("rrrrrrrrrrr", melon.toString());

    }
}
