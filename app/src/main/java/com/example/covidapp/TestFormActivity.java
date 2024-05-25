package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.IllegalFormatCodePointException;

public class TestFormActivity extends AppCompatActivity {

    TextInputEditText fullnameEditText, mobileEditText, ageEditText, addressEditText;
    TextView femaleTextView, maleTextView, othersTextView;
    TextView hindiTextView, englishTextView, frenchTextView;
    String username,userage,usermobile,useraddress;
    TextView testStart_btn;
    String selectedGender = "";
    String selectedLanguage = "";
    boolean female,male,others;
    boolean hindi,english,french;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_form);

        // Initialize the IDs
        fullnameEditText = findViewById(R.id.uf_fullname_edt);
        mobileEditText = findViewById(R.id.uf_phoneno_edt);
        ageEditText = findViewById(R.id.uf_age_edt);
        addressEditText = findViewById(R.id.uf_address_edt);
        femaleTextView = findViewById(R.id.uf_female_tx);
        maleTextView = findViewById(R.id.uf_male_tx);
        othersTextView = findViewById(R.id.uf_others_tx);
        hindiTextView = findViewById(R.id.uf_hindi_tx);
        englishTextView = findViewById(R.id.uf_english_tx);
        frenchTextView = findViewById(R.id.uf_french_tx);

        testStart_btn = (TextView)findViewById(R.id.start_test_btn);

        femaleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                femaleTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorRed)));
                maleTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                othersTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                selectedGender = "Female";
            }
        });

        maleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maleTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorRed)));
                femaleTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                othersTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                selectedGender = "Male";
            }
        });

        othersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othersTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorRed)));
                femaleTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                maleTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                selectedGender = "Others";
            }
        });

        hindiTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hindiTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorRed)));
                englishTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                frenchTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                selectedLanguage = "Hindi";
            }
        });

        englishTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                englishTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorRed)));
                hindiTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                frenchTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                selectedLanguage = "English";
            }
        });

        frenchTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frenchTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorRed)));
                hindiTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                englishTextView.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(TestFormActivity.this, R.color.colorPrimary)));
                selectedLanguage = "French";
            }
        });

        testStart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = fullnameEditText.getText().toString().trim();
                userage = ageEditText.getText().toString().trim();
                useraddress = addressEditText.getText().toString().trim();
                usermobile = mobileEditText.getText().toString().trim();

                if(username != null && !username.isEmpty())
                {
                    if( usermobile != null && usermobile.matches("\\d{10}"))
                    {
                        int ageInt = Integer.parseInt(userage);
                        if(ageInt >= 0 && ageInt <= 100)
                        {
                            if(useraddress != null && !useraddress.isEmpty())
                            {
                                if (selectedGender.equals("Female") || selectedGender.equals("Male") || selectedGender.equals("Others"))
                                {
                                    if (selectedLanguage.equals("Hindi") || selectedLanguage.equals("English") || selectedLanguage.equals("French"))
                                    {
                                        Toast.makeText(TestFormActivity.this, "Test Started", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(TestFormActivity.this,TestMainActivity.class));
                                    }
                                    else
                                    {
                                        Toast.makeText(TestFormActivity.this, "Invalid User Language", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                else
                                {
                                    Toast.makeText(TestFormActivity.this, "Invalid User Gender", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else
                            {
                                Toast.makeText(TestFormActivity.this, "Invalid User Address", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(TestFormActivity.this, "Invalid User Age", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(TestFormActivity.this, "Invalid User Mobile Number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(TestFormActivity.this, "Invalid UserName", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}