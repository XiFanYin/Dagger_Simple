package com.advertising.administrator.dagger_android.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.advertising.administrator.dagger_android.bean.Student;
import com.advertising.administrator.dagger_android.mvp.view.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    String provideName() {
        return MainActivity.class.getName();
    }

    @Provides
    Student provideStudent() {
        return new Student();
    }

    @Provides
    SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }
}
