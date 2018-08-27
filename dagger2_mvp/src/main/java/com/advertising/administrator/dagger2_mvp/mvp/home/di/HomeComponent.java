package com.advertising.administrator.dagger2_mvp.mvp.home.di;

import com.advertising.administrator.dagger2_mvp.di.AppCompoent;
import com.advertising.administrator.dagger2_mvp.mvp.home.view.MainActivity;

import dagger.Component;

@MainScope
@Component(modules = HomeModule.class,
        dependencies = AppCompoent.class)
public interface HomeComponent {

    void inject(MainActivity activity);
}
