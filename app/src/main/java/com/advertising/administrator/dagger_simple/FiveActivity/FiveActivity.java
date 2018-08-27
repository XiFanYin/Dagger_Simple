package com.advertising.administrator.dagger_simple.FiveActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;

public class FiveActivity extends AppCompatActivity {
    @Inject
    People people;
    @Inject
    Money money;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        //不同页面，只要控制这个ShareComponent对象是同一个，就能保证不同页面的money对象是通一个。
        ShareComponent share = DaggerShareComponent.builder().build();
        DaggerA05Component.builder().shareComponent(share).build().inject(this);

        Log.e("rrrrrrrrrrrrr", people.toString());
        Log.e("rrrrrrrrrrrrr", money.toString());


    }
}
