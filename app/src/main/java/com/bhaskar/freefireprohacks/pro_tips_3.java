package com.bhaskar.freefireprohacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pro_tips_3 extends AppCompatActivity {
    private Button btn_next_3,btn_previous_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_tips_3);
        btn_next_3 = (Button) findViewById(R.id.go_next_3);
        btn_previous_3 = (Button) findViewById(R.id.go_back_3);
        btn_next_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pro_tips_3.this,pro_tips_4.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
        btn_previous_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pro_tips_3.this,pro_tips_2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });
    }
}