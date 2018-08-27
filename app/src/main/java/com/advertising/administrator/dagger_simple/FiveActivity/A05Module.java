package com.advertising.administrator.dagger_simple.FiveActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class A05Module {
    @Provides
    public People providePeople() {

        return new People();
    }
}
