package com.advertising.administrator.dagger2_mvp.mvp.find.di;

import com.advertising.administrator.dagger2_mvp.di.ActivityScope;
import com.advertising.administrator.dagger2_mvp.di.AppCompoent;
import com.advertising.administrator.dagger2_mvp.mvp.find.view.FindActivity;

import dagger.Component;
@ActivityScope
@Component(modules = FindModule.class,
dependencies = AppCompoent.class)
public interface FindComonent {
    void inject(FindActivity activity);
}
