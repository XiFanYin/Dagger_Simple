package com.advertising.administrator.dagger2_mvp.mvp.find.persenter;

import android.util.Log;

import com.advertising.administrator.dagger2_mvp.base.BasePresenterImpl;
import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact.FindContact;

import javax.inject.Inject;

public class FindPersenter extends BasePresenterImpl<FindContact.View> implements FindContact.Persenter {
    @Inject
    public FindPersenter(FindContact.View View) {
        super(View);
    }

    @Override
    public void getData() {


        Log.e("rrrrrrrrrr", mView.getAPI().toString());

    }
}
