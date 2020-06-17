package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.Button.ButtonExample;
import com.example.androidtutor.Button.ButtonJava;
import com.example.androidtutor.Button.ButtonXML;
import com.example.androidtutor.EditText.EditTextExample;
import com.example.androidtutor.EditText.EditTextJava;
import com.example.androidtutor.EditText.EditTextXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class Button extends AppCompatActivity {

    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new ButtonExample(),"Example");
        adapter.addFragment(new ButtonJava(),"Java Code");
        adapter.addFragment(new ButtonXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        TabLayout tablayout= findViewById(R.id.tabs3);
        Toolbar toolbar=findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager3);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}