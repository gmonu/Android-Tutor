package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.CheckBox.CheckBoxExample;
import com.example.androidtutor.CheckBox.CheckBoxJava;
import com.example.androidtutor.CheckBox.CheckBoxXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.ProgressBar.ProgressBarExample;
import com.example.androidtutor.ProgressBar.ProgressBarJava;
import com.example.androidtutor.ProgressBar.ProgressBarXML;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class ProgressBarWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new ProgressBarExample(),"Example");
        adapter.addFragment(new ProgressBarJava(),"Java Code");
        adapter.addFragment(new ProgressBarXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_widget);
        TabLayout tablayout= findViewById(R.id.tabs7);
        Toolbar toolbar=findViewById(R.id.toolbar7);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager7);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}