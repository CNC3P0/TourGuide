package com.example.robert.tourguide;

/**
 * Created by Robert on 10/7/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    View view;

    TextView blurbText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.blank_fragment, container, false);
        return view;
    }

    public void updateText() {
        Bundle bundle = this.getActivity().getIntent().getExtras();
        String blurb = bundle.getString("message");
        blurbText = view.findViewById(R.id.blurb_text);
        blurbText.setText(blurb);
    }

}