package com.advertising.administrator.dagger2_mvp.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.advertising.administrator.dagger2_mvp.base.MyApplication;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    private MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    public static final int DEFAULT_TIMEOUT = 30;





    @Singleton
    @Provides
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl("http://47.93.136.56:7011/appInterface/doctor/")
                .addConverterFactory(GsonConverterFactory.create())//可以添加自定义解析器和默认的解析器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//添加响应式编程的适配器
                .client(client)
                .build();

    }


    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)//设置连接超时时间
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();

    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences() {
        return application.getSharedPreferences("spfile", Context.MODE_PRIVATE);
    }

    @Singleton
    @Provides
    MyApplication provideApplication() {
        return application;
    }

}
