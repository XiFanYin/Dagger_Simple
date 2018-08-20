package com.advertising.administrator.dagger_simple.FourActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class Activitymodule {

    @Provides
    public Student provideStudent() {
        return new Student();
    }


}
