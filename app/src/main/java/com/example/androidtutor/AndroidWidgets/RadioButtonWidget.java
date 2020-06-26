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
import com.example.androidtutor.RadioButton.RadioButtonExample;
import com.example.androidtutor.RadioButton.RadioButtonJava;
import com.example.androidtutor.RadioButton.RadioButtonXML;
import com.google.android.material.tabs.TabLayout;

public class RadioButtonWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new RadioButtonExample(),"Example");
        adapter.addFragment(new RadioButtonJava(),"Java Code");
        adapter.addFragment(new RadioButtonXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_widget);
        TabLayout tablayout= findViewById(R.id.tabs4);
        Toolbar toolbar=findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager4);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}