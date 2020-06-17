package com.example.androidtutor.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.AndroidWidgets.TextViewFragment;
import com.example.androidtutor.R;
import com.example.androidtutor.TextView.TextViewExample;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1 extends Fragment {


    public Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.activity_tutorial, container, false);
        Button textview = v.findViewById(R.id.t1);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment to activity
                startActivity(new Intent(getContext(), TextViewFragment.class));
            }
        });

    return v;
    }

}
