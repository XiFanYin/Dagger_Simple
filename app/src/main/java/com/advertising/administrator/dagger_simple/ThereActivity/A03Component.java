package com.advertising.administrator.dagger_simple.ThereActivity;

import dagger.Component;

@Component(modules = A03Module.class)
public interface A03Component {

    void inject(ThereActivity activity);
}
