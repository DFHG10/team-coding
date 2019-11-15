package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class kaidian extends AppCompatActivity {
    private Button mBtnToast1,mBtnToast2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaidian);
        mBtnToast1=(Button) findViewById(R.id.button_toast_1);
        mBtnToast2=(Button) findViewById(R.id.button_toast_2);
        OnClick onClick=new OnClick();
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_toast_1:
                    Toast.makeText(getApplicationContext(), "上传成功", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button_toast_2:
                    Toast.makeText(getApplicationContext(), "申请成功", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

}
