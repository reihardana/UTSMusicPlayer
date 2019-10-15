package com.example.utsmusicplayer.fragments;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.utsmusicplayer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment{
    private LibraryFragment libraryFragment;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        final TextView text = (EditText) view.findViewById(R.id.inputSearch);
        Button button = (Button) view.findViewById(R.id.buttonSearch);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = text.getText().toString();
                Bundle nameBundle = new Bundle();
                nameBundle.putString("NAME", name);
                LibraryFragment libraryFragment = new LibraryFragment();
                libraryFragment.setArguments(nameBundle);
                replaceFragment(libraryFragment);
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
