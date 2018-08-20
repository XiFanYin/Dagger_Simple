package com.advertising.administrator.dagger_simple.FourActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.advertising.administrator.dagger_simple.R;

import javax.inject.Inject;

public class FourActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences1;
    @Inject
    SharedPreferences sharedPreferences2;
    @Inject
    Student st1;
    @Inject
    Student st2;
    @Inject
    Teacher teacher1;
    @Inject
    Teacher teacher2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        DaggerActivityComponent.builder().appComponent(ComPonentHolder.getAppComponent()).build().zhuru(this);
        Log.e("rrrrrrrrrrrr", sharedPreferences1.toString());
        Log.e("rrrrrrrrrrrr", sharedPreferences2.toString());
        Log.e("rrrrrrrrrrrr", teacher1.toString());
        Log.e("rrrrrrrrrrrr", teacher2.toString());
        Log.e("rrrrrrrrrrrr", st1.toString());
        Log.e("rrrrrrrrrrrr", st2.toString());

        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnent = new Intent(FourActivity.this, FiveActivity.class);
                startActivity(intnent);
            }
        });

    }
}
