package com.advertising.administrator.dagger_simple.SixActivity;

import dagger.Subcomponent;

@Subcomponent(modules = SnackModule.class)
public interface SnackComponent {
    void inject(SixActivity activity);
}
