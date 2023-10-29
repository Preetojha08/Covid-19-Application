package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView home_symptoms_rv,home_safetymajors_rv;
    RecyclerViewAdapter recyclerViewAdapter, recyclerViewAdapter_2;

    //Symptoms Array
    List<String> symptoms_titles;
    List<Integer> symptoms_images;

    //Safety Majors
    List<String> safetymajors_titles;
    List<Integer> safetymajors_images;
    TextView viewall_symptos;
    TextView viewall_safetymajors;

    //quaratine activity
    CardView cardview_quaratine_act,cardView_covidhelpcenter;

    TextView begiintest_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardView_covidhelpcenter = (CardView) findViewById(R.id.covid_helpcenter_cardview);

        cardView_covidhelpcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,CovidHelpCenterActivity.class));
            }
        });

        viewall_symptos = (TextView) findViewById(R.id.home_viewall_symptoms);
        viewall_symptos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,SymptomsActivity.class));
            }
        });

        begiintest_tv = (TextView) findViewById(R.id.home_begin_test_button);
        begiintest_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(HomeActivity.this, TestFormActivity.class));
                startActivity(new Intent(HomeActivity.this, TestMainActivity.class));
            }
        });

        home_symptoms_rv=(RecyclerView) findViewById(R.id.symptoms_recyclerview);
        home_safetymajors_rv =(RecyclerView) findViewById(R.id.safetymajors_recyclerview);

        cardview_quaratine_act = (CardView) findViewById(R.id.home_quaratine_card_view);

        cardview_quaratine_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, QuarantineActivity.class));
            }
        });

        viewall_safetymajors = (TextView) findViewById(R.id.view_safetymajors);

        viewall_safetymajors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,SafetyMajorsActivity.class));
            }
        });

        //Symptoms
        symptoms_titles = new ArrayList<>();
        symptoms_images = new ArrayList<>();

        symptoms_titles.add("Runny Nose");
        symptoms_titles.add("Dry Cough");
        symptoms_titles.add("High Fever");
        symptoms_titles.add("Tiredness");

        symptoms_images.add(R.drawable.nasal_conjection);
        symptoms_images.add(R.drawable.cough);
        symptoms_images.add(R.drawable.fever);
        symptoms_images.add(R.drawable.tiredness);

        recyclerViewAdapter = new RecyclerViewAdapter(this,symptoms_titles,symptoms_images,10);

        home_symptoms_rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        home_symptoms_rv.setAdapter(recyclerViewAdapter);


        //Safety Majors

        safetymajors_titles = new ArrayList<>();
        safetymajors_images = new ArrayList<>();

        safetymajors_titles.add("Wash Hands");
        safetymajors_titles.add("Wear Mask");
        safetymajors_titles.add("Avoid Touching");
        safetymajors_titles.add("Consume Liquids");
        safetymajors_titles.add("Check News");
        safetymajors_titles.add("No Gathering");

        safetymajors_images.add(R.drawable.handwash);
        safetymajors_images.add(R.drawable.mask);
        safetymajors_images.add(R.drawable.avoid_touching);
        safetymajors_images.add(R.drawable.liquid);
        safetymajors_images.add(R.drawable.vaild);
        safetymajors_images.add(R.drawable.social_distance);

        recyclerViewAdapter_2 = new RecyclerViewAdapter(this,safetymajors_titles,safetymajors_images,10);

        //home_safetymajors_rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        GridLayoutManager layoutManager=new GridLayoutManager(this,3);
        home_safetymajors_rv.setLayoutManager(layoutManager);
        home_safetymajors_rv.setAdapter(recyclerViewAdapter_2);



    }
}