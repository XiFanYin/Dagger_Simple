package com.advertising.administrator.dagger_simple.FiveActivity;

import dagger.Component;
@MoneyScope
@Component(modules = ShareModule.class)
public interface ShareComponent {
    Money getMoney();
}
