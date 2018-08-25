package com.advertising.administrator.dagger_simple.OneActivity;

import dagger.Component;

@Component(modules = A01Module.class)
public interface A01Component {

    void inject(OneActivity activity);
}
