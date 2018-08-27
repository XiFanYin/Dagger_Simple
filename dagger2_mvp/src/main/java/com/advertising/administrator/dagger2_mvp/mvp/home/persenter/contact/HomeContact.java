package com.advertising.administrator.dagger2_mvp.mvp.home.persenter.contact;

import com.advertising.administrator.dagger2_mvp.base.BasePersenter;
import com.advertising.administrator.dagger2_mvp.base.BaseView;
import com.advertising.administrator.dagger2_mvp.mvp.home.module.LoginBean;

public class HomeContact {

    public  interface Persenter extends BasePersenter {

        void getData();
    }


    public  interface view extends BaseView {

        void setData(LoginBean loginBean);
    }

}
