package com.advertising.administrator.dagger_simple.FourActivity;

import android.app.Application;

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        ComPonentHolder.setAppComponent(appComponent);
    }


}
