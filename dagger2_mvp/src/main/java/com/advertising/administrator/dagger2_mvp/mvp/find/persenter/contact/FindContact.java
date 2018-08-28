package com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact;

import android.content.Context;

import com.advertising.administrator.dagger2_mvp.base.BasePersenter;
import com.advertising.administrator.dagger2_mvp.base.BaseView;
import com.advertising.administrator.dagger2_mvp.mvp.home.module.LoginBean;

import java.util.List;

public class FindContact {

    public  interface Persenter extends BasePersenter {

        void getData();
    }


    public  interface View extends BaseView {

        void setData(List<String> list);

        Context getActivity();
    }
}
