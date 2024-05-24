package com.example.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Objects.requireNonNull(getSupportActionBar()).hide();

        //image view
        ImageView imageView = findViewById(R.id.displayans);
        ImageView globe = findViewById(R.id.imageView2);
        Button btn = findViewById(R.id.tryAgain);
        TextView clickMe = findViewById(R.id.clickme);
        Animation fade = AnimationUtils.loadAnimation(this,R.anim.fade);
        Animation fadeout = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        MediaPlayer imposter = MediaPlayer.create(this,R.raw.imposter);


        Bundle bundle = getIntent().getExtras();

        int[] name = {R.mipmap.spotify,R.mipmap.android,R.mipmap.apple,R.mipmap.bluetooth,R.mipmap.code,R.mipmap.github,R.mipmap.google,R.mipmap.insta,R.mipmap.java,R.mipmap.js,R.mipmap.keybrd,R.mipmap.linkdin,R.mipmap.mouse,R.mipmap.msg,R.mipmap.pin,R.mipmap.portal,R.mipmap.processor,R.mipmap.python,R.mipmap.react,R.mipmap.wifi};


        globe.setOnClickListener(v -> {
            if(bundle != null)
            {
                int imageAns = bundle.getInt("imageAns");
                imageView.setImageResource(name[imageAns]);
            }
            btn.setVisibility(View.VISIBLE);
            btn.setAnimation(fade);
            imageView.setAnimation(fade);
            clickMe.setAnimation(fadeout);
            clickMe.setVisibility(View.INVISIBLE);
            imposter.start();
            imposter.setOnCompletionListener(mediaPlayer -> imposter.reset());
        });
        Intent nextActivity = new Intent(MainActivity4.this,MainActivity.class);
        btn.setOnClickListener(view -> startActivity(nextActivity));


    }
}