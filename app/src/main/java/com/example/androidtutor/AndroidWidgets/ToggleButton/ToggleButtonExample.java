package com.example.androidtutor.AndroidWidgets.ToggleButton;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ToggleButtonExample extends Fragment {
    ToggleButton ToggleButtonDemo;

    public ToggleButtonExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.togglebuttonexample, container, false);

        ToggleButtonDemo = v.findViewById(R.id.ToggleButtonDemo);
        ToggleButtonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ToggleButtonDemo.isChecked()){
                    Toast.makeText(getContext(),"ToggleButton:-"+ToggleButtonDemo.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getContext(),"ToggleButton:-"+ToggleButtonDemo.getText().toString(), Toast.LENGTH_LONG).show();
                }

            }
        });

        return v;
    }

}
