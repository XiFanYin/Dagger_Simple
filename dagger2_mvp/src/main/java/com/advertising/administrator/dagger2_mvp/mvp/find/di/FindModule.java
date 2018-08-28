package com.advertising.administrator.dagger2_mvp.mvp.find.di;

import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact.FindContact;

import dagger.Module;
import dagger.Provides;

@Module
public class FindModule {

    private FindContact.View view;

    public FindModule(FindContact.View view) {
        this.view = view;
    }

    @Provides
    public FindContact.View provideFindContactView() {
        return view;
    }
}
