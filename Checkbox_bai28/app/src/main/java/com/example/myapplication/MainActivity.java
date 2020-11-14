package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You choose IOS", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "You bo chon IOS", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You choose Java", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "You bo chon Java", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You choose IOS", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "You bo chon IOS", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monHoc = "Ban da chon mon hoc: \n";
                if (cb1.isChecked()){
                    monHoc += cb1.getText() + "\n";
                }
                if (cb2.isChecked()){
                    monHoc += cb2.getText() + "\n";
                }
                if (cb3.isChecked()){
                    monHoc += cb3.getText() + "\n";
                }
                Toast.makeText(MainActivity.this,monHoc, Toast.LENGTH_SHORT).show();
            }
        });

      }

    public void Anhxa(){
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        btn = (Button) findViewById(R.id.button);
    }
}