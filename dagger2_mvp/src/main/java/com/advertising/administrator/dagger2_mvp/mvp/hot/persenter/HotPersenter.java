package com.advertising.administrator.dagger2_mvp.mvp.hot.persenter;

import com.advertising.administrator.dagger2_mvp.base.BasePresenterImpl;
import com.advertising.administrator.dagger2_mvp.mvp.hot.persenter.contact.HotContact;

public class HotPersenter extends BasePresenterImpl<HotContact.view>implements HotContact.Persenter {


    public HotPersenter(HotContact.view View) {
        super(View);
    }

    @Override
    public void getData() {

    }
}
