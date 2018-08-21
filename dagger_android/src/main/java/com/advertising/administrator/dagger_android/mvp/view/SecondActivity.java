package com.advertising.administrator.dagger_android.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.advertising.administrator.dagger_android.R;
import com.advertising.administrator.dagger_android.base.BaseActivity;

import javax.inject.Inject;

public class SecondActivity extends BaseActivity {
    @Inject
    String className;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);
        //展示地址，证明注入成功
        tv.setText(className);
    }
}
