package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cpgx extends AppCompatActivity {
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpgx);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2=(Button) findViewById(R.id.btn_2);
    }
    public void showToast(View view){
        Toast.makeText(this,"更新成功",Toast.LENGTH_SHORT).show();
    }
    public void showToast1(View view){
        Toast.makeText(this,"删除成功",Toast.LENGTH_SHORT).show();
    }
}