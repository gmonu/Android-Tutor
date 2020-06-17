package com.example.androidtutor.AndroidWidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.androidtutor.EditText.EditTextExample;
import com.example.androidtutor.EditText.EditTextJava;
import com.example.androidtutor.EditText.EditTextXML;
import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.example.androidtutor.TextView.Java;
import com.example.androidtutor.TextView.TextViewExample;
import com.example.androidtutor.TextView.XML;
import com.google.android.material.tabs.TabLayout;

public class EditText extends AppCompatActivity {

    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new EditTextExample(),"Example");
        adapter.addFragment(new EditTextJava(),"Java Code");
        adapter.addFragment(new EditTextXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        TabLayout tablayout= findViewById(R.id.tabs2);
        Toolbar toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager2);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}