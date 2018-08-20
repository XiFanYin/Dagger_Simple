package com.advertising.administrator.dagger_simple.FourActivity;

import dagger.Component;

@SingleScope
@Component(modules = Activitymodule.class
        , dependencies = AppComponent.class)
public interface ActivityComponent {

    void zhuru(FourActivity activity);

    void zhuru2(FiveActivity activity);
}
