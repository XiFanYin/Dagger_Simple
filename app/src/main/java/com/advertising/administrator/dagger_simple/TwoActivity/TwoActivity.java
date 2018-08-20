package com.advertising.administrator.dagger_simple.TwoActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.advertising.administrator.dagger_simple.R;

public class TwoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        HotPerson fanhui = DaggerA02Component.builder().build().fanhui();
        fanhui.chumen();
    }
}
