package com.example.listviewcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ListView lvquocgia;
     ArrayList<quoc_gia> arrayquocgia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvquocgia = (ListView) findViewById(R.id.ll_Main);
        arrayquocgia = new ArrayList<>();
        arrayquocgia.add(new quoc_gia("Viet Nam", "+84"));
        arrayquocgia.add(new quoc_gia("Lao", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Thai Lan", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));
        arrayquocgia.add(new quoc_gia("Mi", "+84"));

        AdapterQuocgia adapterQuocgia = new AdapterQuocgia(
                MainActivity.this,
                 R.layout.dong_quoc_gia,
                 arrayquocgia
        );

        lvquocgia.setAdapter(adapterQuocgia);
    }
}