package com.advertising.administrator.dagger2_mvp.mvp.find.di;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact.FindContact;
import com.advertising.administrator.dagger2_mvp.mvp.find.view.FindAdapter;

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


    @Provides
    RecyclerView.LayoutManager provideLayoutManager() {
        return new LinearLayoutManager(view.getActivity(), LinearLayoutManager.VERTICAL, false);
    }

    @Provides
    FindAdapter provideAdapter() {
        return new FindAdapter(null);
    }

}
