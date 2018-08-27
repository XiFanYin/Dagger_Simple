package com.advertising.administrator.dagger2_mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public abstract class BaseActivity<P extends BasePersenter> extends AppCompatActivity implements BaseView {

    @Inject
    public P mPersenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        inject();
        super.onCreate(savedInstanceState);

        setContentView(getLayout());

        initView(savedInstanceState);

        initListener();

        getSerivceData();
    }

    protected abstract void inject();


    public abstract int getLayout();


    protected abstract void initView(Bundle savedInstanceState);

    protected abstract void initListener();

    public void getSerivceData() {

    }


    //显示加载提示
    public void showLoadingDialog() {

    }

    ;

    //隐藏加载提示
    public void dissmassLoadingDialog() {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPersenter.detach();
    }
}

