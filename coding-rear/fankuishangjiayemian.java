package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class fankuishangjiayemian extends AppCompatActivity {

    private ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fankuishangjiayemian);

        btn = (ImageButton) findViewById(R.id.r4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到register演示界面
                Intent intent = new Intent(fankuishangjiayemian.this,lianxiguanliyuan.class);
                startActivity(intent);

            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"提交成功",Toast.LENGTH_SHORT).show();
    }
}
