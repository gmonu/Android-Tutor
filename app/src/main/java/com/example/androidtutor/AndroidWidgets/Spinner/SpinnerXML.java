package com.example.androidtutor.AndroidWidgets.Spinner;


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
public class SpinnerXML extends Fragment {



    public SpinnerXML() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.spinnerxml, container, false);
    }

}
