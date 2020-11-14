package com.example.gridview_appgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvhinhanh;
    ArrayList<Hinhanh> arrayList;
    AdapterHinhanh adapterHinhanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapterHinhanh = new AdapterHinhanh(
            this,
            R.layout.dong_hinh_anh,
            arrayList
        );
        gvhinhanh.setAdapter(adapterHinhanh);

        gvhinhanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void Anhxa(){
        gvhinhanh = (GridView) findViewById(R.id.gridviewhinhanh);
        arrayList = new ArrayList<>();
        arrayList.add(new Hinhanh("Hinh số 1", R.drawable.kotlin));
        arrayList.add(new Hinhanh("Hinh số 1", R.drawable.kotlin));
        arrayList.add(new Hinhanh("Hinh số 2", R.drawable.java));
        arrayList.add(new Hinhanh("Hinh số 2", R.drawable.java));
        arrayList.add(new Hinhanh("Hinh số 3", R.drawable.c));
        arrayList.add(new Hinhanh("Hinh số 3", R.drawable.c));
        arrayList.add(new Hinhanh("Hinh số 4", R.drawable.android));
        arrayList.add(new Hinhanh("Hinh số 4", R.drawable.android));
        arrayList.add(new Hinhanh("Hinh số 5", R.drawable.ruby));
        arrayList.add(new Hinhanh("Hinh số 5", R.drawable.ruby));
        arrayList.add(new Hinhanh("Hinh số 6", R.drawable.docker));
        arrayList.add(new Hinhanh("Hinh số 6", R.drawable.docker));
        arrayList.add(new Hinhanh("Hinh số 7", R.drawable.nodejs));
        arrayList.add(new Hinhanh("Hinh số 7", R.drawable.nodejs));
        arrayList.add(new Hinhanh("Hinh số 8", R.drawable.javascrip));
        arrayList.add(new Hinhanh("Hinh số 9", R.drawable.python));
        arrayList.add(new Hinhanh("Hinh số 9", R.drawable.python));
        arrayList.add(new Hinhanh("Hinh số 9", R.drawable.python));

    }
}