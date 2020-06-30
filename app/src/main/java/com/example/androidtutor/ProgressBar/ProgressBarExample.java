package com.example.androidtutor.ProgressBar;


import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgressBarExample extends Fragment {

    ProgressBar progressbarDemo;
    Button btnprogressbar;
    private int progressStatus = 0;
    private Handler handler = new Handler();

    public ProgressBarExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_progress_bar_example, container, false);
        progressbarDemo = v.findViewById(R.id.ProgressBarDemo);
        btnprogressbar= v.findViewById(R.id.btnprogressbar);

        btnprogressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    public void run() {
                        while (progressStatus < 100) {
                            progressStatus += 10;

                            handler.post(new Runnable() {
                                public void run() {
                                    progressbarDemo.setProgress(progressStatus);
                                    if(progressStatus==100) {
                                        progressbarDemo.setProgress(progressStatus);
                                        Toast.makeText(getContext(), "Download Complete", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
        return v;
    }

}
