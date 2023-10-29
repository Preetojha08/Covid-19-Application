package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class SplashActivity extends AppCompatActivity {

    ImageView SplashScreen_imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int splash_screen_timeout = 3000;

        SplashScreen_imageView = (ImageView)findViewById(R.id.splash_icon_imageview);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mySuperIntent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(mySuperIntent);
                Log.i("Information","The Splash Screen is working in this application");
                finish();
            }
        }, splash_screen_timeout );

    }
}