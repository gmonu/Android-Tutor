package com.example.androidtutor.AndroidWidgets.MutilautocompleteTextview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;

public class MutoautocompleteExample extends Fragment {

    MultiAutoCompleteTextView MultiAutoCompleteTextViewDemo;
    TextView txtmultiautotext;
    String[] MnameList = {"Abhishek","Anad","Anurag","Avni","Bindiya","Bunny","Ban","Chandni","Champ","Charu","Dax","Dhruva",
            "Milan","Mayur","Mohit","Payal","Priti","Prachi","Kajal","Krisha","Kriva","Kishan","Kaushik","Hetal","Hina","Rahul","Rutvi",
            "Rutvik","Sneha","Shreya","Sarika","Zen"};
    public MutoautocompleteExample() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.mutoautocompleteexample, container, false);


        MultiAutoCompleteTextViewDemo=v.findViewById(R.id.MultiAutoCompleteTextViewDemo);
        txtmultiautotext=v.findViewById(R.id.txtmultiautotext);
        StringBuilder MeditText = new StringBuilder();
        MeditText.append("Input Value:").append("\n");

        for(String value: MnameList) {
            MeditText.append(value).append(", ");
        }
        txtmultiautotext.setText(MeditText);
        ArrayAdapter multiadpter= new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, MnameList);
        MultiAutoCompleteTextViewDemo.setAdapter(multiadpter);

        // set threshold value 1 that helps to start the searching from first character
        MultiAutoCompleteTextViewDemo.setThreshold(1);
        // set tokenizer that distinguish the various substrings by comma
        MultiAutoCompleteTextViewDemo.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        return v;
    }
}
