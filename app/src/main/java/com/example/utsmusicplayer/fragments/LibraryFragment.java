package com.example.utsmusicplayer.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.utsmusicplayer.R;

import org.w3c.dom.Text;

public class LibraryFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NAME = "name";
    // TODO: Rename and change types of parameters
    public LibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_library, container, false);
        Bundle bundle = getArguments();
        if (bundle != null){
            String name = bundle.getString("NAME");
            TextView nameText = (TextView) view.findViewById(R.id.text_search);
            nameText.setText(name);
        }
        return view;
    }

}
