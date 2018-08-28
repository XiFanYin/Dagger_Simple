package com.advertising.administrator.dagger2_mvp.base;

import android.app.Application;

import com.advertising.administrator.dagger2_mvp.di.AppModule;
import com.advertising.administrator.dagger2_mvp.di.ComponentHolder;
import com.advertising.administrator.dagger2_mvp.di.DaggerAppCompoent;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ComponentHolder.setAppComponent(DaggerAppCompoent.builder().appModule(new AppModule(this)).build());
    }
}
