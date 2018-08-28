package com.advertising.administrator.dagger2_mvp.mvp.find.view;

import com.advertising.administrator.dagger2_mvp.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class FindAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public FindAdapter(List<String> data) {
        super(R.layout.list_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_item, item);
    }
}
