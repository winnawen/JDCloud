package me.ininit.jdcloud.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import me.ininit.jdcloud.R;

/**
 * Created by luo75 on 2016/10/11.
 */

public class SplashActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGHT=3000;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent=new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);
    }
}
