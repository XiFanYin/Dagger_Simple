package com.advertising.administrator.dagger_simple.FiveActivity;

import dagger.Component;

@TeacherScpoe
@Component(modules = A06module.class, dependencies = ShareComponent.class)
public interface A06TeacherComponent {
    void inject(TeacherActivity activity);
}
