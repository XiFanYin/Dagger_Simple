package com.advertising.administrator.dagger_simple.SixActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;

public class SixActivity extends AppCompatActivity {

    @Inject
    guazi gz;

    @Inject
    baozi bz;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        DaggerFoodConponent.builder().build().provideXiaochi().inject(this);
        Log.e("rrrrrrrrrr", gz.toString());
        Log.e("rrrrrrrrrr", bz.toString());
    }
}
