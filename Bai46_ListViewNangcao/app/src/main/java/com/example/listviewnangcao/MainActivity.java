package com.example.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvtraicay;
    ArrayList<Traicay>  arrayTraicay;
    TraicayAdapter traicayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        traicayAdapter = new TraicayAdapter(this, R.layout.line_trai_cay, arrayTraicay);
        lvtraicay.setAdapter(traicayAdapter);

    }
    public void Anhxa() {
        lvtraicay = (ListView) findViewById(R.id.listviewtraicay);
        arrayTraicay = new ArrayList<>();
        arrayTraicay.add(new Traicay("Dau Tay", "Xuat xu Da Lat", R.drawable.dautay));
        arrayTraicay.add(new Traicay("Chuoi", "Xuat xu Da Lat", R.drawable.chuoi));
        arrayTraicay.add(new Traicay("Hong", "Xuat xu Da Lat", R.drawable.hong));
        arrayTraicay.add(new Traicay("Sau Rieng", "Xuat xu Da Lat", R.drawable.saurieng));
        arrayTraicay.add(new Traicay("Xoai", "Xuat xu Da Lat", R.drawable.xoai));
    }


}