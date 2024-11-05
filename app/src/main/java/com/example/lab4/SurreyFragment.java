package com.example.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SurreyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_surrey, container, false);

        Button button = view.findViewById(R.id.btn_surrey);
        button.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Surrey: Known for its parks and diverse community.", Toast.LENGTH_SHORT).show()
        );

        return view;
    }
}
