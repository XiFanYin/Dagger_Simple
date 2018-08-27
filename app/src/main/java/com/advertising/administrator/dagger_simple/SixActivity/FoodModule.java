package com.advertising.administrator.dagger_simple.SixActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class FoodModule {
    @Provides
    public Noodle provideNoodle() {
        return new Noodle();
    }
}
