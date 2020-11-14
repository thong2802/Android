package com.example.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioButton buoisang;
    RadioButton buoitrua;
    RadioButton buoitoi;
    RadioGroup radioGroup1;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        buoisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You choose Goodmorning", Toast.LENGTH_SHORT).show();
            }
        });

        buoitrua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You choose Goodafternoon", Toast.LENGTH_SHORT).show();
            }
        });

        buoitoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You choose Gooddnight", Toast.LENGTH_SHORT).show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buoisang.isChecked()) {
                    Toast.makeText(MainActivity.this,buoisang.getText(), Toast.LENGTH_SHORT).show();
                }
                if (buoitrua.isChecked()) {
                    Toast.makeText(MainActivity.this,buoitrua.getText(), Toast.LENGTH_SHORT).show();
                }
                if (buoitoi.isChecked()) {
                    Toast.makeText(MainActivity.this,buoitoi.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void Anhxa(){
        buoisang = (RadioButton) findViewById(R.id.radioButton4);
        buoitrua = (RadioButton) findViewById(R.id.radioButton5);
        buoitoi = (RadioButton) findViewById(R.id.radioButton6);
        radioGroup1 = (RadioGroup) findViewById(R.id.radiogroup);
        submit = (Button) findViewById(R.id.button);
    }
}