package com.advertising.administrator.dagger2_mvp.base;

import io.reactivex.disposables.Disposable;

public interface BasePersenter{


    //Activity关闭把view对象置为空
    void detach();


    //将网络请求的每一个disposable添加进入CompositeDisposable，再退出时候一并注销
    void addDisposable(Disposable subscription);


    //注销所有请求
    void unDisposable();


}
