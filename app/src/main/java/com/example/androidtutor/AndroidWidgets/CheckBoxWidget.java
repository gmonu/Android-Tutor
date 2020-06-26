package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.CheckBox;

import com.example.androidtutor.CheckBox.CheckBoxExample;
import com.example.androidtutor.CheckBox.CheckBoxJava;
import com.example.androidtutor.CheckBox.CheckBoxXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.example.androidtutor.RadioButton.RadioButtonExample;
import com.example.androidtutor.RadioButton.RadioButtonJava;
import com.example.androidtutor.RadioButton.RadioButtonXML;
import com.google.android.material.tabs.TabLayout;

public class CheckBoxWidget extends AppCompatActivity {

    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new CheckBoxExample(),"Example");
        adapter.addFragment(new CheckBoxJava(),"Java Code");
        adapter.addFragment(new CheckBoxXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_widget);
        TabLayout tablayout= findViewById(R.id.tabs5);
        Toolbar toolbar=findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager5);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);

    }
}