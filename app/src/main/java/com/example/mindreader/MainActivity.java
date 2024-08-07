package com.example.mindreader;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.startBtn);
        button.setOnClickListener(view -> goToNextActivity());
    }

    public void onBackPressed() {
        finishAffinity();
    }

    public void goToNextActivity() {
        startActivity(new Intent(this, page2.class));
    }
}