package com.advertising.administrator.dagger2_mvp.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BasePresenterImpl<V extends BaseView> implements BasePersenter {

    public V mView;
    private CompositeDisposable mCompositeDisposable;

    public BasePresenterImpl(V View) {
        this.mView = View;
    }


    @Override
    public void detach() {
        unDisposable();//切断流，防止rx内存泄漏，导致空指针
        this.mView = null;//释放View，防止内存泄露
    }

    @Override
    public void addDisposable(Disposable subscription) {
        //csb 如果解绑了的话添加 sb 需要新的实例否则绑定时无效的
        if (mCompositeDisposable == null || mCompositeDisposable.isDisposed()) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(subscription);
    }

    @Override
    public void unDisposable() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
            mCompositeDisposable = null;
        }
    }
}
