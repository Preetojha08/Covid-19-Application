package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class TestFormActivity extends AppCompatActivity {

    RadioGroup gender_radiogroup,language__radiogroup;
    LinearLayout gender_linearlayout,language_linearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_form);

        gender_radiogroup = (RadioGroup) findViewById(R.id.gender_radio_group);
        language__radiogroup = (RadioGroup) findViewById(R.id.language_radio_group);

        gender_linearlayout = (LinearLayout) findViewById(R.id.linear_gender_layout);
        language_linearlayout = (LinearLayout) findViewById(R.id.linear_language_layout);



    }
}