package com.example.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class RichmondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_richmond, container, false);

        Button button = view.findViewById(R.id.btn_richmond);
        button.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Richmond: Known for its Asian influence and cultural diversity.", Toast.LENGTH_SHORT).show()
        );

        return view;
    }
}