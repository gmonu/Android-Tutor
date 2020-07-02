package com.example.androidtutor.AndroidImagesAndMedia.ImageButton;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

import com.example.androidtutor.R;
public class ImageButtonExample extends Fragment {
    private ImageButton imgbt;
    public ImageButtonExample() {
    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_imagebutton_example, container, false);
        imgbt=v.findViewById(R.id.imgbt);
        imgbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"ImageButton was Clicked!",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}
