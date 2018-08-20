package com.advertising.administrator.dagger_simple.SixActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class FoodModule {

    @Provides
    public baozi provideBaozi() {


        return new baozi();
    }
}
