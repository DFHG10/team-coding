package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class person extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }
    public void showToast(View view){
        Toast.makeText(this,"当前已是最新版本",Toast.LENGTH_SHORT).show();
    }
    public void showToast1(View view){
        Toast.makeText(this,"本软件由T-MAX团队制作",Toast.LENGTH_SHORT).show();
    }
}
