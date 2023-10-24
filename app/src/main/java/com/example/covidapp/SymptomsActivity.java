package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SymptomsActivity extends AppCompatActivity {

    List<String> detail_common_symptoms_titles;
    List<String> detail_common_symptoms_desc;
    List<Integer> detail_common_symptoms_images;

    List<String> detail_second_symptoms_titles;
    List<String> detail_second_symptoms_desc;
    List<Integer> detail_second_symptoms_images;
    RecyclerViewAdapter recyclerViewAdapter,recyclerViewAdapter_2;
    RecyclerView detail_common_symptos_recyclerView,detail_second_symptos_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        detail_common_symptos_recyclerView=(RecyclerView) findViewById(R.id.recyclerview_common_symptoms);
        detail_second_symptos_recyclerView=(RecyclerView) findViewById(R.id.recyclerview_second_symptoms);

        //Common Symptoms
        detail_common_symptoms_titles = new ArrayList<>();
        detail_common_symptoms_desc = new ArrayList<>();
        detail_common_symptoms_images = new ArrayList<>();

        detail_common_symptoms_titles.add("Dry cough");
        detail_common_symptoms_titles.add("High Fever");
        detail_common_symptoms_titles.add("Tiredness");
        detail_common_symptoms_titles.add("Loss of Taste or Smell Sense");

        detail_common_symptoms_desc.add("A sudden, forceful hacking sound to release air and clear an irritation in the throat or airway.");
        detail_common_symptoms_desc.add("High-grade fevers range from about 103 F-104 F. Dangerous temperatures are high-grade fevers that range from over 104 F-107 F or higher.");
        detail_common_symptoms_desc.add("Feeling overtired, with low energy and a strong desire to sleep that interferes with normal daily activities.");
        detail_common_symptoms_desc.add("It's not uncommon for upper respiratory infections such as the common cold or flu to affect our senses of smell and taste. In fact, it's estimated that a temporary loss of smell happens in over 60 percent of colds and sinus infections.");

        detail_common_symptoms_images.add(R.drawable.cough);
        detail_common_symptoms_images.add(R.drawable.fever);
        detail_common_symptoms_images.add(R.drawable.tiredness);
        detail_common_symptoms_images.add(R.drawable.social_dist);

        recyclerViewAdapter = new RecyclerViewAdapter(this,detail_common_symptoms_titles,detail_common_symptoms_desc,detail_common_symptoms_images,20);
        detail_common_symptos_recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        detail_common_symptos_recyclerView.setAdapter(recyclerViewAdapter);

        //Second Symptoms
        detail_second_symptoms_titles = new ArrayList<>();
        detail_second_symptoms_desc = new ArrayList<>();
        detail_second_symptoms_images = new ArrayList<>();

        detail_second_symptoms_titles.add("Nasal Congestion");
        detail_second_symptoms_titles.add("Aches and Pains");
        detail_second_symptoms_titles.add("Sore Throat");
        detail_second_symptoms_titles.add("Runny Nose");

        detail_second_symptoms_desc.add("Nasal congestion can have causes that aren't due to underlying disease.");
        detail_second_symptoms_desc.add("Body aches are a common symptom of many conditions. The flu is one of the most well-known conditions that can cause body aches.");
        detail_second_symptoms_desc.add("Sore throat can have causes that aren't due to underlying disease. Examples include overuse of voice, a burn from hot food, very dry mouth or sleeping with the mouth open.");
        detail_second_symptoms_desc.add("A runny nose is excess nasal drainage. It may be a thin clear fluid, thick mucus or something in between. The drainage may run out of your nose.");

        detail_second_symptoms_images.add(R.drawable.nasal_conjection);
        detail_second_symptoms_images.add(R.drawable.aches_pain);
        detail_second_symptoms_images.add(R.drawable.throat);
        detail_second_symptoms_images.add(R.drawable.runny_nose);

        recyclerViewAdapter_2 = new RecyclerViewAdapter(this,detail_second_symptoms_titles,detail_second_symptoms_desc,detail_second_symptoms_images,20);
        detail_second_symptos_recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        detail_second_symptos_recyclerView.setAdapter(recyclerViewAdapter_2);



    }
}