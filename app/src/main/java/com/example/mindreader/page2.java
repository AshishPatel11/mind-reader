package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Objects.requireNonNull(getSupportActionBar()).hide();


        Button nextBtn = findViewById(R.id.nextbtn);
        Intent nextActivity = new Intent(page2.this,page3.class);
        nextBtn.setOnClickListener(view -> startActivity(nextActivity));
    }
}