package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cpgx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpgx);
    }
    public void showToast(View view){
        Toast.makeText(this,"更新成功",Toast.LENGTH_SHORT).show();
    }
    public void showToast1(View view){
        Toast.makeText(this,"删除成功",Toast.LENGTH_SHORT).show();
    }
}
