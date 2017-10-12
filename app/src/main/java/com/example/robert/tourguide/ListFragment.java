package com.example.robert.tourguide;

/**
 * Created by Robert on 10/7/2017.
 */

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListFragment extends Fragment {

    View view;
    ListView listView;
    String[] blurbItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list_fragment, container, false);
        listView = view.findViewById(R.id.pub_list);

        blurbItems = getResources().getStringArray(R.array.blurbs);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("potato", "selected item is: " + blurbItems[i]);
                handleSelection(blurbItems[i]);
            }
        });
        return view;
    }

    public void handleSelection(String i) {
        //Intent intent = new Intent(getActivity(), BlankFragment.class);
        //intent.putExtra("message", blurbItems[i]);
        //startActivity(intent);

        Fragment fragment = new Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("blurbkey", i);
        fragment.setArguments(bundle);
    }


}