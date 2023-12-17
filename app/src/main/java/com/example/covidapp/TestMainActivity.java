package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class TestMainActivity extends AppCompatActivity {

    LinearLayout disclaimer_layout;
    CheckBox disclaimer_checkbox;
    CardView cardview_layout_q1,cardview_layout_q2,cardview_layout_q3,cardview_layout_q4,cardview_layout_q5,cardview_layout_q6;
    CardView cardview_layout_q7,cardview_layout_q8,cardview_layout_q9,cardview_layout_q10,cardview_layout_q11,cardview_layout_q12;
    RadioButton Q1Yes, Q1No, Q2Yes, Q2No, Q3Yes, Q3No, Q4Yes, Q4No, Q5Yes, Q5No;
    RadioButton Q6Yes, Q6No, Q7Yes, Q7No, Q8Yes, Q8No, Q9Yes, Q9No, Q10Yes, Q10No, Q11Yes, Q11No, Q12Yes, Q12No;

    RadioButton sq1_dry,sq1_cold;
    RelativeLayout relativeLayout_q1,relativeLayout_q2,relativeLayout_q3,relativeLayout_q4,relativeLayout_q5,relativeLayout_q6;
    RelativeLayout relativeLayout_q7,relativeLayout_q8,relativeLayout_q9,relativeLayout_q10,relativeLayout_q11,relativeLayout_q12;
    RelativeLayout next_btn_relative_layout;
    LinearLayout result_layout;
    CardView cardview_layout_next_btn;
    TextView disclaimer_accept_btn;
    Integer question_counter=1;
    Boolean button_flag = false;
    ScrollView scrollview_main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);

        //Disclaimer
        disclaimer_layout=(LinearLayout) findViewById(R.id.disclaimer_main_layout);
        disclaimer_checkbox = (CheckBox) findViewById(R.id.disclaimer_checkBox1);
        disclaimer_accept_btn = (TextView) findViewById(R.id.disclaimer_accept_button);

        //Question Card Layout
        cardview_layout_q1 = (CardView) findViewById(R.id.first_question_cardlayout);
        cardview_layout_q2 = (CardView) findViewById(R.id.second_question_cardlayout);
        cardview_layout_q3 = (CardView) findViewById(R.id.third_question_cardlayout);
        cardview_layout_q4 = (CardView) findViewById(R.id.fourth_question_cardlayout);
        cardview_layout_q5 = (CardView) findViewById(R.id.fifth_question_cardlayout);
        cardview_layout_q6 = (CardView) findViewById(R.id.sixth_question_cardlayout);
        cardview_layout_q7 = (CardView) findViewById(R.id.seventh_question_cardlayout);
        cardview_layout_q8 = (CardView) findViewById(R.id.eighth_question_cardlayout);
        cardview_layout_q9 = (CardView) findViewById(R.id.nineth_question_cardlayout);
        cardview_layout_q10 = (CardView) findViewById(R.id.tenth_question_cardlayout);
        cardview_layout_q11 = (CardView) findViewById(R.id.eleventh_question_cardlayout);
        cardview_layout_q12 = (CardView) findViewById(R.id.twelfth_question_cardlayout);
        cardview_layout_next_btn = (CardView) findViewById(R.id.next_button_cardview_layout);
        next_btn_relative_layout = (RelativeLayout) findViewById(R.id.nextbutton_quiz_layout);

        //Subquestion Layout
        relativeLayout_q1 = (RelativeLayout)findViewById(R.id.sub_part_question1_layout);
        relativeLayout_q2 = (RelativeLayout)findViewById(R.id.sub_part_question2_layout);
        relativeLayout_q3 = (RelativeLayout)findViewById(R.id.sub_part_question3_layout);
        relativeLayout_q4 = (RelativeLayout)findViewById(R.id.sub_part_question4_layout);
        relativeLayout_q5 = (RelativeLayout)findViewById(R.id.sub_part_question5_layout);
        relativeLayout_q6 = (RelativeLayout)findViewById(R.id.sub_part_question6_layout);
        relativeLayout_q7 = (RelativeLayout)findViewById(R.id.sub_part_question7_layout);
        relativeLayout_q8 = (RelativeLayout)findViewById(R.id.sub_part_question8_layout);
        relativeLayout_q9 = (RelativeLayout)findViewById(R.id.sub_part_question9_layout);
        relativeLayout_q10 = (RelativeLayout)findViewById(R.id.sub_part_question10_layout);
        relativeLayout_q11 = (RelativeLayout)findViewById(R.id.sub_part_question11_layout);
        relativeLayout_q12 = (RelativeLayout)findViewById(R.id.sub_part_question12_layout);

        //Radio buttons of Question 1
        Q1Yes = (RadioButton)findViewById(R.id.q1_radioButton1);
        Q1No = (RadioButton)findViewById(R.id.q1_radioButton2);
        sq1_dry = (RadioButton)findViewById(R.id.q1_subradioButton1);
        sq1_cold = (RadioButton)findViewById(R.id.q1_subradioButton2);

        //Main Layout
        scrollview_main_layout = (ScrollView) findViewById(R.id.main_scrollview_layout_bg);

        //Result Layout
        result_layout = (LinearLayout) findViewById(R.id.result_display_layout);


        //Left_to_right_move animation is used on the second question which is going to be appear after the first question
        //Right_move animation is used on first question at the same time to change the question and looks good
        Animation animation_right = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_move);
        Animation animation_down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        Animation animation_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        Animation animation_left = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right_move);
        Animation animation_fade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);

        //disclaimer_layout.setVisibility(View.VISIBLE);
        disclaimer_layout.setVisibility(View.VISIBLE);

        //Questions Layout
        cardview_layout_q1.setVisibility(View.GONE);
        cardview_layout_q2.setVisibility(View.GONE);
        cardview_layout_q3.setVisibility(View.GONE);
        cardview_layout_q4.setVisibility(View.GONE);
        cardview_layout_q5.setVisibility(View.GONE);
        cardview_layout_q6.setVisibility(View.GONE);
        cardview_layout_q7.setVisibility(View.GONE);
        cardview_layout_q8.setVisibility(View.GONE);
        cardview_layout_q9.setVisibility(View.GONE);
        cardview_layout_q10.setVisibility(View.GONE);
        cardview_layout_q11.setVisibility(View.GONE);
        cardview_layout_q12.setVisibility(View.GONE);
        next_btn_relative_layout.setVisibility(View.GONE);
        result_layout.setVisibility(View.GONE);

        disclaimer_accept_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (disclaimer_checkbox.isChecked())
                {
                    disclaimer_layout.setVisibility(View.GONE);
                    cardview_layout_q1.setVisibility(View.VISIBLE);

                    relativeLayout_q1.setVisibility(View.GONE);
                    next_btn_relative_layout.setVisibility(View.VISIBLE);
                }
                else
                {
                    Toast.makeText(TestMainActivity.this, "Please agree with terms and conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Q1Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Q1Yes.isChecked())
                {
                    relativeLayout_q1.startAnimation(animation_down);
                    relativeLayout_q1.setVisibility(View.VISIBLE);
                }
                if (Q1No.isChecked())
                {
                    question_counter = 2;
                }

            }
        });

        Q1No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Q1No.isChecked())
                {
                    question_counter = 2;
                    relativeLayout_q1.startAnimation(animation_up);
                    animation_up.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            relativeLayout_q1.setVisibility(View.GONE);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                }
            }
        });

        sq1_cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sq1_cold.isChecked())
                {
                    question_counter = 2;
                }
            }
        });

        sq1_dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sq1_cold.isChecked())
                {
                    question_counter = 2;
                }
            }
        });

        cardview_layout_next_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                switch (question_counter)
                {
                    case 1:
                        cardview_layout_q1.startAnimation(animation_right);
                        cardview_layout_q2.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.VISIBLE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        next_btn_relative_layout.setVisibility(View.VISIBLE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 2:
                        cardview_layout_q2.startAnimation(animation_right);
                        cardview_layout_q3.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.VISIBLE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        next_btn_relative_layout.setVisibility(View.VISIBLE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 3:
                        cardview_layout_q3.startAnimation(animation_right);
                        cardview_layout_q4.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.VISIBLE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        next_btn_relative_layout.setVisibility(View.VISIBLE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 4:
                        cardview_layout_q4.startAnimation(animation_right);
                        cardview_layout_q5.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.VISIBLE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 5:
                        cardview_layout_q5.startAnimation(animation_right);
                        cardview_layout_q6.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.VISIBLE);
                        cardview_layout_q7.setVisibility(View.GONE);;
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 6:
                        cardview_layout_q6.startAnimation(animation_right);
                        cardview_layout_q7.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.VISIBLE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 7:
                        cardview_layout_q7.startAnimation(animation_right);
                        cardview_layout_q8.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.VISIBLE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 8:
                        cardview_layout_q8.startAnimation(animation_right);
                        cardview_layout_q9.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.VISIBLE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 9:
                        cardview_layout_q9.startAnimation(animation_right);
                        cardview_layout_q10.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.VISIBLE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 10:
                        cardview_layout_q10.startAnimation(animation_right);
                        cardview_layout_q11.startAnimation(animation_left);

                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.VISIBLE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        result_layout.setVisibility(View.GONE);

                        break;

                    case 11:
                        cardview_layout_q11.startAnimation(animation_right);
                        cardview_layout_q12.startAnimation(animation_left);
                        cardview_layout_q1.setVisibility(View.GONE);
                        cardview_layout_q2.setVisibility(View.GONE);
                        cardview_layout_q3.setVisibility(View.GONE);
                        cardview_layout_q4.setVisibility(View.GONE);
                        cardview_layout_q5.setVisibility(View.GONE);
                        cardview_layout_q6.setVisibility(View.GONE);
                        cardview_layout_q7.setVisibility(View.GONE);
                        cardview_layout_q8.setVisibility(View.GONE);
                        cardview_layout_q9.setVisibility(View.GONE);
                        cardview_layout_q10.setVisibility(View.GONE);
                        cardview_layout_q11.setVisibility(View.GONE);
                        cardview_layout_q12.setVisibility(View.VISIBLE);
                        result_layout.setVisibility(View.GONE);
                        break;

                    case 12:
                        cardview_layout_q12.setAnimation(animation_right);
                        next_btn_relative_layout.setAnimation(animation_right);
                        result_layout.setVisibility(View.VISIBLE);
                        cardview_layout_q12.setVisibility(View.GONE);
                        next_btn_relative_layout.setVisibility(View.GONE);
                        //result_layout.startAnimation(animation_fade);
                        //Toast.makeText(TestMainActivity.this, " "+question_counter, Toast.LENGTH_SHORT).show();
                        scrollview_main_layout.setBackgroundResource(R.color.colorPrimaryDark);
                        break;


                }
            }
        });
    }
}