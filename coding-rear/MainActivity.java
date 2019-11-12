package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.test2.R;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private Button btn2;
    private  Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Textview演示界面
                Intent intent = new Intent(MainActivity.this,regActivity.class);
                startActivity(intent);

            }
        });

        btn2 = (Button)findViewById(R.id.forget);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到forget演示界面
                Intent intent = new Intent(MainActivity.this,mima.class);
                startActivity(intent);

            }
        });

        btn3=(Button)findViewById(R.id.Login);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,zhuye.class);
                startActivity(intent);

            }
        });

    }
}
