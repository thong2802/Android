package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout llMain = (LinearLayout) findViewById(R.id.llmain);
        View view = LayoutInflater.from(this).inflate(R.layout.i_tem_buttom, llMain, false);
        llMain.addView(view);
        // TH1 : View  view = LayoutInflater.from(this).(R.layout.itembuttom, llMain) : sau khi Inflater chuyen doi xml layout file thanh view va attachToRoot mac dinh se true va ket qua
         // itembutton chuyen doi thanh view va add vao llMain ngay sau khi chuyeb doi xong
        // TH2 : Tuong tu nhu TH1 , chu them tuong minh attachToiRoot TRUE;
        // TH3 : attachToRoot thanh false thi sau khi chuyen doi file xml thif se chuyen qua view trong java chu khong LA, CAI GI KHAC.
        // muon chuyen thanh view thi phair goi phuong thuc LLmain.addView(view)
    }
}