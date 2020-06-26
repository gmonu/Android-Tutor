package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.Button.ButtonExample;
import com.example.androidtutor.Button.ButtonJava;
import com.example.androidtutor.Button.ButtonXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.example.androidtutor.RatingBar.RatingBarExample;
import com.example.androidtutor.RatingBar.RatingBarJava;
import com.example.androidtutor.RatingBar.RatingBarXML;
import com.google.android.material.tabs.TabLayout;

public class RatingBarWidget extends AppCompatActivity {

    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new RatingBarExample(),"Example");
        adapter.addFragment(new RatingBarJava(),"Java Code");
        adapter.addFragment(new RatingBarXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_widget);
        TabLayout tablayout= findViewById(R.id.tabs6);
        Toolbar toolbar=findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager6);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}