package com.example.gridviewcoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gvTen;
    String[] arrayname = {"A","B","C","D","E","F","F","G","H","I","K","L","M","N","O","P","Q","T","V","W","R","U","J"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvTen = (GridView)findViewById(R.id.gridview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(
               MainActivity.this,
               android.R.layout.simple_list_item_1,
               arrayname
        );
        gvTen.setAdapter(arrayAdapter);

        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayname[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}