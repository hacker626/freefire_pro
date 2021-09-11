package com.bhaskar.freefireprohacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pro_tips_4 extends AppCompatActivity {
    private Button btn_next_4,btn_previous_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_tips_4);
        btn_next_4 = (Button) findViewById(R.id.go_next_4);
        btn_previous_4 = (Button) findViewById(R.id.go_back_4);
        btn_next_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pro_tips_4.this,pro_tips_5.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
        btn_previous_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pro_tips_4.this,pro_tips_3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
    }
}