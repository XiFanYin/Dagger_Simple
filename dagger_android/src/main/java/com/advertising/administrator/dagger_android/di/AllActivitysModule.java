package com.advertising.administrator.dagger_android.di;

import com.advertising.administrator.dagger_android.di.module.MainActivityModule;
import com.advertising.administrator.dagger_android.di.module.SecondActivityModule;
import com.advertising.administrator.dagger_android.mvp.view.MainActivity;
import com.advertising.administrator.dagger_android.mvp.view.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AllActivitysModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();

}