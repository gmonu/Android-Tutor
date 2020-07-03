package com.example.androidtutor.AndroidWidgets.MutilautocompleteTextview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class MutoautocompleteWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new MutoautocompleteExample(),"Example");
        adapter.addFragment(new MutoautocompleteJava(),"Java Code");
        adapter.addFragment(new MutoautocompleteXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mutoautocompletewidget);
        TabLayout tablayout= findViewById(R.id.tabs13);
        Toolbar toolbar=findViewById(R.id.toolbar13);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager13);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}