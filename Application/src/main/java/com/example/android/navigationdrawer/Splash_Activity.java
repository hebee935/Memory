package com.example.android.navigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by appcreate40 on 2016. 9. 6..
 */
public class Splash_Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {
햐
            @Override
            public void run() {
                finish();       // 3 초후 이미지를 닫아버림
            }
        }, 2000);

    } //end onCreate Method
}
