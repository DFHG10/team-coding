package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class kaidian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaidian);
    }
    public void showToast(View view){
        Toast.makeText(this,"上传成功",Toast.LENGTH_SHORT).show();
    }
    public void showToast1(View view){
        Toast.makeText(this,"申请成功",Toast.LENGTH_SHORT).show();
    }
}
