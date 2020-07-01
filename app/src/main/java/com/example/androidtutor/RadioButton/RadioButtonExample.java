package com.example.androidtutor.RadioButton;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RadioButtonExample extends Fragment {
    RadioButton r1, r2, r3;

    public RadioButtonExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.radiobuttonexample, container, false);
        r1 = v.findViewById(R.id.radio1);
        r2 = v.findViewById(R.id.radio2);
        r3 = v.findViewById(R.id.radio3);
        RadioGroup radiogroup = v.findViewById(R.id.radioattendgroup);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
                switch (i){
                    case R.id.radio1:
                        Toast.makeText(getContext(),"Your choice:  "+r1.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio2:
                        Toast.makeText(getContext(),"Your choice:  "+r2.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio3:
                        Toast.makeText(getContext(),"Your choice:  "+r3.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });



        return v;
    }

}
