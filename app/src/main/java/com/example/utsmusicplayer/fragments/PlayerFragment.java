package com.example.utsmusicplayer.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.utsmusicplayer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerFragment extends Fragment {


    public PlayerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_player, container, false);
        Bundle bundle = getArguments();
        String title = bundle.getString("TITLE");
        TextView titleText = (TextView) view.findViewById(R.id.text_title);
        titleText.setText(title);
        return view;
    }

}
