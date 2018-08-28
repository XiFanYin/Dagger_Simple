package com.advertising.administrator.dagger2_mvp.mvp.find.view;

import android.os.Bundle;

import com.advertising.administrator.dagger2_mvp.R;
import com.advertising.administrator.dagger2_mvp.base.BaseActivity;
import com.advertising.administrator.dagger2_mvp.di.ComponentHolder;
import com.advertising.administrator.dagger2_mvp.mvp.find.di.DaggerFindComonent;
import com.advertising.administrator.dagger2_mvp.mvp.find.di.FindModule;
import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.FindPersenter;
import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact.FindContact;

import java.util.List;

public class FindActivity extends BaseActivity<FindPersenter> implements FindContact.View {
    @Override
    protected void inject() {
        DaggerFindComonent.builder().appCompoent(ComponentHolder.getAppComponent()).findModule(new FindModule(this)).build().inject(this);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mPersenter.getData();
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void setData(List<String> list) {

    }
}
