package com.bhaskar.freefireprohacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView welcome_text;
    private Animation welcome_text_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        welcome_text = (TextView) findViewById(R.id.welcome_text);
        welcome_text_anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim_up);
        welcome_text.setAnimation(welcome_text_anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,pro_tips.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in_transit,R.anim.fade_in_);
                finish();

            }
        },3700);


    }
}