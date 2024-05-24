package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Objects;
import java.util.Random;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Objects.requireNonNull(getSupportActionBar()).hide();



        int[] name = {R.drawable.spotify,R.drawable.android,R.drawable.apple,R.drawable.bluetooth,R.drawable.code,R.drawable.github,R.drawable.google,R.drawable.insta,R.drawable.java,R.drawable.js,R.drawable.keybrd,R.drawable.linkdin,R.drawable.mouse,R.drawable.msg,R.drawable.pin,R.drawable.portal,R.drawable.processor,R.drawable.python,R.drawable.react,R.drawable.wifi};

        ImageView chart = findViewById(R.id.chart);
        Random random = new Random();
        int ranImg = random.nextInt(name.length);
        chart.setImageResource(name[ranImg]);


        Button nextBtn2 = findViewById(R.id.nextbtn2);
        Intent nextActivity = new Intent(page3.this,MainActivity4.class);
        nextActivity.putExtra("imageAns",ranImg);
        nextBtn2.setOnClickListener(view -> startActivity(nextActivity));
    }
}