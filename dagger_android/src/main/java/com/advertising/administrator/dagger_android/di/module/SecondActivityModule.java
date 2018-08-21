package com.advertising.administrator.dagger_android.di.module;

import com.advertising.administrator.dagger_android.mvp.view.SecondActivity;

import dagger.Module;
import dagger.Provides;

@Module
public  class SecondActivityModule {

    @Provides
    String provideName() {
        return SecondActivity.class.getName();
    }

}