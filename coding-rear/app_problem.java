package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class app_problem extends AppCompatActivity {

    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_problem);
        btn = (ImageButton) findViewById(R.id.r2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到register演示界面
                Intent intent = new Intent(app_problem.this,lianxiguanliyuan.class);
                startActivity(intent);

            }
        });


        //   !!!!!还需要设计弹窗 提示提交反馈成功!!!!!!!!!!

    }
}

