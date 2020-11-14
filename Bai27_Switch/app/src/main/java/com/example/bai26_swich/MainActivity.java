package com.example.bai26_swich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch =(Switch) findViewById(R.id.switch1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {  // isChecket ==  true
                    Toast.makeText(MainActivity.this,"You turn on wifi", Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(MainActivity.this, "You turn off wifi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}