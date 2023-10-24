package com.example.covidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.view_holder> {


    List<String> titles;
    List<String> desc;
    List<Integer> images;
    LayoutInflater inflater;
    int validate_number;

    public RecyclerViewAdapter(Context context, List<String> titles, List<Integer> images,int validate_number) {
        this.titles = titles;
        this.images = images;
        this.validate_number = validate_number;
        this.inflater =LayoutInflater.from(context);
    }

    public RecyclerViewAdapter(Context context,List<String> titles, List<String> desc, List<Integer> images,int validate_number) {
        this.titles = titles;
        this.desc = desc;
        this.images = images;
        this.validate_number = validate_number;
        this.inflater =LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (validate_number == 10)
        {
            View v = inflater.inflate(R.layout.home_symptoms_card,parent,false);
            return new view_holder(v);
        }
        else if (validate_number == 20)
        {
            View v = inflater.inflate(R.layout.symptoms_and_safety_deatils,parent,false);
            return new view_holder(v);
        }
        else
        {
            View v = inflater.inflate(R.layout.home_symptoms_card,parent,false);
            return new view_holder(v);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.view_holder holder, int position) {

       if (validate_number==10)
       {
           holder.home_symptoms_tv.setText(titles.get(position));
           holder.home_symptoms_img.setImageResource(images.get(position));
       }
       else if (validate_number == 20)
       {
           holder.detail_heading.setText(titles.get(position));
           holder.detail_subheading.setText(desc.get(position));
           holder.detail_imageview.setImageResource(images.get(position));
       }
       else
       {
           holder.home_symptoms_tv.setText(titles.get(position));
           holder.home_symptoms_img.setImageResource(images.get(position));
       }

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }


    //View Holder Class
    public class view_holder extends RecyclerView.ViewHolder {

        TextView home_symptoms_tv;
        ImageView home_symptoms_img,detail_imageview;

        TextView detail_heading,detail_subheading;
        public view_holder(@NonNull View itemView) {
            super(itemView);

            if (validate_number == 10)
            {
                home_symptoms_tv = (TextView)itemView.findViewById(R.id.home_syptoms_card_textview);
                home_symptoms_img = (ImageView) itemView.findViewById(R.id.home_syptoms_card_imageview);

            } else if (validate_number == 20)
            {
                detail_heading=(TextView) itemView.findViewById(R.id.detail_heading_tv);
                detail_subheading=(TextView) itemView.findViewById(R.id.detail_description_tv);
                detail_imageview=(ImageView) itemView.findViewById(R.id.detail_imageview);
            }
            else
            {
                home_symptoms_tv = (TextView)itemView.findViewById(R.id.home_syptoms_card_textview);
                home_symptoms_img = (ImageView) itemView.findViewById(R.id.home_syptoms_card_imageview);
            }


        }
    }
}

