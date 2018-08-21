package com.advertising.administrator.dagger_android.mvp.contract;



public interface MainContract {
    interface View {
        void getData(String message);
    }

    interface Presenter {
        void requestData();
    }
}
