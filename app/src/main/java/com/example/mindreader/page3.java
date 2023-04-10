package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        getSupportActionBar().hide();

        Button nextbtn2 = findViewById(R.id.nextbtn2);
        Intent nextactivity = new Intent(page3.this,MainActivity4.class);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextactivity);
            }
        });
        int name = R.drawable.spotify;
        ImageView chart = findViewById(R.id.chart);
        chart.setImageResource(name);
    }
}