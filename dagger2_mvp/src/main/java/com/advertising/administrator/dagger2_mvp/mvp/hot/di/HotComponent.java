package com.advertising.administrator.dagger2_mvp.mvp.hot.di;

import com.advertising.administrator.dagger2_mvp.di.ActivityScope;
import com.advertising.administrator.dagger2_mvp.di.AppCompoent;
import com.advertising.administrator.dagger2_mvp.mvp.hot.HotActivity;

import dagger.Component;

@ActivityScope
@Component(modules = HotModule.class, dependencies = AppCompoent.class)
public interface HotComponent {

    void inject(HotActivity activity);
}
