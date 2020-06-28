package com.example.androidtutor.AndroidImagesAndMedia.ImageButton;

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

public class ImageButtonWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new ImageButtonExample(),"Example");
        adapter.addFragment(new ImageButtonJava(),"Java Code");
        adapter.addFragment(new ImageButtonXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button_widget);
        TabLayout tablayout= findViewById(R.id.tabs3);
        Toolbar toolbar=findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager3);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}