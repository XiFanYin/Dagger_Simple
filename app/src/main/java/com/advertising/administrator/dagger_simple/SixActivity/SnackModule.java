package com.advertising.administrator.dagger_simple.SixActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class SnackModule {
    @Provides
    public Melon provideMelon() {
        return new Melon();
    }
}
