package com.example.androidtutor.AndroidWidgets.Spinner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;
public class SpinnerExample extends Fragment {
    Spinner spinnercity;
    public SpinnerExample() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.spinnerexample, container, false);

        spinnercity = v.findViewById(R.id.spinnercity);
         String[] cities = {"New Delhi", "Mumbai", "Patna", "Bangalore", "Ahemdabad"};
         ArrayAdapter<String> adapter =  new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_dropdown_item, cities);
        spinnercity.setAdapter(adapter);
        return v;
    }


}
