package com.advertising.administrator.dagger_android.mvp.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.advertising.administrator.dagger_android.R;
import com.advertising.administrator.dagger_android.base.BaseActivity;
import com.advertising.administrator.dagger_android.bean.Student;
import com.advertising.administrator.dagger_android.mvp.contract.MainContract;
import com.advertising.administrator.dagger_android.mvp.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {

    //不管你是怎么注入的，反正我这个页面是需要这些对象
    @Inject
    Student student1;
    @Inject
    Student student2;

    @Inject
    String className;

    @Inject
    SharedPreferences sp;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);
        //展示地址，证明注入成功
        tv.setText(className + "\n" +
                student1.toString() + "\n" +
                sp.toString());

        //请求数据，证明presenter注入成功
        presenter.requestData();


        Log.e("rrrrrrrrrrrr", student1.toString());
        Log.e("rrrrrrrrrrrr", student2.toString());

        //跳转第二个页面
        findViewById(R.id.jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    //获得数据
    @Override
    public void getData(String message) {
        Log.e("rrrrrrrrrrr", message);

    }

}
