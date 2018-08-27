package com.advertising.administrator.dagger_simple.SixActivity;

import dagger.Component;

@Component(modules = FoodModule.class)
public interface FoodComponent {
    SnackComponent getSnack();
}
