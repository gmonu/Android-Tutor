package com.example.androidtutor.AndroidWidgets.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.AndroidImagesAndMedia.ImageButton.ImageButtonExample;
import com.example.androidtutor.AndroidImagesAndMedia.ImageButton.ImageButtonJava;
import com.example.androidtutor.AndroidImagesAndMedia.ImageButton.ImageButtonXML;

import com.example.androidtutor.Button.ButtonExample;
import com.example.androidtutor.Button.ButtonJava;
import com.example.androidtutor.Button.ButtonXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class ToggleButtonWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new ToggleButtonExample(),"Example");
        adapter.addFragment(new ToggleButtonJava(),"Java Code");
        adapter.addFragment(new ToggleButtonXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.togglebuttonwidget);
        TabLayout tablayout= findViewById(R.id.tabs10);
        Toolbar toolbar=findViewById(R.id.toolbar10);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager10);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}