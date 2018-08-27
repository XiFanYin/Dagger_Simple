package com.advertising.administrator.dagger_simple.FiveActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class A06module {
    @Provides
    public Teacher provideTeacher() {
        return new Teacher();
    }
}
