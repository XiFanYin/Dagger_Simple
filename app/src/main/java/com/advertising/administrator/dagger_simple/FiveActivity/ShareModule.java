package com.advertising.administrator.dagger_simple.FiveActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ShareModule {

    @Provides
    @MoneyScope
    public Money provideMoney() {
        return new Money();
    }
}
