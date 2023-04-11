package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide();

        //image view
        ImageView imageView = (ImageView) findViewById(R.id.displayans);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            int imageans = bundle.getInt("imageAns");
            imageView.setImageResource(imageans);
        }
    }
}