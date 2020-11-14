package com.example.bai26_randomhinhnen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
     LinearLayout linearlayout;
     ArrayList<Integer> arrayImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearlayout = (LinearLayout) findViewById(R.id.bacground);
        arrayImage = new ArrayList<Integer>();
        arrayImage.add(R.drawable.android1);
        arrayImage.add(R.drawable.android2);
        arrayImage.add(R.drawable.images);

        Random random = new Random();
        int vitri = random.nextInt(arrayImage.size());
        linearlayout.setBackgroundResource(arrayImage.get(vitri));

    }
}