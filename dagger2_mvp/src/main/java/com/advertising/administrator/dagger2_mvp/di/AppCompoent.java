package com.advertising.administrator.dagger2_mvp.di;

import android.content.SharedPreferences;

import com.advertising.administrator.dagger2_mvp.base.MyApplication;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = AppModule.class)
public interface AppCompoent {

    //当这个Component被别的Component依赖时，必须提供下边方法，不写代表不对依赖Component暴漏对象

    Retrofit provideRetrofit();

    SharedPreferences provideSharedPreferences();

    MyApplication provideApplication();


}
