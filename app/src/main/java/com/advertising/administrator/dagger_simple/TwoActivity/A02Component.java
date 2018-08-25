package com.advertising.administrator.dagger_simple.TwoActivity;

import dagger.Component;

@Component(modules = A02Module.class)
public interface A02Component {

    void inject(TwoActivity activity);
}
