package com.example.androidtutor.RadioButton;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RadioButtonXML extends Fragment {


    public RadioButtonXML() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.radiobuttonxml, container, false);
    }

}
