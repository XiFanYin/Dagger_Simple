package com.advertising.administrator.dagger2_mvp.mvp.home.di;

import com.advertising.administrator.dagger2_mvp.mvp.home.persenter.contact.HomeContact;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

    HomeContact.view view;

    public HomeModule(HomeContact.view view) {
        this.view = view;
    }

    @Provides
    public HomeContact.view provideHomeContactView() {
        return view;
    }




}
