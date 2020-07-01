package com.example.androidtutor.Button;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonExample extends Fragment {
    Button btn;

    public ButtonExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.button_example, container, false);
        btn = v.findViewById(R.id.btndemo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        // Inflate the layout for this fragment
       return v;
    }

}
