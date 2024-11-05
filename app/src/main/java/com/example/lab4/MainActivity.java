package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonVancouver, buttonSurrey, buttonRichmond, buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVancouver = findViewById(R.id.button_vancouver);
        buttonSurrey = findViewById(R.id.button_surrey);
        buttonRichmond = findViewById(R.id.button_richmond);
//        buttonMain = findViewById(R.id.button_main);

        loadFragmentMain(new MainFragment());

        // Set up click listeners for each button
        buttonVancouver.setOnClickListener(v -> loadFragment(new VancouverFragment()));
        buttonSurrey.setOnClickListener(v -> loadFragment(new SurreyFragment()));
        buttonRichmond.setOnClickListener(v -> loadFragment(new RichmondFragment()));
//        buttonMain.setOnClickListener(v ->
//                Toast.makeText(this, "British Columbia, a province on Canada’s west coast", Toast.LENGTH_SHORT).show()
//        );
    }

    private void loadFragmentMain(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_main_container, fragment)
                .commit();
    }

    // Method to load the selected fragment into the fragment container
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
