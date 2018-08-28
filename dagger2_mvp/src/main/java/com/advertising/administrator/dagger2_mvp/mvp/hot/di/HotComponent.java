package com.advertising.administrator.dagger2_mvp.mvp.hot.di;

import com.advertising.administrator.dagger2_mvp.mvp.hot.HotActivity;

import dagger.Component;

@Component(modules = HotModule.class)
public interface HotComponent {

    void inject(HotActivity activity);
}
