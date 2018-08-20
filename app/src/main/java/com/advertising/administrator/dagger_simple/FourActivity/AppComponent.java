package com.advertising.administrator.dagger_simple.FourActivity;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {


    SharedPreferences provideSP();

    Teacher provideTeacher();
}
