package com.example.androidtutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);


        final Intent i = new Intent(Splash_Screen.this,Slider1.class);
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(5000);//5 secs
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
