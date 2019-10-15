package com.example.utsmusicplayer.fragments;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.utsmusicplayer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    ImageButton album1, album2, album3, album4, album5;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView text1 = (TextView) view.findViewById(R.id.text_title1);
        final TextView text2 = (TextView) view.findViewById(R.id.text_title2);
        final TextView text3 = (TextView) view.findViewById(R.id.text_title3);
        final TextView text4 = (TextView) view.findViewById(R.id.text_title4);
        final TextView text5 = (TextView) view.findViewById(R.id.text_title5);
        album1 = view.findViewById(R.id.album1);
        album2 = view.findViewById(R.id.album2);
        album3 = view.findViewById(R.id.album3);
        album4 = view.findViewById(R.id.album4);
        album5 = view.findViewById(R.id.album5);
        album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = text1.getText().toString();
                Bundle titleBundle = new Bundle();
                titleBundle.putString("TITLE", title);
                PlayerFragment playerFragment = new PlayerFragment();
                playerFragment.setArguments(titleBundle);
                replaceFragment(playerFragment);
            }
        });
        album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = text2.getText().toString();
                Bundle titleBundle = new Bundle();
                titleBundle.putString("TITLE", title);
                PlayerFragment playerFragment = new PlayerFragment();
                playerFragment.setArguments(titleBundle);
                replaceFragment(playerFragment);
            }
        });
        album3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = text3.getText().toString();
                Bundle titleBundle = new Bundle();
                titleBundle.putString("TITLE", title);
                PlayerFragment playerFragment = new PlayerFragment();
                playerFragment.setArguments(titleBundle);
                replaceFragment(playerFragment);
            }
        });
        album4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = text4.getText().toString();
                Bundle titleBundle = new Bundle();
                titleBundle.putString("TITLE", title);
                PlayerFragment playerFragment = new PlayerFragment();
                playerFragment.setArguments(titleBundle);
                replaceFragment(playerFragment);
            }
        });
        album5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = text5.getText().toString();
                Bundle titleBundle = new Bundle();
                titleBundle.putString("TITLE", title);
                PlayerFragment playerFragment = new PlayerFragment();
                playerFragment.setArguments(titleBundle);
                replaceFragment(playerFragment);
            }
        });
        return view;
    }

    public void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
