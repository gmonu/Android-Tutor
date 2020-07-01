package com.example.androidtutor.AndroidWidgets.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.Button.ButtonExample;
import com.example.androidtutor.Button.ButtonJava;
import com.example.androidtutor.Button.ButtonXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class SpinnerWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new SpinnerExample(),"Example");
        adapter.addFragment(new SpinnerJava(),"Java Code");
        adapter.addFragment(new SpinnerXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerwidget);
        TabLayout tablayout= findViewById(R.id.tabs11);
        Toolbar toolbar=findViewById(R.id.toolbar11);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager11);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}