package com.advertising.administrator.dagger_android.di;

import com.advertising.administrator.dagger_android.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitysModule.class
})
public interface MyAppComponent {

    void inject(MyApplication application);
}