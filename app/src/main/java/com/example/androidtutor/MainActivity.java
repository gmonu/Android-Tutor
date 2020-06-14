package com.example.androidtutor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.androidtutor.Fragment.Tab1;
import com.example.androidtutor.Fragment.Tab2;
import com.example.androidtutor.Fragment.Tab3;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private Button logout;
    private Button mapbutton;
    Button tut;
    private void setupViewpager(ViewPager viewpager){
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(),1);
        adapter.addFragment(new Tab1(),"Tutorial");
        adapter.addFragment(new Tab2(),"Quiz");
        adapter.addFragment(new Tab3(),"Interview Q's");
        viewpager.setAdapter(adapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tablayout= findViewById(R.id.tabs);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewPager viewpager=findViewById(R.id.viewpager);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);
//        tut = (Button)findViewById(R.id.button1);
//        tut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Tutorial.class));
//            }
//        });
        firebaseAuth = FirebaseAuth.getInstance();
//        logout = (Button)findViewById(R.id.btnlogout);
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                logout();
//            }
//        });




    }

    private void logout()
    {
        firebaseAuth.getInstance().signOut();
        finish();;
        startActivity(new Intent(MainActivity.this, Signin_Activity.class));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.logourMenu:{
                logout();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
