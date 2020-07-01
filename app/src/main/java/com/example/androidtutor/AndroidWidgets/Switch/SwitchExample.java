package com.example.androidtutor.AndroidWidgets.Switch;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SwitchExample extends Fragment {

    Switch SwitchDemo;
    LinearLayout switchLayout;

    public SwitchExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.switchexample, container, false);
        switchLayout=v.findViewById(R.id.switchlayout);
        SwitchDemo = v.findViewById(R.id.SwitchDemo);

        SwitchDemo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SwitchDemo.isChecked())
                {
                    switchLayout.setBackgroundColor(Color.YELLOW);
                    Toast.makeText(getContext(), "SwitchState :" + SwitchDemo.getTextOn().toString(), Toast.LENGTH_LONG).show();
                }
                else {
                    switchLayout.setBackgroundColor(Color.RED);
                    Toast.makeText(getContext(), "SwitchState :" + SwitchDemo.getTextOff().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
                return v;
    }

}
