package com.example.himanshu.assignment4;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * splash screen activity
 */
public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIMEOUT = 2000;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, HomeScreenActivity.class);
                startActivity(intent);
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }
}
