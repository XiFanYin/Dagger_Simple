package com.advertising.administrator.dagger_simple.TwoActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;

public class TwoActivity extends AppCompatActivity {

    @Inject
    Pseson person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        DaggerA02Component.builder().build().inject(this);
        person.getName();

    }
}
