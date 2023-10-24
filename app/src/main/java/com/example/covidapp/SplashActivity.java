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
    JustifiedTextView splashscreen_covid_info;
    String dummy_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        dummy_text = getResources().getString(R.string.about_covid_splash);
        splashscreen_covid_info=(JustifiedTextView) findViewById(R.id.slpash_covid_para_textview);
        splashscreen_covid_info.setText(Html.fromHtml(dummy_text));

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