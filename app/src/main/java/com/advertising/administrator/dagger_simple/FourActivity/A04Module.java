package com.advertising.administrator.dagger_simple.FourActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class A04Module {
    @StudentScope
    @Provides
    public Student provideStudent() {

        return new Student();
    }
}
