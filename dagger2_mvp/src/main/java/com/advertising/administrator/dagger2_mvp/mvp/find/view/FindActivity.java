package com.advertising.administrator.dagger2_mvp.mvp.find.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.advertising.administrator.dagger2_mvp.R;
import com.advertising.administrator.dagger2_mvp.base.BaseActivity;
import com.advertising.administrator.dagger2_mvp.di.ComponentHolder;
import com.advertising.administrator.dagger2_mvp.mvp.find.di.DaggerFindComonent;
import com.advertising.administrator.dagger2_mvp.mvp.find.di.FindModule;
import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.FindPersenter;
import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact.FindContact;

import java.util.List;

import javax.inject.Inject;

public class FindActivity extends BaseActivity<FindPersenter> implements FindContact.View {

    private RecyclerView recyclerView;
    @Inject
    RecyclerView.LayoutManager linearLayoutManager;
    @Inject
    FindAdapter adapter;

    @Override
    protected void inject() {
        DaggerFindComonent.builder().appCompoent(ComponentHolder.getAppComponent()).findModule(new FindModule(this)).build().inject(this);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_find;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void getSerivceData() {
        mPersenter.getData();
    }

    @Override
    public void setData(List<String> list) {
        adapter.setNewData(list);
    }


    //对module类提供的上下文
    @Override
    public Context getActivity() {
        return this;
    }
}
