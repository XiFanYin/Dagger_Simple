package com.advertising.administrator.dagger_simple.SixActivity;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class XiaochiModule {

    @Provides
    public guazi provideGuazi() {
        return new guazi();
    }
}
