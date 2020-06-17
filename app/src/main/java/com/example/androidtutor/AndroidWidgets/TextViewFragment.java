package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;

import com.example.androidtutor.Fragment.Tab2;
import com.example.androidtutor.Fragment.Tab3;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.example.androidtutor.TextView.Java;
import com.example.androidtutor.TextView.TextViewExample;
import com.example.androidtutor.TextView.XML;
import com.google.android.material.tabs.TabLayout;

public class TextViewFragment extends AppCompatActivity {

    private Button mapbutton;
    Button tut;

    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new TextViewExample(),"Example");
        adapter.addFragment(new Java(),"Java Code");
        adapter.addFragment(new XML(),"XML Code");
        viewpager.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_fragment);
        TabLayout tablayout= findViewById(R.id.tabs1);
        Toolbar toolbar=findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager1);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}