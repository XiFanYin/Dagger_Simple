package com.advertising.administrator.dagger2_mvp.mvp.hot.di;

import com.advertising.administrator.dagger2_mvp.mvp.hot.module.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class HotModule {

    @Provides
    public Student provideStudent() {
        return new Student();
    }
}
