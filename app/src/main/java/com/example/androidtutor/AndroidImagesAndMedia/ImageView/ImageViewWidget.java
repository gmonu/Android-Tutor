package com.example.androidtutor.AndroidImagesAndMedia.ImageView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.androidtutor.PagerAdapter;
import com.example.androidtutor.R;
import com.google.android.material.tabs.TabLayout;

public class ImageViewWidget extends AppCompatActivity {
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new ImageViewExample(),"Example");
        adapter.addFragment(new ImageViewJava(),"Java Code");
        adapter.addFragment(new ImageViewXML(),"XML Code");
        viewpager.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_widget);
        TabLayout tablayout= findViewById(R.id.tabs3);
        Toolbar toolbar=findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager3);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
    }
}