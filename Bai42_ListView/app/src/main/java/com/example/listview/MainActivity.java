package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewmonhoc;
    ArrayList<String> arrayCourse;
    EditText editTextmonhoc;
    Button buttonthem, buttoncapnhap;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewmonhoc = (ListView) findViewById(R.id.listviewmonhoc);
        editTextmonhoc = (EditText) findViewById(R.id.editTextmonhoc);
        buttonthem = (Button) findViewById(R.id.button);
        buttoncapnhap= (Button) findViewById(R.id.button2);

        arrayCourse = new ArrayList<>();
        arrayCourse.add("Android");
        arrayCourse.add("IOS");
        arrayCourse.add("JAVA");
        arrayCourse.add("KOTLIN");
        arrayCourse.add("JAVASCRIP");
        arrayCourse.add("NODEJS");
        arrayCourse.add("PHP");
        arrayCourse.add("C#");
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,
                                                      android.R.layout.simple_list_item_1,
                                                      arrayCourse);
        listViewmonhoc.setAdapter(arrayAdapter);

        listViewmonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //position trar ve vi tri click tren listview ->0
               // Toast.makeText(MainActivity.this, arrayCourse.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        listViewmonhoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayCourse.get(position), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        buttonthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc = editTextmonhoc.getText().toString();
                arrayCourse.add(monhoc);
            }
        });
        listViewmonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editTextmonhoc.setText(arrayCourse.get(position));
                vitri = position;
            }
        });
        buttoncapnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               arrayCourse.set(vitri, editTextmonhoc.getText().toString());
               arrayAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Ban da cap nhap thanh cong", Toast.LENGTH_SHORT).show();
            }
        });
        listViewmonhoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayCourse.remove(position);
                arrayAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Ban da xoa " + arrayCourse.get(position), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}