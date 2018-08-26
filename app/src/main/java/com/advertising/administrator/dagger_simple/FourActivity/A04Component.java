package com.advertising.administrator.dagger_simple.FourActivity;

import dagger.Component;

@StudentScope
@Component(modules = A04Module.class)
public interface A04Component {
    void inject(FourActivity activity);
}
