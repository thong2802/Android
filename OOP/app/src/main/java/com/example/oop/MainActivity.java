package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SinhVien sinhVien = new SinhVien("NGUYEN DUC THONG", "HCM", 2003);
      //  sinhVien.name = "Nguyen Duc Thong";
       // sinhVien.diachi= "HCM";
       // sinhVien.namsinh = 20001;
        //sinhVien.setNamsinh(2004);

        Toast.makeText(this,sinhVien.getName() +"-" + sinhVien.getDiachi()
                +"-" + sinhVien.getNamsinh(), Toast.LENGTH_SHORT).show();

    }
}