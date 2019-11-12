package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class fankuishangjiawenti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fankuishangjiawenti);
    }
    public void showToast(View view){
        Toast.makeText(this,"提交成功",Toast.LENGTH_SHORT).show();
    }
}
