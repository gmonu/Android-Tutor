package com.example.androidtutor.CheckBox;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.Button.ButtonExample;
import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CheckBoxExample extends Fragment {

    CheckBox c1, c2;
    public CheckBoxExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_check_box_example, container, false);
        c1 = v.findViewById(R.id.it);
        c2 = v.findViewById(R.id.cse);
        Button b = v.findViewById(R.id.checkbutton);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked())
                {
                    Toast.makeText(getContext(), "Congrats You got IT course", Toast.LENGTH_SHORT).show();

                }
                if(c2.isChecked())
                {
                    Toast.makeText(getContext(), "Congrats You got CSE course", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Inflate the layout for this fragment
        return v;
    }

}
