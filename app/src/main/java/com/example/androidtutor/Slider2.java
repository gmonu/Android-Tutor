package com.example.androidtutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Slider2 extends AppCompatActivity {
    Button next1, back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider2);
        next1 = (Button)findViewById(R.id.n2);
        back1 = (Button)findViewById(R.id.b2);

        next1. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Slider2.this, Slider3.class   ));
            }
        });
        back1. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Slider2.this, Slider1.class   ));
            }
        });
    }
}
