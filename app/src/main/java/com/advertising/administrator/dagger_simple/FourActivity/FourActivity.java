package com.advertising.administrator.dagger_simple.FourActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;

public class FourActivity extends AppCompatActivity {

    @Inject
    Student student1;
    @Inject
    Student student2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        DaggerA04Component.builder().build().inject(this);
        Log.e("rrrrrrrrr",student1.toString());
        Log.e("rrrrrrrrr",student2.toString());


    }
}

