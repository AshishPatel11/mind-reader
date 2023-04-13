package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().hide();

        //image view
        ImageView imageView = (ImageView) findViewById(R.id.displayans);
        ImageView globe = (ImageView) findViewById(R.id.imageView2);
        Button btn = findViewById(R.id.tryAgain);
        TextView clickme = findViewById(R.id.clickme);
        Animation fade = AnimationUtils.loadAnimation(this,R.anim.fade);
        Animation fadeout = AnimationUtils.loadAnimation(this,R.anim.fadeout);

        Bundle bundle = getIntent().getExtras();

        int name[] = {R.mipmap.spotify,R.mipmap.android,R.mipmap.apple,R.mipmap.bluetooth,R.mipmap.code,R.mipmap.github,R.mipmap.google,R.mipmap.insta,R.mipmap.java,R.mipmap.js,R.mipmap.keybrd,R.mipmap.linkdin,R.mipmap.mouse,R.mipmap.msg,R.mipmap.pin,R.mipmap.portal,R.mipmap.processor,R.mipmap.python,R.mipmap.react,R.mipmap.wifi};


        globe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bundle != null)
                {
                    int imageAns = bundle.getInt("imageAns");
                    imageView.setImageResource(name[imageAns]);
                }
                btn.setVisibility(View.VISIBLE);
                btn.setAnimation(fade);
                imageView.setAnimation(fade);
                clickme.setAnimation(fadeout);
                clickme.setVisibility(View.INVISIBLE);
            }
        });
        Intent nextactivity = new Intent(MainActivity4.this,MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextactivity);
            }
        });


    }
}