package com.advertising.administrator.dagger2_mvp.net;


import com.advertising.administrator.dagger2_mvp.mvp.home.module.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by yinfeilong on 2017/8/25.
 */

public interface API {


    @FormUrlEncoded
    @POST("accountLogin.html")
    Observable<LoginBean> Login(@Field("loginname") String loginname, @Field("password") String password);






}
