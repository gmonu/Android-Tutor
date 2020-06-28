package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.example.androidtutor.RatingBar.RatingBarExample;
import com.example.androidtutor.RatingBar.RatingBarJava;
import com.example.androidtutor.RatingBar.RatingBarXML;
import com.example.androidtutor.SeekBar.SeekBarExample;
import com.example.androidtutor.SeekBar.SeekBarJava;
import com.example.androidtutor.SeekBar.SeekBarXML;
import com.google.android.material.tabs.TabLayout;

public class SeekBarWidget extends AppCompatActivity {


    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new SeekBarExample(),"Example");
        adapter.addFragment(new SeekBarJava(),"Java Code");
        adapter.addFragment(new SeekBarXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_widget);
        TabLayout tablayout= findViewById(R.id.tabs8);
        Toolbar toolbar=findViewById(R.id.toolbar8);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager8);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}