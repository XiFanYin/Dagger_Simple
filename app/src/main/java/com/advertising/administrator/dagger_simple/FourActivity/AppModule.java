package com.advertising.administrator.dagger_simple.FourActivity;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    public App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Singleton
    @Provides
    public SharedPreferences provideSp() {
        return app.getSharedPreferences("sss", Context.MODE_PRIVATE);
    }

    @Singleton
    @Provides
    public Teacher provideTeacher() {
        return new Teacher();
    }
}
