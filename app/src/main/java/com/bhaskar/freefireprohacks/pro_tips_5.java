package com.bhaskar.freefireprohacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pro_tips_5 extends AppCompatActivity {
    private Button btn_next_5,btn_previous_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_tips_5);
        btn_next_5 = (Button) findViewById(R.id.go_next_5);
        btn_previous_5 = (Button) findViewById(R.id.go_back_5);
        btn_next_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pro_tips_5.this,end_page_noob.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
        btn_previous_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pro_tips_5.this,pro_tips_4.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
    }
}