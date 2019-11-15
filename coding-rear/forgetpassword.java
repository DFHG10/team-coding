package com.example.FZU;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class forgetpassword extends AppCompatActivity {
    private Button mBtnToast1,mBtnToast2;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        mBtnToast1= (Button)findViewById(R.id.btn1);
        mBtnToast2= (Button)findViewById(R.id.btn_2);
        OnClick onClick=new OnClick();
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到forget_password演示界面
                Intent intent = new Intent(forgetpassword.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_2:
                    Toast.makeText(getApplicationContext(), "发送成功，请输入验证码", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}

