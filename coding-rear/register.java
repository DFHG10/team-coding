package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class register extends AppCompatActivity {
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn1 = (Button)findViewById(R.id.to_login);
        btn2=(Button) findViewById(R.id._register);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Textview演示界面
                Intent intent = new Intent(register.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void  showToast (View view){
        Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
    }
}