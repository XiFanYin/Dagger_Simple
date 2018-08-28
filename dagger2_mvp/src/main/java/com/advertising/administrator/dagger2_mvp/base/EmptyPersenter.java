package com.advertising.administrator.dagger2_mvp.base;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

/**
 * 空的persenter,用来解决没有p层的代码
 */

public class EmptyPersenter implements BasePersenter {
    @Inject
    public EmptyPersenter() {
    }

    @Override
    public void detach() {

    }

    @Override
    public void addDisposable(Disposable subscription) {

    }

    @Override
    public void unDisposable() {

    }
}
