package com.advertising.administrator.dagger_android.mvp.presenter;


import com.advertising.administrator.dagger_android.mvp.contract.MainContract;
import com.advertising.administrator.dagger_android.mvp.view.MainActivity;

import javax.inject.Inject;


public class MainPresenter implements MainContract.Presenter {

    private final MainActivity view;

    @Inject
    public MainPresenter(MainActivity view) {
        this.view = view;
    }
    @Override
    public void requestData() {
        view.getData("模拟请求到的数据");
    }
}
