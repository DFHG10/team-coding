package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shezhi extends AppCompatActivity {
    private Button btn;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shezhi);
        btn = (Button)findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到register演示界面
                Intent intent = new Intent(shezhi.this,MainActivity.class);
                startActivity(intent);

            }
        });
        btn1 = (Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到register演示界面
                Intent intent = new Intent(shezhi.this,huantouxiang.class);
                startActivity(intent);

            }
        });
    }
}
