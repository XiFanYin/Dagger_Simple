package com.advertising.administrator.dagger_simple.SixActivity;

import dagger.Subcomponent;

@Subcomponent(modules = XiaochiModule.class)
public interface XiaoChiComponent {

    void inject(SixActivity activity);
}
