package com.advertising.administrator.dagger2_mvp.mvp.home.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.advertising.administrator.dagger2_mvp.R;
import com.advertising.administrator.dagger2_mvp.di.ComponentHolder;
import com.advertising.administrator.dagger2_mvp.base.BaseActivity;
import com.advertising.administrator.dagger2_mvp.mvp.find.view.FindActivity;
import com.advertising.administrator.dagger2_mvp.mvp.home.di.DaggerHomeComponent;
import com.advertising.administrator.dagger2_mvp.mvp.home.di.HomeModule;
import com.advertising.administrator.dagger2_mvp.mvp.home.module.LoginBean;
import com.advertising.administrator.dagger2_mvp.mvp.home.persenter.HomePersenter;
import com.advertising.administrator.dagger2_mvp.mvp.home.persenter.contact.HomeContact;
import com.advertising.administrator.dagger2_mvp.mvp.hot.view.HotActivity;

public class MainActivity extends BaseActivity<HomePersenter> implements HomeContact.view {

    private TextView tv;
    private TextView tv2;

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
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        tv.setText("跳转hot界面");
        tv2.setText("跳转Find界面");
    }

    @Override
    protected void initListener() {
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HotActivity.class);
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindActivity.class);
                startActivity(intent);
            }
        });
    }


    public void getSerivceData() {
        mPersenter.getData();
    }

    @Override
    public void setData(LoginBean loginBean) {

    }
}
