package com.example.androidtutor.AndroidWidgets.AutocompleteTextview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class AutocompleteWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new AutocompleteExample(),"Example");
        adapter.addFragment(new AutocompleteJava(),"Java Code");
        adapter.addFragment(new AutocompleteXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompletewidget);
        TabLayout tablayout= findViewById(R.id.tabs12);
        Toolbar toolbar=findViewById(R.id.toolbar12);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager12);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}