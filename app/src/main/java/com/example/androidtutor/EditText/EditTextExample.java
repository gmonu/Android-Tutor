package com.example.androidtutor.EditText;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditTextExample extends Fragment {
    private EditText editText;

    public EditTextExample() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.edit_text_example, container, false);
        editText = v.findViewById(R.id.edtdemo);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.edit_text_example, container, false);
    }

}
