package com.advertising.administrator.dagger2_mvp.base;

import com.advertising.administrator.dagger2_mvp.net.API;

import retrofit2.Retrofit;

/**
 * Created by Administrator on 2018/5/4.
 */

public interface BaseView {

    //显示加载提示
    void showLoadingDialog();

    //隐藏加载提示
    void dissmassLoadingDialog();

    API getAPI();



}
