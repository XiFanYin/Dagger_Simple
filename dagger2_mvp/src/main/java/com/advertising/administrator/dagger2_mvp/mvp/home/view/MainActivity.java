package com.advertising.administrator.dagger2_mvp.mvp.home.view;

import android.os.Bundle;

import com.advertising.administrator.dagger2_mvp.R;
import com.advertising.administrator.dagger2_mvp.di.ComponentHolder;
import com.advertising.administrator.dagger2_mvp.base.BaseActivity;
import com.advertising.administrator.dagger2_mvp.mvp.home.di.DaggerHomeComponent;
import com.advertising.administrator.dagger2_mvp.mvp.home.di.HomeModule;
import com.advertising.administrator.dagger2_mvp.mvp.home.module.LoginBean;
import com.advertising.administrator.dagger2_mvp.mvp.home.persenter.HomePersenter;
import com.advertising.administrator.dagger2_mvp.mvp.home.persenter.contact.HomeContact;

public class MainActivity extends BaseActivity<HomePersenter> implements HomeContact.view {

    @Override
    protected void inject() {
        DaggerHomeComponent.builder().appCompoent(ComponentHolder.getAppComponent()).homeModule(new HomeModule(this)).build().inject(this);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected void initListener() {

    }


    public void getSerivceData() {
        mPersenter.getData();
    }

    @Override
    public void setData(LoginBean loginBean) {

    }
}
