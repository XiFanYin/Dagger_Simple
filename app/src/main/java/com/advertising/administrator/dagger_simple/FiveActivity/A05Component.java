package com.advertising.administrator.dagger_simple.FiveActivity;

import dagger.Component;
@PeopleScope
@Component(modules = A05Module.class, dependencies = ShareComponent.class)
public interface A05Component {
    void inject(FiveActivity activity);
}
