package com.example.androidtutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Slider3 extends AppCompatActivity {
    Button back2, next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider3);
        next2 = (Button)findViewById(R.id.n3);
        back2 = (Button)findViewById(R.id.b3);
        next2. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Slider3.this, Signin_Activity.class   ));
            }
        });

        back2. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Slider3.this, Slider2.class   ));
            }
        });


    }
}
