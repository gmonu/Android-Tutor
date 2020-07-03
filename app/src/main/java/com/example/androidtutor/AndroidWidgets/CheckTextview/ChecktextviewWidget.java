package com.example.androidtutor.AndroidWidgets.CheckTextview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class ChecktextviewWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new ChecktextviewExample(),"Example");
        adapter.addFragment(new ChecktextviewJava(),"Java Code");
        adapter.addFragment(new ChecktextviewXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checktextviewwidget);
        TabLayout tablayout= findViewById(R.id.tabs14);
        Toolbar toolbar=findViewById(R.id.toolbar14);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager14);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}