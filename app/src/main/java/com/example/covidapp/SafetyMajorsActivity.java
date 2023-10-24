package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SafetyMajorsActivity extends AppCompatActivity {

    List<String> detail_safety_majors_titles;
    List<String> detail_safety_majors_desc;
    List<Integer> detail_safety_majors_images;
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView detail_safety_majors_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_majors);

        detail_safety_majors_rv=(RecyclerView) findViewById(R.id.detail_safetymajor_recyclerview);

        detail_safety_majors_titles = new ArrayList<>();
        detail_safety_majors_desc = new ArrayList<>();
        detail_safety_majors_images = new ArrayList<>();

        detail_safety_majors_titles.add("Wash your Hands Frequently");
        detail_safety_majors_titles.add("Wear Mask before going Outside");
        detail_safety_majors_titles.add("Maintain Social Distancing");
        detail_safety_majors_titles.add("Avoid Touching Face");
        detail_safety_majors_titles.add("Practice respiratory hygiene");

        detail_safety_majors_titles.add("Seek early medical care");
        detail_safety_majors_titles.add("Clean Everything");
        detail_safety_majors_titles.add("Vitamins And Supplements For Immunity");
        detail_safety_majors_titles.add("Consume Liquids");
        detail_safety_majors_titles.add("Check Only Valid Information");

        detail_safety_majors_titles.add("Spend Time With Family ");

        detail_safety_majors_desc.add("Regularly and thoroughly clean your hands with an alcohol - based hand sanitizer or wash them with soap and water after coming from outside and in every three hours interval.    ");
        detail_safety_majors_desc.add("Wear a mask if you are coughing or sneezing. Masks are effective only when used in combination with frequent hand-cleaning with alcohol-based hand rub or soap and water.");
        detail_safety_majors_desc.add("Its time to practice social distancing, which simply implies to staying at home. Maintain at least 1 metre (3 feet) distance between yourself and who is coughing or sneezing.   ");
        detail_safety_majors_desc.add("Hands touch many surfaces and can pick up viruses. Once contaminated, hands can transfer the virus to your eyes, nose or mouth. So don not touch your Face.   ");
        detail_safety_majors_desc.add("Make sure you, and the people around you, follow good respiratory hygiene. This means covering your mouth and nose with your bent elbow or tissue when you cough or sneeze.       ");

        detail_safety_majors_desc.add("If you have a fever, cough and difficulty breathing, seek medical attention, call in advance and stay at home.         ");
        detail_safety_majors_desc.add("Disinfect everything that you touch every frequently. From doorknobs, lights, handles, surfaces, TV remotes, drawers, washbasin to toilets, make sure everything is clean.      ");
        detail_safety_majors_desc.add("Include essential vitamin supplements like vitamin B12 with Methylcobalamin, vitamin D3, vitamin C and turmeric in your diet.    ");
        detail_safety_majors_desc.add("Coconut water, lemon water, water with vitamin C supplements drink as much as possible to flush the toxins and strengthen your immune system.         ");
        detail_safety_majors_desc.add("Lot information is available out there on TV, internet and social media. But not everything is true. Please be careful about what is read and consumed.     ");

        detail_safety_majors_desc.add("What no one could do, this virus has done. Bring families together. Before we all get engrossed in our lives again let's spend some quality time with our families. Bond over food, books, talks, and play dates.   ");

        detail_safety_majors_images.add(R.drawable.handwash);
        detail_safety_majors_images.add(R.drawable.mask);
        detail_safety_majors_images.add(R.drawable.social_distance);
        detail_safety_majors_images.add(R.drawable.avoid_touch);
        detail_safety_majors_images.add(R.drawable.hygine);

        detail_safety_majors_images.add(R.drawable.medical_care);
        detail_safety_majors_images.add(R.drawable.clean_everything);
        detail_safety_majors_images.add(R.drawable.vitamines);
        detail_safety_majors_images.add(R.drawable.liquid);
        detail_safety_majors_images.add(R.drawable.vaild);

        detail_safety_majors_images.add(R.drawable.family);

        recyclerViewAdapter = new RecyclerViewAdapter(this,detail_safety_majors_titles,detail_safety_majors_desc,detail_safety_majors_images,20);
        detail_safety_majors_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        detail_safety_majors_rv.setAdapter(recyclerViewAdapter);
    }
}