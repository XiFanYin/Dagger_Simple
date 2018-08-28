package com.advertising.administrator.dagger2_mvp.mvp.hot;

import android.os.Bundle;
import android.util.Log;

import com.advertising.administrator.dagger2_mvp.R;
import com.advertising.administrator.dagger2_mvp.base.BaseActivity;
import com.advertising.administrator.dagger2_mvp.base.EmptyPersenter;
import com.advertising.administrator.dagger2_mvp.mvp.hot.di.DaggerHotComponent;
import com.advertising.administrator.dagger2_mvp.mvp.hot.module.Student;

import javax.inject.Inject;

public class HotActivity extends BaseActivity<EmptyPersenter> {

    @Inject
    Student student;

    @Override
    protected void inject() {
        DaggerHotComponent.builder().build().inject(this);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        Log.e("rrrrrr", student.toString());
    }

    @Override
    protected void initListener() {

    }
}
