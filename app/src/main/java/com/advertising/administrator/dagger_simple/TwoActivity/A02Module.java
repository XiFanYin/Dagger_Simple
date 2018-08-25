package com.advertising.administrator.dagger_simple.TwoActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class A02Module {

    @Provides
    public Pseson providePerson() {
        return new Pseson();
    }
}
