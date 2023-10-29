package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuarantineActivity extends AppCompatActivity {

    List<String> detail_quaratine_act_titles;
    List<String> detail_quaratine_act_desc;
    List<Integer> detail_quaratine_act_images;
    RecyclerView quaratine_rv;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine);

        quaratine_rv = (RecyclerView) findViewById(R.id.quarantine_recyclerview);

        detail_quaratine_act_titles = new ArrayList<>();
        detail_quaratine_act_desc = new ArrayList<>();
        detail_quaratine_act_images = new ArrayList<>();

        //Title
        detail_quaratine_act_titles.add("Do Exercise At Home");
        detail_quaratine_act_titles.add("Try To Learn New Recipes");
        detail_quaratine_act_titles.add("Grab A Book and Relax");
        detail_quaratine_act_titles.add("Connect With Friends");
        detail_quaratine_act_titles.add("Watch Classic Sports Replays");

        detail_quaratine_act_titles.add("Watch New Shows and Movies");
        detail_quaratine_act_titles.add("Learn New Language");

        //Description
        detail_quaratine_act_desc.add("Exercise empties the mind and fills you with positivity and power. Perfect for getting in the right mindset for the day ahead. Try to do at least one gym class every day.");
        detail_quaratine_act_desc.add("It is such a fulfilling activity that we can do with our families and enjoy spending some time together, while cooking delicious cakes and etc.");
        detail_quaratine_act_desc.add("Find a comfy place around your house. Grab a book and get immersed in it; you don’t have any time limits or schedules to follow.");
        detail_quaratine_act_desc.add("Whether you prefer to use WhatsApp, Skype, Netflix Party, or any other platform that you like, take a moment every day to connect with your friends.");
        detail_quaratine_act_desc.add("There are no live sports to watch on TV right now. But there is something amazing going on around the world: many of the classic sports matches from history are being replayed on TV!");

        detail_quaratine_act_desc.add("We always want more and more time to watch new shows, series and movies. The newest season of Netflix’s world famous and addictive La Casa de Papel (Money Heist) series came out just a few weeks ago.");
        detail_quaratine_act_desc.add("It is as easy as downloading an app like Duolingo, choosing the language you would like to learn and do a little bit of it every day.");

        detail_quaratine_act_images.add(R.drawable.exercise);
        detail_quaratine_act_images.add(R.drawable.recipes);
        detail_quaratine_act_images.add(R.drawable.books);
        detail_quaratine_act_images.add(R.drawable.make_friends);
        detail_quaratine_act_images.add(R.drawable.replay);

        detail_quaratine_act_images.add(R.drawable.youtube);
        detail_quaratine_act_images.add(R.drawable.foreign_language);

        recyclerViewAdapter = new RecyclerViewAdapter(this,detail_quaratine_act_titles,detail_quaratine_act_desc,detail_quaratine_act_images,20);
        quaratine_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        quaratine_rv.setAdapter(recyclerViewAdapter);

    }
}