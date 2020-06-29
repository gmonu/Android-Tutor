package com.example.androidtutor.RatingBar;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RatingBarExample extends Fragment {
    RatingBar ratingBar;

    public RatingBarExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_rating_bar_example, container, false);
        // Inflate the layout for this fragment

        ratingBar=v.findViewById(R.id.rating);
        Button ratingsubmitButton=v.findViewById(R.id.ratingbutton);

        ratingsubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rvalue=ratingBar.getRating();
                Toast.makeText(getContext(),"Rating:  "+rvalue,Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }

}
