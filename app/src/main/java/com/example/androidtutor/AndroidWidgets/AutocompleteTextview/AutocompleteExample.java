package com.example.androidtutor.AndroidWidgets.AutocompleteTextview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;

public class AutocompleteExample extends Fragment {

    AutoCompleteTextView AutoCompleteTextViewDemo;
    TextView txtautotext;
    String[] nameList = {"Abhishek","Anand","Aarav","Avni","Bindiya","Bunny","Bumi","Chandni","Chatur","Charu","Divyansh","Dhruva",
            "Milan","Monu","Mohit","Payal","Priti","Prachi","Kajal","Karandeep","Kriva","Kishan","Kaushik","Hetal","Hina","Rahul","Rutvi",
            "Rutvik","Sneha","Shreya","Sarika","Zuha"};
    public AutocompleteExample() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.autocompleteexample, container, false);


        AutoCompleteTextViewDemo = v.findViewById(R.id.AutoCompleteTextViewDemo);
        txtautotext=v.findViewById(R.id.txtautotext);
        StringBuilder editText = new StringBuilder();
        editText.append("Input Value:").append("\n");

        for(String value: nameList) {
            editText.append(value).append(", ");
        }
        txtautotext.setText(editText);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, nameList);
        AutoCompleteTextViewDemo.setAdapter(adapter);
        AutoCompleteTextViewDemo.setThreshold(1);
        AutoCompleteTextViewDemo.setAdapter(adapter);

        return v;
    }
}
