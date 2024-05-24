package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Button button = findViewById(R.id.startBtn);
        button.setOnClickListener(view -> activity2());
    }
    public void onBackPressed(){
        finishAffinity();
    }
    public void activity2(){
        Intent intent = new Intent(this, page2.class);
        startActivity(intent);
    }
}