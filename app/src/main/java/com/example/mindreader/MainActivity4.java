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
        int name[] = {R.mipmap.spotify,R.mipmap.android,R.mipmap.apple,R.mipmap.bluetooth,R.mipmap.code,R.mipmap.github,R.mipmap.google,R.mipmap.insta,R.mipmap.java,R.mipmap.js,R.mipmap.keybrd,R.mipmap.linkdin,R.mipmap.mouse,R.mipmap.msg,R.mipmap.pin,R.mipmap.portal,R.mipmap.processor,R.mipmap.python,R.mipmap.react,R.mipmap.wifi};
        if(bundle != null)
        {
            int imageAns = bundle.getInt("imageAns");
            imageView.setImageResource(name[imageAns]);
        }


    }
}