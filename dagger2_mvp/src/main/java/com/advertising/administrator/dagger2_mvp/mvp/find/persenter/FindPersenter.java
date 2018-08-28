package com.advertising.administrator.dagger2_mvp.mvp.find.persenter;

import android.util.Log;

import com.advertising.administrator.dagger2_mvp.base.BasePresenterImpl;
import com.advertising.administrator.dagger2_mvp.mvp.find.persenter.contact.FindContact;

import java.util.ArrayList;

import javax.inject.Inject;

public class FindPersenter extends BasePresenterImpl<FindContact.View> implements FindContact.Persenter {
    @Inject
    public FindPersenter(FindContact.View View) {
        super(View);
    }

    @Override
    public void getData() {
        //这里打印的地址和Home中打印的地址是一个地址
        Log.e("rrrrrrrrrr", mView.getAPI().toString());

        //这里模拟的数据，假装联网请求到的数据
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr.add(i + "");
        }
        mView.setData(arr);
    }
}
