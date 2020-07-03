package com.example.androidtutor.AndroidWidgets.CheckTextview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.androidtutor.R;

public class ChecktextviewExample extends Fragment {

    CheckedTextView text;
    public ChecktextviewExample() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.checktextviewexample, container, false);
        text = v.findViewById(R.id.text);
        text.setCheckMarkDrawable(null);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setCheckMarkDrawable(R.drawable.check);
            }
        });

        return v;
    }
}
