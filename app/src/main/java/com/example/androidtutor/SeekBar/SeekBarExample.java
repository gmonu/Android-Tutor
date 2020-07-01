package com.example.androidtutor.SeekBar;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SeekBarExample extends Fragment {

    SeekBar seekbarDemo;
    public SeekBarExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.activity_seek_bar_example, container, false);
        seekbarDemo=v.findViewById(R.id.seekbarDemo);
        seekbarDemo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int seekbarProgreesValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbarProgreesValue = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getContext(), "Seekbar progress :" +  seekbarProgreesValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}
