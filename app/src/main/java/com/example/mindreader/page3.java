package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        getSupportActionBar().hide();



        int name[] = {R.drawable.spotify,R.drawable.android,R.drawable.apple,R.drawable.bluetooth,R.drawable.code,R.drawable.github,R.drawable.google,R.drawable.insta,R.drawable.java,R.drawable.js,R.drawable.keybrd,R.drawable.linkdin,R.drawable.mouse,R.drawable.msg,R.drawable.pin,R.drawable.portal,R.drawable.processor,R.drawable.python,R.drawable.react,R.drawable.wifi};

        ImageView chart = findViewById(R.id.chart);
        Random random = new Random();
        int ranImg = random.nextInt(name.length-0)+0;
        chart.setImageResource(name[ranImg]);


        Button nextbtn2 = findViewById(R.id.nextbtn2);
        Intent nextactivity = new Intent(page3.this,MainActivity4.class);
        nextactivity.putExtra("imageAns",name[ranImg]);
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextactivity);
            }
        });
    }
}