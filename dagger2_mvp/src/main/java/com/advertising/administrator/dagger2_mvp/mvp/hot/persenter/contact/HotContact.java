package com.advertising.administrator.dagger2_mvp.mvp.hot.persenter.contact;

import com.advertising.administrator.dagger2_mvp.base.BasePersenter;
import com.advertising.administrator.dagger2_mvp.base.BaseView;

public class HotContact {


    public interface Persenter extends BasePersenter {

        void getData();
    }


    public interface view extends BaseView {

        void setData(String eee);
    }
}
