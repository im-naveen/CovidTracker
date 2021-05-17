package com.naveen.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview_confirmed, textview_confirmed_new, textview_active, textview_active_new, textview_recovered, textview_recovered_new, textview_death,
            textview_death_new, textview_tests, textview_tests_new, textview_date, textview_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}