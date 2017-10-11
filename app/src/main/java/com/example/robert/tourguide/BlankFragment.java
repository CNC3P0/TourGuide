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

public class BlankFragment extends Fragment {

    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        BlankFragment activity = (BlankFragment) getActivity();

        String blurb;
        blurb = activity.getIntent().getExtras().getString("message");
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.blank_fragment, container, false);

        return view;
    }
}