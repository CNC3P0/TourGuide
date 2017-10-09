package com.example.robert.tourguide;

/**
 * Created by Robert on 10/7/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    View view;
    Button blankButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.blank_fragment, container, false);
// get the reference of Button
        blankButton = (Button) view.findViewById(R.id.blankButton);
// perform setOnClickListener on second Button
        blankButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "Blank Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}