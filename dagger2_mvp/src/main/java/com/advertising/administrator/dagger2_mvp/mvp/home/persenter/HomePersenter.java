package com.advertising.administrator.dagger2_mvp.mvp.home.persenter;

import com.advertising.administrator.dagger2_mvp.base.BasePresenterImpl;
import com.advertising.administrator.dagger2_mvp.mvp.home.persenter.contact.HomeContact;

import javax.inject.Inject;

public class HomePersenter extends BasePresenterImpl<HomeContact.view> implements HomeContact.Persenter {

    @Inject
    public HomePersenter(HomeContact.view View) {
        super(View);
    }

    @Override
    public void getData() {


    }
}
