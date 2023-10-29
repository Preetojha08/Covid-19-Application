package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CovidHelpCenterActivity extends AppCompatActivity {

    List<String> helpcenter_act_titles;
    List<String> helpcenter_act_desc;
    List<Integer> helpcenter_act_images;
    RecyclerView covid_helpcenter_rv;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_help_center);

        covid_helpcenter_rv = (RecyclerView) findViewById(R.id.covid_helpcenter_recyclerview);

        helpcenter_act_titles = new ArrayList<>();
        helpcenter_act_desc = new ArrayList<>();
        helpcenter_act_images = new ArrayList<>();

        helpcenter_act_titles.add("Hospital NO 1");
        helpcenter_act_titles.add("Hospital NO 2");
        helpcenter_act_titles.add("Hospital NO 3");
        helpcenter_act_titles.add("Hospital NO 4");
        helpcenter_act_titles.add("Hospital NO 5");

        helpcenter_act_titles.add("Hospital NO 6");
        helpcenter_act_titles.add("Hospital NO 7");
        helpcenter_act_titles.add("Hospital NO 8");

        helpcenter_act_desc.add("123 Main Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");
        helpcenter_act_desc.add("789 Doll Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");
        helpcenter_act_desc.add("852 Subway Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");
        helpcenter_act_desc.add("639 Ojha Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");
        helpcenter_act_desc.add("159 This Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");

        helpcenter_act_desc.add("397 Lain Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");
        helpcenter_act_desc.add("777 Lain Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");
        helpcenter_act_desc.add("789 Doll Street Near Toronto Mall X230Pl, Ontario \nContact: +1 123-123-1231");

        helpcenter_act_images.add(R.drawable.covid_help_center);
        helpcenter_act_images.add(R.drawable.covid_help_center);
        helpcenter_act_images.add(R.drawable.covid_help_center);
        helpcenter_act_images.add(R.drawable.covid_help_center);
        helpcenter_act_images.add(R.drawable.covid_help_center);

        helpcenter_act_images.add(R.drawable.covid_help_center);
        helpcenter_act_images.add(R.drawable.covid_help_center);
        helpcenter_act_images.add(R.drawable.covid_help_center);

        recyclerViewAdapter = new RecyclerViewAdapter(this,helpcenter_act_titles,helpcenter_act_desc,helpcenter_act_images,20);
        covid_helpcenter_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        covid_helpcenter_rv.setAdapter(recyclerViewAdapter);

    }
}